package com.gdstruc.module4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayQueue playerQueue = new ArrayQueue(7);
        int round = 1;
        int playerCount = 1;

        while (round <= 10)
        {
            addPlayers(playerQueue, randomizer(7), playerCount);

            System.out.println("Current Queue:");
            playerQueue.printQueue();
            System.out.println();

            if (playerQueue.size() >= 5)
            {
                System.out.println("Sufficient amount of players!");
                System.out.println("GAME " + round + " START...");
                System.out.println();

                round++;
                continue;
            }
            else
            {
                System.out.println("Insufficient amount of players!");
                System.out.println("QUEUEING AGAIN...");
                System.out.println();

                continue;
            }
        }

            System.out.println();
            System.out.println("10 Games Over... ENDING PROGRAM NOW.");
    }

    private static void addPlayers(ArrayQueue playerQueue, int randomizer, int playerCount) {
        String name = "Player";
        int level = 30;

        for (int i = 0; i < randomizer; i++)
        {
            playerQueue.add(new Player(playerCount, name + playerCount, level));

            playerCount++;
            level += 10;
        }
    }

    private static void removePlayers(ArrayQueue playerQueue)
    {
        for (int i = 0; i < 5; i++)
        {
            playerQueue.remove();
        }
    }

    private static int randomizer(int bound)
    {
        Random rand = new Random();

        int random = 1 + rand.nextInt(bound);

        return random;
    }
}
