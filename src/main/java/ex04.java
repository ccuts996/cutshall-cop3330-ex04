/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String noun;
        System.out.print(" Enter a noun:");

        noun = input.next();

        String verb;
        System.out.print(" Enter a verb:");

        verb = input.next();

        String adjective;
        System.out.print(" Enter an adjective:");

        adjective = input.next();

        String adverb;
        System.out.print(" Enter an adverb:");

        adverb = input.next();

        System.out.print("Do you " + verb + " " + adjective+ " " + noun + " " + adverb + " " + " ? Thats hilarious!" );

    }
}