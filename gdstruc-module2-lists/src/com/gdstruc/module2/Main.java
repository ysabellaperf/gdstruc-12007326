package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        // Adding elements to the Array List
        playerList.add(new Player(1, "Asuna", 100));
        playerList.add(new Player(2, "LethalBacon", 205));
        playerList.add(new Player(3, "HPDeskjet", 34));

        // Retrieving a specific element using it's index
        System.out.println(playerList.get(2));

        // Inserting new element at a specific index
        playerList.add(2, new Player(740, "Karen", 66));

        // Removing an element
        playerList.remove(2);

        // Using contains method to look for element
        System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));

        // Using indexOf to find out the index of a specific element
         System.out.println(playerList.indexOf(new Player(2, "LethalBacon", 205)));
        // Simpler for loop vv
        // playerList.forEach(player -> System.out.println(player));

        // Printing whole list
        //for (Player p : playerList)
        //{ System.out.println(p); }
    }
}
