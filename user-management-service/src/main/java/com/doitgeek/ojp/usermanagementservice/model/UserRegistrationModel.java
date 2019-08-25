package com.doitgeek.ojp.usermanagementservice.model;

import com.doitgeek.ojp.usermanagementservice.annotation.Flag;
import com.doitgeek.ojp.usermanagementservice.annotation.Gender;
import com.doitgeek.ojp.usermanagementservice.constant.MessageConstant;
import com.doitgeek.ojp.usermanagementservice.entity.UserAccount;
import com.doitgeek.ojp.usermanagementservice.entity.UserAddress;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class UserRegistrationModel {

    @NotBlank(message = MessageConstant.USER_TYPE_REQUIRED)
    private String userType;

    @NotBlank(message = MessageConstant.FIRST_NAME_REQUIRED)
    @Size(max = 50, message = MessageConstant.FIRST_NAME_VALID)
    private String firstName;

    @NotBlank(message = MessageConstant.LAST_NAME_REQUIRED)
    @Size(max = 50, message = MessageConstant.LAST_NAME_VALID)
    private String lastName;

    @NotBlank(message = MessageConstant.EMAIL_REQUIRED)
    @Email(message = MessageConstant.EMAIL_VALID)
    private String email;

    @NotBlank(message = MessageConstant.PASSWORD_REQUIRED)
    @Size(min = 6, max = 25, message = MessageConstant.PASSWORD_VALID)
    private String password;

    @NotNull(message = MessageConstant.DOB_REQUIRED)
    @JsonFormat(pattern = "dd-MMM-yyyy")
    private Date dateOfBirth;

    @NotNull(message = MessageConstant.GENDER_REQUIRED)
    @Gender
    private Character gender;

    @NotBlank(message = MessageConstant.PHONE_NO_REQUIRED)
    @Pattern(regexp = "^\\d{4,15}$", message = MessageConstant.PHONE_NO_VALID)
    private String phoneNumber;

    @NotNull(message = MessageConstant.SMS_NOTIFICATION_REQUIRED)
    @Flag
    private Character smsNotificationActive;

    @NotNull(message = MessageConstant.EMAIL_NOTIFICATION_REQUIRED)
    @Flag
    private Character emailNotificationActive;

    @NotBlank(message = MessageConstant.STREET_ADDRESS_REQUIRED)
    @Size(max = 100, message = MessageConstant.STREET_ADDRESS_VALID)
    private String streetAddress;

    @NotBlank(message = MessageConstant.CITY_REQUIRED)
    @Size(max = 50, message = MessageConstant.CITY_VALID)
    private String city;

    @NotBlank(message = MessageConstant.STATE_REQUIRED)
    @Size(max = 50, message = MessageConstant.STATE_VALID)
    private String state;

    @NotBlank(message = MessageConstant.ZIP_REQUIRED)
    @Size(max = 20, message = MessageConstant.ZIP_VALID)
    private String zip;

    @NotBlank(message = MessageConstant.COUNTRY_REQUIRED)
    @Size(max = 50, message = MessageConstant.COUNTRY_VALID)
    private String country;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Character getSmsNotificationActive() {
        return smsNotificationActive;
    }

    public void setSmsNotificationActive(Character smsNotificationActive) {
        this.smsNotificationActive = smsNotificationActive;
    }

    public Character getEmailNotificationActive() {
        return emailNotificationActive;
    }

    public void setEmailNotificationActive(Character emailNotificationActive) {
        this.emailNotificationActive = emailNotificationActive;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserAccount getUserAccount() {
        UserAccount userAccount = new UserAccount();
        userAccount.setFirstName(firstName);
        userAccount.setLastName(lastName);
        userAccount.setEmail(email);
        userAccount.setPassword(password);
        userAccount.setDateOfBirth(dateOfBirth);
        userAccount.setGender(gender);
        userAccount.setPhoneNumber(phoneNumber);
        userAccount.setSmsNotificationActive(smsNotificationActive);
        userAccount.setEmailNotificationActive(emailNotificationActive);
        return userAccount;
    }

    public UserAddress getUserAddress() {
        UserAddress userAddress = new UserAddress();
        userAddress.setStreetAddress(streetAddress);
        userAddress.setCity(city);
        userAddress.setState(state);
        userAddress.setZip(zip);
        userAddress.setCountry(country);
        return userAddress;
    }
}
