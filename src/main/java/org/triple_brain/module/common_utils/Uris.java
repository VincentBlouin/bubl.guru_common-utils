package org.triple_brain.module.common_utils;

import java.io.UnsupportedEncodingException;
import java.net.*;

/*
* Copyright Mozilla Public License 1.1
*/
public class Uris {
    public static String encodeURL(String URL){
        try{
            return URLEncoder.encode(URL, "ISO-8859-1");
        }catch(UnsupportedEncodingException e){
            throw new RuntimeException(e);
        }
    }
    public static String encodeURL(URI uri){
        return encodeURL(uri.toString());
    }

    public static String encodeURL(URL url){
        return encodeURL(url.toString());
    }

    public static String decodeUrl(String url){
        try{
            return decodeUrlSafe(
                    url
            );
        }catch(UnsupportedEncodingException e){
            throw new RuntimeException(e);
        }
    }
    public static String decodeUrlSafe(String url) throws UnsupportedEncodingException{
        return URLDecoder.decode(url, "ISO-8859-1");
    }
    public static URI get(String uri){
        try{
            return new URI(uri);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }
}
