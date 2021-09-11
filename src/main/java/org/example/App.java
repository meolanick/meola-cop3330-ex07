/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int length;
        int width;
        double areaSquareFeet;
        double areaSquareMeters;

        System.out.println( "What is the length of the room in feet?" );
        length = scan.nextInt();

        System.out.println("What is the width of the room in feet?");
        width = scan.nextInt();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet." );
        System.out.println("The area is");

        areaSquareFeet = width * length;
        areaSquareMeters = areaSquareFeet * 0.09290304;

        System.out.println( areaSquareFeet + " square feet" );
        System.out.println( areaSquareMeters + " square meters");

    }
}
