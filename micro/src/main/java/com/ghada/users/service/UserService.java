package com.ghada.users.service;

import com.ghada.users.entities.Role;
import com.ghada.users.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}