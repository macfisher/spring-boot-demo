package com.abc.foo;

public class User
{
    private String firstName;
    private String lastName;
    private String emailAddress;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmailAddress() { return this.emailAddress; }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User {"
                + "firstName='" + firstName + "'"
                + ", lastName='" + lastName + "'"
                + "}";
    }
}
