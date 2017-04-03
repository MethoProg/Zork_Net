package main;

import java.util.ArrayList;

class Room {

    private int number;
    private int id_room;
    private String name;
    private String description;
    public ArrayList<String> items = new ArrayList<>();

    public Room(int number, String name, String description,
            ArrayList<String> items) {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setItems(String item) {
        this.items.add(item);
    }

    public void deleteItem(String item) {
        this.items.remove(item);
    }

    public ArrayList<String> getItems() {
        return this.items;
    }
}

class Rooms {

    public static void build(Room[] room, final int size) {

    	// Initialize rooms (a 2D array)
        for (int i = 0; i < size; i++) {
            
                room[i] = new Room(i, "","", null);
            
        }

        room[0].setNumber(1);
        room[0].setName("Living Room");
        room[0].setDescription("You are in your living room.");
        room[0].setItems("wallet");
        room[0].setItems("remote");
        room[0].setItems("phone");

        room[1].setNumber(2);
        room[1].setName("Bedroom");
        room[1].setDescription("You are in your bedroom. Your closet is slightly ajar.");
        room[1].setItems("keys");
        room[1].setItems("flashlight");

        room[2].setNumber(3);
        room[2].setName("Kitchen");
        room[2].setDescription("You are in your kitchen.");
        room[2].setItems("pop tarts");
        room[2].setItems("soda");

        room[3].setNumber(4);
        room[3].setName("Bathroom");
        room[3].setDescription("You are in your bathroom.");
        room[3].setItems("toilet paper");
        room[3].setItems("magazine");
        
       /* room[4].setNumber(5);
        room[4].setName("Garden");
        room[4].setDescription("You are outside of house.");
        room[4].setItems("glob");
        room[4].setItems("knife");*/
    }

    public static void print(Room[] room, int x) {
        if (x>=0){

        System.out.println(room[x].getDescription());
        System.out.println("You see: " + room[x].getItems());
        System.out.println();
        }
        else System.out.println(x);
            
    }

    // Remove item from room when added to inventory
    public static void removeItem(Room[] room, int x, String item) {
    	
    	room[x].deleteItem(item);
    }
}