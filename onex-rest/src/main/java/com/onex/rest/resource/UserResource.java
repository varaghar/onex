/**
 * 
 */
package com.onex.rest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.onex.rest.utils.Constants;
import com.onex.service.components.UserService;
import com.onex.service.components.impl.UserServiceImpl;
import com.onex.service.dto.UserDTO;

/**
 * @author Alexandru.Sabou
 *
 */
@Component
@Path(Constants.URL.USER)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {


	//	@Autowired
	//	private UserService userService;

	@GET
	public List<UserDTO> getUsers() {
		UserService userService = new UserServiceImpl();
		return userService.getUsers();
	}
}
