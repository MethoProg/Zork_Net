package main;

import java.util.ArrayList;

class Inventory {
	
	public static void checkItem(int x, String item,
            ArrayList<String> inventory, Room[] room) {
		
		// Check if item is a valid room item
		boolean validRoomItem = false;
		for (String roomItems : room[x].items ) {
			if (roomItems.equals(item)) {
				validRoomItem = true;
				break;
			}
		}
		
		// Check if item is already in inventory
		boolean inInventory = false;
		for (String itemInInv: inventory) {
			if (itemInInv.equals(item)) {
				inInventory = true;
				break;
			}
		}
		
		// Text output
		if (!inInventory && validRoomItem) {
			System.out.println("You pick up the " + item + ".");
			inventory.add(item);
			Rooms.removeItem(room, x, item);
		}
		else if (inInventory) {
			System.out.println("You already have the " + item + ".");
		}
		else if (!validRoomItem) {
			System.out.println("You don't see that here.");
		}
                
		else {
			System.out.println("I don't understand.");
		}
    }

    public static void print(ArrayList<String> inventory) {

        System.out.println("Inventory:");
        for (String item : inventory) {
            System.out.println(item);
        }
    }
}
