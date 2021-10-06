package com.gdstruc.midterm;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int round = 1;
        int action;

        CardStack playerStack = new CardStack();
        CardStack discardedStack = new CardStack();

        //Initializing playerStack
        drawCards(playerStack, 30);

        System.out.println("PLAYER'S STACK: ");
        playerStack.printStack();
        System.out.println();

       while (!playerStack.isEmpty())
       {
           System.out.println("=======================================");
           System.out.println("ROUND: " + round);

           action = randomizer(3);

            if (playerStack.getStackSize() >= 30)
            {
                System.out.print("ACTION: DISCARD CARDS");

                int toDiscard = randomizer(5);

                discardCards(playerStack, discardedStack, toDiscard);
            }
            else
            {
                if (action == 1)
                {
                    System.out.println("ACTION: DRAW CARDS");

                    if (playerStack.getStackSize() >= 30)
                    {
                        System.out.println("\nPLAYER'S STACK is FULL! Cannot draw more cards.");
                    }
                    else
                    {
                        int toAdd = randomizer(5);

                        drawCards(playerStack, toAdd);
                    }
                }
                else if (action == 2)
                {
                    System.out.print("ACTION: DISCARD CARDS");

                    int toDiscard = randomizer(5);

                    discardCards(playerStack, discardedStack, toDiscard);
                }
                else
                {
                    System.out.println("ACTION: GET CARDS FROM DISCARDED STACK");

                    if (discardedStack.isEmpty())
                    {
                        System.out.println(("\nDISCARDED STACK is EMPTY! Cannot draw cards from DISCARDED STACK."));
                    }
                    else
                    {
                        int toGet = randomizer(5);

                        getFromDiscarded(playerStack, discardedStack, toGet);
                    }
                }
           }

           System.out.println("\n\nPLAYER'S STACK:");
           playerStack.printStack();

           System.out.println("\nPLAYER'S STACK SIZE: " + playerStack.getStackSize());

           System.out.println("\nDISCARDED STACK SIZE: " + discardedStack.getStackSize());

           round++;
       }

        System.out.println("\n\n=======================================");
       System.out.println("CONGRATS! Your stack is now empty.");

    }

    private static void drawCards(CardStack playerStack, int toAdd)
    {
        String[] name = new String[10];

        name[0] = "The Emperor";
        name[1] = "The Empress";
        name[2] = "The Fool";
        name[3] = "The Magician";
        name[4] = "The Hierophant";
        name[5] = "The High Priestess";
        name[6] = "The Lovers";
        name[7] = "The Hermit";
        name[8] = "The Devil";
        name[9] = "The Hanged Man";

        int index = 0;

        for (int i = 0; i < toAdd; i++)
        {
            if (index == 10)
            {
                index = 0;
            }

            playerStack.push(new Card(name[index]));

            index++;
        }
    }

    private static void discardCards(CardStack playerStack, CardStack discardedStack, int toDiscard)
    {
        if (playerStack.getStackSize() > toDiscard)
        {
            for (int i = 0; i < toDiscard; i++)
            {
                discardedStack.push(playerStack.pop());
            }
        }
        else if (playerStack.getStackSize() < toDiscard)
        {
            for (int i = 0; i < playerStack.getStackSize(); i++)
            {
                discardedStack.push(playerStack.pop());
            }
        }
    }

    private static void getFromDiscarded(CardStack playerStack, CardStack discardedStack, int toGet)
    {
        if (discardedStack.getStackSize() > toGet)
        {
            for (int i = 0; i < toGet; i++)
            {
                playerStack.push(discardedStack.pop());
            }
        }
        else if (discardedStack.getStackSize() < toGet)
        {
            for (int i = 0; i < discardedStack.getStackSize(); i++)
            {
                playerStack.push(discardedStack.pop());
            }
        }
    }

    private static int randomizer(int bound)
    {
        Random rand = new Random();

        int random = 1 + rand.nextInt(bound);

        return random;
    }
}
