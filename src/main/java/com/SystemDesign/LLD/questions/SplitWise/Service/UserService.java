package com.SystemDesign.LLD.questions.SplitWise.Service;

import com.SystemDesign.LLD.questions.SplitWise.Repository.UserRepository;
import com.SystemDesign.LLD.questions.SplitWise.User;

import java.util.Random;

public class UserService {

    public UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User crateUser(String name, String email) {
        String id = new Random().toString();
        return new User(id, name, email);
    }
}
