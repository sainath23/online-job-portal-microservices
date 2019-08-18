package com.doitgeek.ojp.usermanagementservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "sms_notification_active")
    private Character smsNotificationActive;

    @Column(name = "email_notification_active")
    private Character emailNotificationActive;

    @Column(name = "user_image_path")
    private String userImagePath;

    @Column(name = "registration_date")
    private Date registrationDate;

    @OneToOne(mappedBy = "userAccount", cascade = CascadeType.PERSIST)
    private UserAddress userAddress;

    @OneToOne(mappedBy = "userAccount", cascade = CascadeType.PERSIST)
    private UserLog userLog;

    @OneToOne
    @JoinColumn(name = "user_type_id")
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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
}
