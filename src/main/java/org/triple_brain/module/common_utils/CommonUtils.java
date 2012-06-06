package org.triple_brain.module.common_utils;

import java.io.UnsupportedEncodingException;

/*
* Copyright Mozilla Public License 1.1
*/
public class CommonUtils {
    public static String encodeURL(String URL) throws UnsupportedEncodingException {
        return java.net.URLEncoder.encode(URL, "ISO-8859-1");
    }
    public static String decodeURL(String URL) throws UnsupportedEncodingException{
        return java.net.URLDecoder.decode(URL, "ISO-8859-1");
    }
}
