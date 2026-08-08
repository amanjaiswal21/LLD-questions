package com.SystemDesign.LLD.questions.Cache;

import com.SystemDesign.LLD.questions.Cache.CacheStrategy.CacheEvictionStrategy;
import com.SystemDesign.LLD.questions.Cache.Storage.CacheStorage;

public class Cache {

    public CacheStorage cacheStorage;
    public CacheEvictionStrategy cacheEvictionStrategy;

    public Cache(CacheStorage cacheStorage, CacheEvictionStrategy cacheEvictionStrategy) {
        this.cacheEvictionStrategy = cacheEvictionStrategy;
        this.cacheStorage = cacheStorage;
    }

    public String get(String key) {
        return cacheStorage.get(key);
    }

    public void put(String key, String value) {
        if (cacheStorage.isFull() && cacheStorage.get(key) == null) {
            String keyToBeRemoved = cacheEvictionStrategy.getEvictedKey();
            cacheStorage.remove(keyToBeRemoved);
        }
        cacheStorage.put(key, value);
        cacheEvictionStrategy.keyAccessed(key);
    }
}
