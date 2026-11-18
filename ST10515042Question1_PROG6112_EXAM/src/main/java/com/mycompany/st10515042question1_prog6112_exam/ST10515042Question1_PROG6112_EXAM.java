package com.mycompany.st10515042question1_prog6112_exam;

import java.util.Scanner;

public class ST10515042Question1_PROG6112_EXAM {//start of class

    public static void main(String[] args) {//start of main method
        
        //Scanner: that will allow users to enter data
        Scanner input = new Scanner(System.in);
        
        //Populating arrays:
        String Months[]={"month 1","month 2","month 3"};//single array
        String Product[]={"Cozy Nights Monarch mattress","Restonic Barbados mattress","Sealy Phuket mattress"};//single array
        int Sales[][]=new int [3][3];
        
        //NESTED LOOP: that will require the user to enter data
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number of sales for " + Months[j] + " for " + Product[i] + " : ");
                Sales[i][j] = input.nextInt();
                System.out.println("");
            }
        }
        
        //HEADER:
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("");
        System.out.println("*****************************************************************************");

        
    }//end of main method
}//end of class
