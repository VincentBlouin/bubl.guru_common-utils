/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package guru.bubl.module.common_utils;

import java.net.MalformedURLException;
import java.net.URL;

public class Urls {
    public static URL get(String url){
        try{
            return new URL(url);
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }
}
