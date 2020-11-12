package com.exxeta.domain;

public class ArgumentReader {

    public static String getPath(String[] args) {
        /// TODO error handling if path isn't provided
        return args[0];
    }
}
