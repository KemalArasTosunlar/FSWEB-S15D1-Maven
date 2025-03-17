package org.example.models;

import java.util.*;

public class Grocery {

    public static List<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startGrocery();
    }

    public static void startGrocery() {
        boolean running = true;
        while (running) {
            System.out.println("0 - Çıkış | 1 - Ekle | 2 - Sil");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // dummy

            switch (choice) {
                case 0:
                    running = false;
                    break;
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz:");
                    String inputToAdd = scanner.nextLine();
                    addItems(inputToAdd);
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz:");
                    String inputToRemove = scanner.nextLine();
                    removeItems(inputToRemove);
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmedItem = item.trim();
            if (!checkItemIsInList(trimmedItem)) {
                groceryList.add(trimmedItem);
            }
        }
        printSorted();
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            String trimmedItem = item.trim();
            if (checkItemIsInList(trimmedItem)) {
                groceryList.remove(trimmedItem);
            } else {
                System.out.println(trimmedItem + " listede bulunamadı.");
            }
        }
        printSorted();
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Güncel Liste: " + groceryList);
    }
}
