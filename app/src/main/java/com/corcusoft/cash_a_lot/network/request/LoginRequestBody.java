package com.corcusoft.cash_a_lot.network.request;

/**
 * Created by Rufat on 4/8/18.
 */

public class LoginRequestBody {
    private String mUsername;
    private String mPassword;

    public LoginRequestBody(String mUsername, String mPassword) {
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }
}
