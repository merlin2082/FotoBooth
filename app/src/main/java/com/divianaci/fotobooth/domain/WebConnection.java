package com.divianaci.fotobooth.domain;

/**
 * Created by Merlin on 2/1/2015.
 */
public class WebConnection {
    private String urlString;
    private String loginName;
    private String loginPassword;

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
