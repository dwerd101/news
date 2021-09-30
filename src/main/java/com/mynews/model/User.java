package com.mynews.model;

import com.mynews.config.security.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String login;
    private String password;
    private Boolean isActive;
    private Boolean accountNonLocked;
    private Role role;


}
