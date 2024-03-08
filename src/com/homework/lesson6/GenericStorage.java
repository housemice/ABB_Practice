package com.homework.lesson6;

import java.util.ArrayList;
import java.util.List;

class GenericStorage<T extends Person> {
    private List<T> items;

    public GenericStorage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("successfully added : "+ item);
    }

    public void removeItem(T item) {
        items.remove(item);
        System.out.println("successfully deleted : "+ item);
    }

    public T searchItem(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void displayAllItems() {
        System.out.println("list of all : ");
        for (T item : items) {
            System.out.println(item);
        }
    }
}