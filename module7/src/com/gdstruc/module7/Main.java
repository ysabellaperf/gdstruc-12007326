package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {
	Tree tree = new Tree();

    tree.insert(25);
    tree.insert(17);
    tree.insert(29);
    tree.insert(10);
    tree.insert(16);
    tree.insert(-5);
    tree.insert(60);
    tree.insert(55);

    System.out.println("Traversing tree in descending order: ");
    tree.traverseInOrderDescending();
    System.out.println();

    System.out.println("Smallest value in the tree: ");
    System.out.println(tree.getMin());
    System.out.println();
    System.out.println("Largest value in the tree: ");
    System.out.println(tree.getMax());
    }
}
