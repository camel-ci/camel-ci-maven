package com.ci.maven;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World !" );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int useryear = scanner.nextInt();
        System.out.println(Integer.toString(useryear)+ " is"+estBissextile(useryear)+"bissextile");
        scanner.close();
    }

    public static String estBissextile(int year){
    if(year%4==0 && year%100!=0 || year%400==0) {
        return " ";
    }
    else{
        return " not ";
    }

}
}
