package com.SystemDesign.LLD.questions.SplitWise;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Group {
    public String groupId;
    public String groupName;
    public List<User> users;
    public Map<String, Map<String, Double>> balances;
    public Map<String, Expense> expenses;

    public void addUser(User user){
        users.add(user);
        balances.put(user.getUserId(),new HashMap<>());
        System.out.println("User is added");
    }

    public void removeUser(String userId){
        users.remove(userId);
    }
}
