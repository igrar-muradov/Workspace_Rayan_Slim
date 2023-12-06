package com.ltp.workbook31;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class User {

    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "First name is too short")
    private String firstName;
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "Last name is too short")
    private String lastName;
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 7, message = "Username name is too short")
    private String userName;
    @Email
    private String email;
    @Past(message = "Birthdate should be in the past")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    public User() {
    }

    public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {


        this.firstName = firstName;

        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
