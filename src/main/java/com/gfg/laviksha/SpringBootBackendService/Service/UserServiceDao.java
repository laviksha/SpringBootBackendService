package com.gfg.laviksha.SpringBootBackendService.Service;

import com.gfg.laviksha.SpringBootBackendService.Model.User;
import com.gfg.laviksha.SpringBootBackendService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class UserServiceDao {
    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        List<User> users=userRepository.findAll();
        return users;
    }

    public User findUserById(Long id){
       User user=userRepository.findUserById(id);
        return user;
    }

    public User createUser(User user){
        User userCreated=userRepository.save(user);
        return userCreated;
    }

    public User updateUser(User user){
        User userUpdated=userRepository.save(user);
        return userUpdated;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
