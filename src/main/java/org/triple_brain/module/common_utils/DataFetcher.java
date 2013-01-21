package org.triple_brain.module.common_utils;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/*
* Copyright Mozilla Public License 1.1
*/
public class DataFetcher {

    private static String getWebSiteSource(URL url) {
        String output="";
        try {
            URLConnection urlc = url.openConnection();

            BufferedInputStream buffer = new BufferedInputStream(urlc.getInputStream());

            StringBuilder builder = new StringBuilder();
            int byteRead;
            while ((byteRead = buffer.read()) != -1)
                builder.append((char) byteRead);

            buffer.close();

            output= builder.toString();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static JSONObject getJsonFromUrl(URL url){
        try{
            return new JSONObject(getWebSiteSource(url));
        }catch(JSONException e){
            throw new RuntimeException(e);
        }
    }
}
