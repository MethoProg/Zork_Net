package main;

import java.util.Scanner;

public class Input {
	
    public static String getInput() {
    	
        System.out.print("> ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //input.toLowerCase();
        return input;
    }
}