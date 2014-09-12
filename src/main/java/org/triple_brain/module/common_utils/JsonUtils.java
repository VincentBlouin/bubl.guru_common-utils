/*
 * Copyright Vincent Blouin under the Mozilla Public License 1.1
 */

package org.triple_brain.module.common_utils;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.Iterator;

public class JsonUtils {

    public static JSONObject merge(JSONObject object1, JSONObject object2) throws JSONException {
        JSONObject merged = new JSONObject();
        JSONObject[] objs = new JSONObject[]{object1, object2};
        for (JSONObject obj : objs) {
            Iterator it = obj.keys();
            while (it.hasNext()) {
                String key = (String) it.next();
                merged.put(key, obj.get(key));
            }
        }
        return merged;
    }

    public static Boolean containsString(JSONArray array, String string) {
        for (int i = 0; i < array.length(); i++) {
            if (array.optString(i).equals(string)) {
                return true;
            }
        }
        return false;
    }
}
