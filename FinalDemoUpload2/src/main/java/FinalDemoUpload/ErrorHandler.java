/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalDemoUpload;

/**
 *
 * @author k00214761
 */
public class ErrorHandler {
    public static boolean countyValidator(String County){
          if(!County.equals(County)){
            System.out.println("Invaild County");
            return false;
        }
        return true;
    }
    }

