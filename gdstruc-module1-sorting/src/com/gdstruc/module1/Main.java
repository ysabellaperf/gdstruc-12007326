package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 36;
        numbers[1] = 12;
        numbers[2] = 4;
        numbers[3] = 88;
        numbers[4] = 44;
        numbers[5] = 27;
        numbers[6] = 10;
        numbers[7] = 90;
        numbers[8] = 1;
        numbers[9] = 67;

        int[] numbers2 = new int[10];

        numbers2[0] = 36;
        numbers2[1] = 12;
        numbers2[2] = 4;
        numbers2[3] = 88;
        numbers2[4] = 44;
        numbers2[5] = 27;
        numbers2[6] = 10;
        numbers2[7] = 90;
        numbers2[8] = 1;
        numbers2[9] = 67;

        System.out.println("Unsorted Array:");
        printArrayElements(numbers);

        modifiedBubbleSort(numbers);
        System.out.println("\n\nAfter Modified Bubble Sort:");
        printArrayElements(numbers);

        modifiedSelectionSort(numbers2);
        System.out.println("\n\nAfter Modified Selection Sort");
        printArrayElements(numbers2);
    }
    private static void modifiedBubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void modifiedSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }

}
