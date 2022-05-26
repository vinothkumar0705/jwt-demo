package com.demo.user.ui.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

    @NotNull(message = "firstname can not be null")
    @Size(min = 2, message = "name cannot be less than 2 character")
    private String firstName;
    @NotNull(message = "lastname can not be null")
    @Size(min = 2, message = "last name cannot be less than 2 character")
    private String lastName;
    @NotNull(message = "password can not be null")
    @Size(min = 6, max = 16, message = "password length does not match")
    private String password;
    @NotNull(message = "email can not be null")
    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


