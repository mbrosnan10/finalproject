
package FinalDemoUpload;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import FinalDemoUpload.Weather;
public class Client {

    private static Socket socket;
    private static String fileName;
    private static BufferedReader stdin;
    private static PrintStream os;
  static List<Weather> list = new ArrayList();
    public static void main(String[] args) throws IOException {
  
    while(true) {
       
            socket= new Socket("localhost", 8000);
            stdin = new BufferedReader(new InputStreamReader(System.in));
                
     
       ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
         Scanner scanner = new Scanner(System.in);
        os = new PrintStream(socket.getOutputStream());

        try {
              switch (Integer.parseInt(selectAction())) {
            case 1:
                   System.out.print("Enter the word you want to search? ");
                       
                   PrintCounty();
                 break;
            case 2:
                AllCounty();
                break;
           
            case 3:
                getHighest();
                break;
            case 4:
                 fileMod();
                break;
            case 5:
                socket.close();
		System.exit(0);
                break;
	  
        } 
              } catch (Exception e) {
            System.err.println("not valid input");
        }
}
    }


       
    
    public static String selectAction() throws IOException {
        System.out.println("1. get infrom from a county .");
        System.out.println("2. Print out all County");
        System.out.println("3.Get Highest for each place:");
        System.out.println("4. Allow fr textfile to be editied and pop up:");
	System.out.println("5. Exit.");
        System.out.print("Make selection: ");

        return stdin.readLine();
    }

    private static void PrintCounty() throws FileNotFoundException, IOException {
         String line = null;
         int count = 0;
ScheduledExecutorService scheduledexe = Executors.newScheduledThreadPool(1);
   Scanner scanner = new Scanner(System.in);
                 File f1=new File("weathers.txt"); //Creation of File Descriptor for input file
     
                String word = scanner.nextLine().trim();

                FileReader fileReader = new FileReader(f1);

                /* always wrap the FileReader in BufferedReader */
                BufferedReader bufferedReader = new BufferedReader(fileReader);

             BufferedReader freader = new BufferedReader(new FileReader(f1));
	
	while((line = freader.readLine())!= null) {
	String[] st = line.split(" ");
	String County = st[0];

	if(County.equals(word)){
            count++;
            System.out.println(" \t");
	System.out.println(line + count);
        System.out.println(" \t");
	} 


        }
        }

    private static void AllCounty() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("weathers.txt"));
 String line;
 while ((line = br.readLine()) != null) {
          System.out.println(" \t");
   System.out.println(line);
        System.out.println(" \t");
 }
    }


     
    
    

  

    private static void getHighest() throws FileNotFoundException, IOException { 
               String line, word = "";    
        int count = 0, maxCount = 0;    
        ArrayList<String> words = new ArrayList<String>();    
              
        FileReader file = new FileReader("weathers.txt ");    
       
        BufferedReader br = new BufferedReader(file);  
          
        while((line = br.readLine()) != null) {  
            String string[] = line.toLowerCase().split("([,.\\s]+)");  
           
            for(String s : string){  
                words.add(s);  
            }  
        }  
        for(int i = 0; i < words.size(); i++){  
            count = 1;  
            for(int j = i+1; j < words.size(); j++){  
                if(words.get(i).equals(words.get(j))){  
                    count++;  
                }   
            }  
            if(count > maxCount){  
                maxCount = count;  
                word = words.get(i);  
            }  
        }  
          
        System.out.println("Most Weather that has occured: " + word);  
    }

    private static void fileMod() {
           String line = null;
        System.out.println(line);
         TimerTask task = new Server( new File("weathers.txt") ) {
    protected void onChange( File file ) {
      // here we code the action on a change
      System.out.println( "File "+ file.getName() +" have change !" );
    }         
  };
  Timer timer = new Timer();
  timer.schedule( task , new Date(), 1000 );
    }
 
            
    
    
    
    
}          

