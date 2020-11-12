package com.exxeta.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FolderExplorer {

    public static void findFileNames(String path, Consumer<String> fileNameConsumer) {
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {
            walk.map(Object::toString).filter(f -> f.endsWith(".java")).forEach(fileNameConsumer);
            fileNameConsumer.accept(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
