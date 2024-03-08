package com.exams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class InventoryManager {
    private static final String FILE_NAME = "C:\\Users\\Daniil\\IdeaProjects\\Test\\src\\com\\exams\\inventory.txt";

    public List<InventoryItem> readInventoryItems() throws FileIOException, InvalidDataException {
        List<InventoryItem> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 4) {
                    throw new InvalidDataException("invalid data format");
                }
                int itemId = Integer.parseInt(parts[0]);
                String name = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                double price = Double.parseDouble(parts[3]);
                items.add(new InventoryItem(itemId, name, quantity, price));
            }
        } catch (FileNotFoundException e) {
            throw new FileIOException("inventory file not foundi");
        } catch (IOException e) {
            throw new FileIOException("error reading from inventory file");
        } catch (NumberFormatException e) {
            throw new InvalidDataException("invalid data format in the inventory file");
        }
        return items;
    }

    public void writeInventoryItems(List<InventoryItem> items) throws FileIOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (InventoryItem item : items) {
                writer.write(item.getItemId() + "," + item.getName() + "," + item.getQuantity() + "," + item.getPrice() + "\n");
            }
        } catch (IOException e) {
            throw new FileIOException("error writing");
        }
    }

    public void addItem(InventoryItem item) throws FileIOException, InvalidDataException {
        List<InventoryItem> items = readInventoryItems();
        items.add(item);
        writeInventoryItems(items);
        System.out.println("successfully added this object : "+item);
    }

    public InventoryItem findItem(int itemId) throws FileIOException, ItemNotFoundException, InvalidDataException {
        List<InventoryItem> items = readInventoryItems();
        for (InventoryItem item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item with ID " + itemId + " not found in inventory.");
    }

    public void updateItem(InventoryItem newItem , InventoryItem upta) throws FileIOException, ItemNotFoundException, InvalidDataException {
        List<InventoryItem> items = readInventoryItems();
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == newItem.getItemId()) {
                items.set(i, newItem);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("Item with ID " + newItem.getItemId() + " not found in inventory.");
        }
        writeInventoryItems(items);
    }

    public void deleteItem(int itemId) throws FileIOException, ItemNotFoundException, InvalidDataException {
        List<InventoryItem> items = readInventoryItems();
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == itemId) {
                System.out.println("deleted item  : "+ findItem(itemId));
                items.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("Item with ID " + itemId + " not found in inventory.");
        }
        writeInventoryItems(items);
    }
}
