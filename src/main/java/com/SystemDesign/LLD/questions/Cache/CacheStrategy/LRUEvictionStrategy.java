package com.SystemDesign.LLD.questions.Cache.CacheStrategy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LRUEvictionStrategy implements CacheEvictionStrategy {
    private final List<String> nodes;
    private final Set<String> keys;

    public LRUEvictionStrategy() {
        this.nodes = new LinkedList<>();
        this.keys = new HashSet<>();
    }

    @Override
    public String getEvictedKey() {
       String keyToBeRemoved=nodes.removeFirst();
       keys.remove(keyToBeRemoved);
       return keyToBeRemoved;
    }

    @Override
    public void keyAccessed(String key) {
        if (keys.contains(key)) {
            nodes.remove(key);
        }
        keys.add(key);
        nodes.addLast(key);
    }
}
