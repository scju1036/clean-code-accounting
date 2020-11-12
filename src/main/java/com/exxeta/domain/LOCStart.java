package com.exxeta.domain;

import java.util.function.Consumer;

public class LOCStart {

    public static void start(String[] args, Consumer<String> fileNameConsumer) {
        String path = ArgumentReader.getPath(args);
        FolderExplorer.findFileNames(path, fileNameConsumer);
    }
}
