/**
 * 
 */
package com.onex.service.components;

import java.util.List;

import com.onex.service.dto.UserDTO;

/**
 * @author Alexandru.Sabou
 *
 */
public interface UserService {

	List<UserDTO> getUsers();
}
