package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        int key_press=-1;
        System.out.print("########################################################\nWelcome in our game for continue press your ID: ");
        do {
             key_press =  key.nextInt();            
        }while (key_press==-1);
        System.out.print("########################################################\n\n");
        // Build rooms
        final int size = 4; //number of rooms
        final int size_player = 4;
        Player[] player = new Player[size_player];
        Players.build(player,size_player);        
        System.out.println("The name of player one is: " + player[key_press].username + "\n With score: " + player[key_press].score +
                "\n Lvl : " +player[key_press].lvl + "\n Moves: " + player[key_press].moves);
        Room[] room = new Room[size];
        Rooms.build(room, size);
        int x = 0; //checked room
        Rooms.print(room, x);
        
        
        

        // Load inventory
        ArrayList<String> inventory = new ArrayList<>();

        // Start game
        boolean playing = true;

        
        while (playing) {
           
            
            

        

            String input = Input.getInput();
            
           // Movement commands     //TODO better
            if (input.equals("go north")) {
                if (x >= 0 && x < 5) {
                    x--;
                    player[key_press].moves++;
                    Rooms.print(room, x);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("go south")) {
                if (x >= 0 && x < 5) {
                    player[key_press].moves++;
                    x++;
                    Rooms.print(room, x);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("go east")) {
                if (x >= 0 && x < 5) {
                    player[key_press].moves++;
                    x--;
                    Rooms.print(room, x);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("go west")) {
                if (x >= 0 && x < 5) {
                    
                   player[key_press].moves++;
                    x++;
                    Rooms.print(room, x);
                } else {
                    System.out.println("You can't go that way.");
                }
            }
                
             
            // Look commands
            else if (input.equals("look")) {
                Rooms.print(room, x);
            }
            
            //moves command
            else if (input.equals("moves?")||input.equals("moves")){
                System.out.print("\nYour moves:" + player[key_press].moves + "\n");
            }
            //score
            else if (input.equals("score?")||input.equals("score")){
                System.out.print("\nYour score:" + player[key_press].score + "\n");
            }
            //WHo are you
            else if (input.equals("whoami"))
                System.out.print("\nYour name:" + player[key_press].username + "\n");

            // Get commands
            else if (input.length() > 4  && input.substring(0, 4).equals("get ")) {
            	if (input.substring(0, input.indexOf(' ')).equals("get")) {
            		if (input.substring(input.indexOf(' ')).length() > 1) {
            			String item = input.substring(input.indexOf(' ') + 1);
                    	Inventory.checkItem(x, item, inventory, room);
                        player[key_press].score+=5;
                        player[key_press].moves++;
            		}	
            	}
            }

            // Inventory commands
            else if (input.equals("i") || input.equals("inv")
                    || input.equals("inventory")) {
                Inventory.print(inventory);
            }
            
            // Use commands
            else if (input.length()>5 && input.substring(0,5).equals("use")){
                
                
            }
            
            // Quit commands
            else if (input.equals("quit")) {
                System.out.println("Goodbye!");
                playing = false;

            // Catch-all for invalid input
            } else {
                System.out.println("You can't do that.");
            }
        }
        System.exit(0);
    }
    
}