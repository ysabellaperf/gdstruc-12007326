package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size = 0;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        if (this.getSize() == 0)
        {
            this.setSize(1);
        }
        else
        {
            this.setSize(size + 1);
        }
    }

    public void removeFromFront()
    {
        PlayerNode toRemove = head;
        head = toRemove.getNextPlayer();
        toRemove.setNextPlayer(null);

        if (this.getSize() > 0)
        {
            this.setSize(size - 1);
        }

    }

    public boolean contains(Player player)
    {
        PlayerNode wanted = new PlayerNode(player);
        PlayerNode current = head;

        boolean status = false;

        for (int i = 0; i <= this.getSize(); i++)
        {
            if (wanted.getPlayer() != current.getPlayer())
            {
                status = false;

                current = current.getNextPlayer();
            }
            else if (wanted.getPlayer() == current.getPlayer())
            {
                status = true;
                break;
            }
        }

       return status;
    }

    public int indexOf(Player player)
    {
        PlayerNode given = new PlayerNode(player);
        PlayerNode current = head;

        int index = 0;

        for (int i = 0; i < this.getSize(); i++)
        {
            if (given.getPlayer() != current.getPlayer())
            {
                current = current.getNextPlayer();

                continue;
            }
            else if (given.getPlayer() == current.getPlayer())
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
