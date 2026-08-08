package com.SystemDesign.LLD.questions.Cache.Storage;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCacheStorage implements CacheStorage {

    private final Map<String, String> map;
    private final int capacity;

    public InMemoryCacheStorage(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }

    @Override
    public void put(String key, String value) {
        map.put(key, value);

    }

    @Override
    public boolean isFull() {
        return map.size() == capacity;
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }
}
