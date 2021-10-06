package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;
    private int stackSize = 0;

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);

        if (this.getStackSize() == 0)
        {
            this.setStackSize(1);
        }
        else
        {
            this.setStackSize(stackSize + 1);
        }
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        if (this.getStackSize() > 0)
        {
            this.setStackSize(stackSize - 1);
        }

        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }
}
