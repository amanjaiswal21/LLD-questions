package com.SystemDesign.LLD.questions.Cache;

import com.SystemDesign.LLD.questions.Cache.CacheStrategy.CacheEvictionStrategy;
import com.SystemDesign.LLD.questions.Cache.CacheStrategy.LRUEvictionStrategy;
import com.SystemDesign.LLD.questions.Cache.Storage.CacheStorage;
import com.SystemDesign.LLD.questions.Cache.Storage.InMemoryCacheStorage;

public class CacheDemo {
    public static void main(String[] args) {
        int capacity = 3;

        CacheStorage storage = new InMemoryCacheStorage(capacity);
        CacheEvictionStrategy cacheEvictionStrategy = new LRUEvictionStrategy();

        Cache cache = new Cache(storage, cacheEvictionStrategy);

        // Cache: [A]
        cache.put("A", "K");

        // Cache: [A, C]
        cache.put("C", "T");

        // Access A
        // LRU order: [C, A]
        System.out.println("Get A: " + cache.get("A"));

        // Cache: [C, A, L]
        cache.put("L", "M");

        System.out.println("A: " + cache.get("A"));
        System.out.println("C: " + cache.get("C"));
        System.out.println("L: " + cache.get("L"));

        cache.put("N", "C");

        System.out.println("----- After inserting N -----");

        System.out.println("A: " + cache.get("A")); // null (evicted)
        System.out.println("C: " + cache.get("C")); // T
        System.out.println("L: " + cache.get("L")); // M
        System.out.println("N: " + cache.get("N")); // C
    }
}
