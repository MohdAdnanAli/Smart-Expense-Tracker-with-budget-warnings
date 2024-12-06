package com.expense.dto;

public class UserDTO {

    private int userId;
    private String userName;
    private String password;
    private String securityQuestion;

    public UserDTO() {}

    public UserDTO(int userId, String userName, String password, String securityQuestion) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.securityQuestion = securityQuestion;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }
}
