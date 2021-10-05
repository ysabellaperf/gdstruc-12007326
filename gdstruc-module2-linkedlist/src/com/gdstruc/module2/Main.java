package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

      Player asuna = new Player(1, "Asuna", 100);
      Player lethalBacon = new Player(2, "LethalBacon", 205);
      Player hpDeskjet = new Player(3, "HPDeskjet", 34);

      PlayerLinkedList playerLinkedList = new PlayerLinkedList();

      playerLinkedList.addToFront(asuna);
      playerLinkedList.addToFront(lethalBacon);
      playerLinkedList.addToFront(hpDeskjet);

      System.out.println("Linked List:");
      playerLinkedList.printList();
      System.out.print("Number of elements: ");
      System.out.println(playerLinkedList.getSize());

      playerLinkedList.removeFromFront();

      System.out.println("\nUpdated Linked List:");
      playerLinkedList.printList();
      System.out.print("Number of elements: ");
      System.out.println(playerLinkedList.getSize());

      System.out.print("\nTesting contains(): ");
      System.out.println(playerLinkedList.contains(asuna));

      System.out.print("\nTesting indexOf(): ");
      System.out.println(playerLinkedList.indexOf(asuna));

    }
}
