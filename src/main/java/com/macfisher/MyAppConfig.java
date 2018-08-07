package com.macfisher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig
{
    private String appName;
    private String appDescription;
    private String adminFirstName;
    private String adminLastName;
    private String adminEmail;

    public String getappName() { return this.appName; }
    public void setAppName(String appName) { this.appName = appName; }

    public String getAppDescription() { return this.appDescription; }
    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAdminFirstName() { return this.adminFirstName; }
    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() { return this.adminLastName; }
    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() { return this.adminEmail; }
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "MyAppConfig { "
                + "appName='" + this.appName + "'"
                + ", appDescription='" + this.appDescription + "'"
                + ", adminFirstName='" + this.adminFirstName + "'"
                + ", adminLastName='" + this.adminLastName + "'"
                + ", adminEmail='" + this.adminEmail + "'"
                + " }";
    }
}
