/*
package com.mynews.service.impl;

import com.mynews.exception.UserNotFoundException;
import com.mynews.model.User;
import com.mynews.repository.UserRepository;
import com.mynews.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user, Long aLong) {
        user.setId(aLong);
        return userRepository.save(user);
    }

    @Override
    public User delete(Long aLong) {
        userRepository.deleteById(aLong);
        return User.builder()
                .id(aLong)
                .build();
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login)
                .orElseThrow(()-> new UserNotFoundException("Пользователь с таким логином не найден"));
    }
}
*/
