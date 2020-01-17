package com.zjb.onebyone;

import java.util.HashMap;
import java.util.Map;

public class Dogs {

    public static final Map<String, Integer> DOG_MAP = new HashMap<String, Integer>()
    {
        {
            put("Yellow", 5);
            put("Black", 3);
            put("Pink", 2);
        }
    };
}
