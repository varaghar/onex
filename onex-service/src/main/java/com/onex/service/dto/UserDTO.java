/**
 * 
 */
package com.onex.service.dto;


/**
 * @author Alexandru.Sabou
 *
 */
public class UserDTO {

	private Integer id;

	private String userName;

	private String password;

	private String firstName;

	private String lastName;

	private Byte[] portrait;

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public Byte[] getPortrait() {
		return portrait;
	}

	public void setPortrait(final Byte[] portrait) {
		this.portrait = portrait;
	}

}
