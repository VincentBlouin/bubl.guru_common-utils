package org.triple_brain.module.common_utils;

import java.net.MalformedURLException;
import java.net.URL;

/*
* Copyright Mozilla Public License 1.1
*/
public class Urls {
    public static URL get(String url){
        try{
            return new URL(url);
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }
}
