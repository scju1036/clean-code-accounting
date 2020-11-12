package com.exxeta.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public static List<String> readFile(String filename) {
        List<String> csv = new ArrayList<>();
        try {
            csv = Files.readAllLines(Path.of(filename));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return csv;
    }

    public static void saveLine(String line) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("accounting.csv"));
            writer.write(line);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
