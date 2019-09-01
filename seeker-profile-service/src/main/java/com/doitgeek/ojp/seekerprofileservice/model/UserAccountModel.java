package com.doitgeek.ojp.seekerprofileservice.model;

import java.util.Date;

public class UserAccountModel {
    private Long id;
    private Long userTypeId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dateOfBirth;
    private Character gender;
    private Character isActive;
    private String phoneNumber;
    private Character smsNotificationActive;
    private Character emailNotificationActive;
    private String userImagePath;
    private Date registrationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Long userTypeId) {
        this.userTypeId = userTypeId;
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

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
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

    public String getUserImagePath() {
        return userImagePath;
    }

    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "UserAccountModel{" +
                "id=" + id +
                ", userTypeId=" + userTypeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", isActive=" + isActive +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", smsNotificationActive=" + smsNotificationActive +
                ", emailNotificationActive=" + emailNotificationActive +
                ", userImagePath='" + userImagePath + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
