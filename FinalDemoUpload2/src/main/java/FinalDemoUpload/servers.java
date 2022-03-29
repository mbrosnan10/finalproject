/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalDemoUpload;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import static FinalDemoUpload.Client.selectAction;
import static FinalDemoUpload.servers.objOutStream;
/**
 *
 * @author k00214761
 */ 
public class servers  {
      static ObjectOutputStream objOutStream;
   static ObjectInputStream objInStream; 


   public static void main(String[] args) {
        
   
        ExecutorService exe = Executors.newCachedThreadPool();
 
        System.out.println("Server started....awaiting connections");
        try {
        
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(8000);

            int clientNo = 1; // The number of a client

            while (true) {
                // Listen for a new connection request
                Socket connectToClient = serverSocket.accept();

                InetAddress clientInetAddress = connectToClient.getInetAddress();
                System.out.println("Client " + clientNo + "'s IP Address is " + clientInetAddress.getHostAddress());
 
                // Create a new thread for the connection
                HandleAClient thread = new HandleAClient(connectToClient);

    
                clientNo++;// Increment clientNo
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
   
     
   
}

// Define the thread class for handling a new connection
class HandleAClient implements Runnable {
private static ObjectOutputStream objOutStream;
  private static ObjectInputStream objInStream;
    private Socket connectToClient; // A connected socket

    /**
     * Construct a thread
     */
    public HandleAClient(Socket socket) {
        connectToClient = socket;
    }

    public void run() {
        String line = null;
        System.out.println(line);
        TimerTask task = new Server( new File("weathers.txt") ) {
            protected void onChange( File file ) {
                // here we code the action on a change
                System.out.println( "File "+ file.getName() +" have change !" );
            }
            
            
        };
        Timer timer = new Timer();
        // repeat the check every second
        timer.schedule( task , new Date(), 1000 );
    }


}
