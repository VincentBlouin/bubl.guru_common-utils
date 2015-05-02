/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package org.triple_brain.module.common_utils;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

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

    public static byte[] downloadImageAtUrl(URL toDownload) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            byte[] chunk = new byte[4096];
            int bytesRead;
            InputStream stream = toDownload.openStream();

            while ((bytesRead = stream.read(chunk)) > 0) {
                outputStream.write(chunk, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return outputStream.toByteArray();
    }
}
