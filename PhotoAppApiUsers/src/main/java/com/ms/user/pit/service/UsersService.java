package com.ms.user.pit.service;


import com.ms.user.pit.shared.UserDto;

public interface UsersService {
	UserDto createUser(UserDto userDetails);
	//UserDto getUserDetailsByEmail(String email);
	//UserDto getUserByUserId(String userId);
}
