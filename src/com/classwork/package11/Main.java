package com.classwork.package11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "characters.txt";

        try (Writer writer = new BufferedWriter(new FileWriter(fileName))) {
            String textToWrite = "sadsfd";
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (Reader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder stringBuilder = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                stringBuilder.append((char) character);
            }
            String textRead = stringBuilder.toString();
            System.out.println( textRead);
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }
}
