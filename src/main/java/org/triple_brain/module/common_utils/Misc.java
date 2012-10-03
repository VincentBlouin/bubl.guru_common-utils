package org.triple_brain.module.common_utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* Copyright Mozilla Public License 1.1
*/
public class Misc {

    private static final String SET_AS_STRING_DELIMITER = ",";
    
    public static Set<String> stringToSet(String setAsString){
        setAsString = removeFirstAndLastCharOfString(setAsString);
        return new HashSet<>(
                Arrays.asList(
                        setAsString.split(SET_AS_STRING_DELIMITER)
                )
        );
    }

    public static String[] setAsStringToArray(String setAsString){
        setAsString = removeFirstAndLastCharOfString(setAsString);
        return setAsString.split(SET_AS_STRING_DELIMITER);
    }
    public static String removeFirstAndLastCharOfString(String string){
        return string.substring(
          1,
          string.length() - 1
        );
    }
}
