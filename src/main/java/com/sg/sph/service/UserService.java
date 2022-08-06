package com.sg.sph.service;

import com.sg.sph.entity.UserInfo;
import com.sg.sph.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public boolean getUserData(String email) {
         UserInfo  userInfo = userRepository.findByEmail(email);
         if (Objects.nonNull(userInfo)) {
             return true;
         }
         return false;
    }

    public UserInfo saveUserData(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    public boolean checkExistingAccount(UserInfo userInfo) {
        UserInfo userInfo1 =  userRepository.findByEmailAndPassword(userInfo.getEmail(),userInfo.getPassword());
        if (Objects.nonNull(userInfo1)) {
            return true;
        }
        return false;
    }

    public boolean forgotPassword(UserInfo userInfo) {
        UserInfo byEmail = userRepository.findByEmail(userInfo.getEmail());
        if (Objects.nonNull(byEmail)) {
            return true;
        }
        return false;
    }
}
