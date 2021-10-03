package com.networknt.schema;

import java.util.ResourceBundle;

/**
 * Created by leaves chen leaves615@gmail.com on 2021/8/23.
 *
 * @author leaves chen leaves615@gmail.com
 */
public class I18nSupport {
    private static final String BASE_NAME = "com.networknt.schema.JsvMessages";
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(BASE_NAME);

    public static String getString(String key) {
        return BUNDLE.getString(key);
    }
}
