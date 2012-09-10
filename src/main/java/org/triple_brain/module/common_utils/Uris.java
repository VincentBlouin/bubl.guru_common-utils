package org.triple_brain.module.common_utils;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

/*
* Copyright Mozilla Public License 1.1
*/
public class Uris {
    public static String encodeURL(String URL) throws UnsupportedEncodingException {
        return java.net.URLEncoder.encode(URL, "ISO-8859-1");
    }
    public static String decodeURL(String URL) throws UnsupportedEncodingException{
        return java.net.URLDecoder.decode(URL, "ISO-8859-1");
    }
    public static URI get(String uri){
        try{
            return new URI(uri);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }
}
