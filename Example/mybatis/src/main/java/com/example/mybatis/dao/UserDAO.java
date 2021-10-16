package com.example.mybatis.dao;

import com.example.mybatis.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDAO {
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
}
