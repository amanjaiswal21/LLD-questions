package com.SystemDesign.LLD.questions.Cache.CacheStrategy;

public interface CacheEvictionStrategy {
    String getEvictedKey();

    void keyAccessed(String key);
}
