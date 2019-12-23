package com.zjb.factory;

import java.util.HashMap;
import java.util.Map;

public class UserFactory {

    private static Map<String, User> userMap = new HashMap<>();

    public static User getUserByType(String type) {
        return userMap.get(type);
    }

    public static void regist(String type, User user) {
        userMap.put(type, user);
    }
}
