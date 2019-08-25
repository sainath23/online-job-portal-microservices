package com.doitgeek.ojp.usermanagementservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_account")
public class UserAccount implements Serializable {

    private static final long serialVersionUID = -1535549060406735783L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_type_id")
    private Long userTypeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "is_active")
    private Character isActive;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "sms_notification_active")
    private Character smsNotificationActive;

    @Column(name = "email_notification_active")
    private Character emailNotificationActive;

    @Column(name = "user_image_path")
    private String userImagePath;

    @Column(name = "registration_date")
    private Date registrationDate;

    @JsonIgnore
    @OneToOne(mappedBy = "userAccount")
    private UserAddress userAddress;

    @JsonIgnore
    @OneToOne(mappedBy = "userAccount")
    private UserLog userLog;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_type_id", insertable = false, updatable = false)
    private UserType userType;

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

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public UserLog getUserLog() {
        return userLog;
    }

    public void setUserLog(UserLog userLog) {
        this.userLog = userLog;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", userTypeId=" + userTypeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", isActive=" + isActive +
                ", contactNumber='" + phoneNumber + '\'' +
                ", smsNotificationActive=" + smsNotificationActive +
                ", emailNotificationActive=" + emailNotificationActive +
                ", userImagePath='" + userImagePath + '\'' +
                ", registrationDate=" + registrationDate +
                ", userAddress=" + userAddress +
                ", userLog=" + userLog +
                ", userType=" + userType +
                '}';
    }
}
