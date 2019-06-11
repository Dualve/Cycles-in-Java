package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for(int i =0; i < 10; i++){
            System.out.println("Amount: " + i);
        }

        System.out.println(" ");
        int amount = 10;
        while(true){
            if(amount != 0){
                System.out.println(amount + " time to explosion");
                amount--;
            }
            else
                break;
        }

        System.out.println(" ");
        do{
            amount++;
        } while (amount < 10);

        System.out.println("Time was restarted - " + amount);
    }

}