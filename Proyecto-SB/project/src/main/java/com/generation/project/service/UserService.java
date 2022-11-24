package com.generation.project.service;

import com.generation.project.model.User;

public interface UserService {
    
    User getUser (Integer id);

    User save (User user);

    void delete (Integer id);
}
