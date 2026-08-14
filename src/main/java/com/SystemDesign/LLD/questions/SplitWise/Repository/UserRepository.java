package com.SystemDesign.LLD.questions.SplitWise.Repository;

import com.SystemDesign.LLD.questions.SplitWise.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    public Map<String, User>userMap;

    public UserRepository(){
        userMap=new ConcurrentHashMap<>();
    }

}
