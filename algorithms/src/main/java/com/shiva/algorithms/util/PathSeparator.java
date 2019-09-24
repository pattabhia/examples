package com.shiva.algorithms.util;

public class PathSeparator {

    private final static String BACK_SLASH = "/";
    private final static String FORWARD_SLASH = "\\\\";

    public static String[] split(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Missing Input String!");
        }
        input = replaceForwardSlashWithBackSlash(input);
        return input.split(BACK_SLASH);
    }

    private static String replaceForwardSlashWithBackSlash(String input) {
        return input.replaceAll(FORWARD_SLASH, BACK_SLASH);
    }

    public static String split(String input, int offset) {
        String[] splitPath = split(input);
        if (splitPath.length > offset) {
            return splitPath[offset];
        }
        return null;
    }
}
