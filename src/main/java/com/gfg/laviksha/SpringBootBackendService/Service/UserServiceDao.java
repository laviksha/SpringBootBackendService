package com.gfg.laviksha.SpringBootBackendService.Service;

import com.gfg.laviksha.SpringBootBackendService.Model.User;
import com.gfg.laviksha.SpringBootBackendService.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class UserServiceDao {
    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        List<User> users=userRepository.findAll();
        return users;
    }

    public User findUserById(Long id){

       Optional<User> user=userRepository.findById(id);
        log.debug("User  with id:{} is {} ",id,user.get());
        return user.get();
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
