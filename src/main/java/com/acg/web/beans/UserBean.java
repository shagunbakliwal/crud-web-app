package com.acg.web.beans;

import org.springframework.util.StringUtils;

import com.acg.common.beans.ErrorMessageBean;
import com.acg.common.collection.ErrorMessageCollection;
import com.acg.common.tags.interfaces.ClearableBean;
import com.acg.common.tags.interfaces.ValidatableBean;

public class UserBean implements ClearableBean, ValidatableBean {

	private String username = "";
	private String firstName = "";
	private String lastName = "";
	private String email = "";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ErrorMessageCollection validate() {
		ErrorMessageCollection errorMessageCollection = new ErrorMessageCollection();
		ErrorMessageBean errorMessageBean = null;
		if (StringUtils.isEmpty(username)) {
			errorMessageBean = new ErrorMessageBean("Please provide valid username!");
			errorMessageCollection.setErrorMessage("user.username", errorMessageBean);
		}
		if (StringUtils.isEmpty(firstName)) {
			errorMessageBean = new ErrorMessageBean("Please provide first name!");
			errorMessageCollection.setErrorMessage("user.firstName", errorMessageBean);
		}
		if (StringUtils.isEmpty(lastName)) {
			errorMessageBean = new ErrorMessageBean("Please provide last name!");
			errorMessageCollection.setErrorMessage("user.lastName", errorMessageBean);
		}
		if (StringUtils.isEmpty(email)) {
			
			errorMessageBean = new ErrorMessageBean("Please provide valid email id!");
			errorMessageCollection.setErrorMessage("user.email", errorMessageBean);
		}
		return errorMessageCollection;
	}

	public void clear() {
		username = "";
		firstName = "";
		lastName = "";
		email = "";
	}

}
