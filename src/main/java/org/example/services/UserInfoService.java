package org.example.services;

import org.example.entities.UserInfo;
import org.example.repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    public List<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }

    public UserInfo getUserById(int id) {
        return userInfoRepository.findById(id).get();
    }

    public UserInfo getUserByLogin(String login) {
        return getAllUsers().stream().filter(e->e.getLogin().equals(login)).findFirst().get();
    }

    public void addUser(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }
}
