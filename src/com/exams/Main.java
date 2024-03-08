package com.exams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        try {
            System.out.println("_____________________________________________________________");
            manager.addItem(new InventoryItem(1, "ote1", 133, 56.3));
        } catch (FileIOException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("_____________________________________________________________");
            manager.readInventoryItems();
            System.out.println(manager.findItem(1));
        } catch (FileIOException | ItemNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("_____________________________________________________________");
            manager.readInventoryItems();
            InventoryItem item = manager.findItem(1);
            manager.updateItem(item,new InventoryItem(2,"zuleyhaaa",32,3));
        } catch (FileIOException | ItemNotFoundException | InvalidDataException e) {
            e.printStackTrace();
        }

        try {
            manager.deleteItem(2);
        } catch (FileIOException | ItemNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }
    }
}
