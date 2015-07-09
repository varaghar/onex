/**
 * 
 */
package com.onex.service.components.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onex.repository.dao.UserRepository;
import com.onex.repository.model.User;
import com.onex.service.components.UserService;
import com.onex.service.dto.UserDTO;
import com.onex.util.DozerMapper;

/**
 * @author Alexandru.Sabou
 *
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private DozerMapper dozzer;

	@Autowired
	private UserRepository userRepo;

	@Override
	@Transactional(readOnly = true)
	public List<UserDTO> getUsers() {
		List<User> userList = userRepo.findAll();
		return dozzer.mapListObject(userList, UserDTO.class);
	}

}
