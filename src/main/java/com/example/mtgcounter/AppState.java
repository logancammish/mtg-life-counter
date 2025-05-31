package com.example.mtgcounter;

import java.util.HashMap;
import java.util.Map;

public class AppState {
    private static final AppState instance = new AppState();
    private final Map<String, Object> variables = new HashMap<>();

    private AppState() {

    }

    public static AppState getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        variables.put(key, value);
    }

    public Object get(String key) {
        return variables.get(key);
    }
}