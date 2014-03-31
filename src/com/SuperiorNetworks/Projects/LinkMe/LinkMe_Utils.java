package com.SuperiorNetworks.Projects.LinkMe;

public class LinkMe_Utils {
    public static final char ESCAPE = '\u00A7';
    public static String replaceColors(String text) {
        char[] chrarray = text.toCharArray();
        for (int index = 0; index < chrarray.length; index ++) {
            char chr = chrarray[index];
            if (chr != '&') {
                continue;
            }
            if ((index + 1) == chrarray.length) {
                break;
            }
            char forward = chrarray[index + 1];
            if ((forward >= '0' && forward <= '9') || (forward >= 'a' && forward <= 'f') || (forward >= 'k' && forward <= 'r')) {
                chrarray[index] = ESCAPE;
            }
        }
        return new String(chrarray);
    }
}