package internship.demo.model;


import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private int id;
    private String username;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private boolean passwordResetRequired;
    private String email;
    private String contact;
    private String expirationDate;
    private String description;
    private int timeout;
    private String dateTimeFormat;
    private String roleNameList;
    private String scopeNameList;
    private String primaryGroupName;
    private String secondaryGroupNameList;
    private String language;
    private String organization;
    private String timeZone;
    private String memo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public boolean isPasswordResetRequired() {
        return passwordResetRequired;
    }

    public void setPasswordResetRequired(boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }

    public String getRoleNameList() {
        return roleNameList;
    }

    public void setRoleNameList(String roleNameList) {
        this.roleNameList = roleNameList;
    }

    public String getScopeNameList() {
        return scopeNameList;
    }

    public void setScopeNameList(String scopeNameList) {
        this.scopeNameList = scopeNameList;
    }

    public String getPrimaryGroupName() {
        return primaryGroupName;
    }

    public void setPrimaryGroupName(String primaryGroupName) {
        this.primaryGroupName = primaryGroupName;
    }

    public String getSecondaryGroupNameList() {
        return secondaryGroupNameList;
    }

    public void setSecondaryGroupNameList(String secondaryGroupNameList) {
        this.secondaryGroupNameList = secondaryGroupNameList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    // Getters and Setters
    // (Auto-generate these using your IDE or write them manually)

    // toString method for easy logging and debugging
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", passwordResetRequired=" + passwordResetRequired +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", description='" + description + '\'' +
                ", timeout=" + timeout +
                ", dateTimeFormat='" + dateTimeFormat + '\'' +
                ", roleNameList='" + roleNameList + '\'' +
                ", scopeNameList='" + scopeNameList + '\'' +
                ", primaryGroupName='" + primaryGroupName + '\'' +
                ", secondaryGroupNameList='" + secondaryGroupNameList + '\'' +
                ", language='" + language + '\'' +
                ", organization='" + organization + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
