package com.SystemDesign.LLD.questions.Cache.Storage;

public interface CacheStorage {
    String get(String key);

    void put(String key, String value);

    boolean isFull();

    void remove(String key);
}
