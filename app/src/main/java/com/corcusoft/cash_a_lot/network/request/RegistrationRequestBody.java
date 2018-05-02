package com.corcusoft.cash_a_lot.network.request;

/**
 * Created by Rufat on 4/8/18.
 */

public class RegistrationRequestBody {
    private String mNameSurname;
    private String mUsername;
    private String mPassword;
    private String mBirthday;
    private String mNumber;


    /**
     * @Kanan, men burada setter yaratmaga ehtiyac gormedim, onsuzda knstruktorda otururuk datani
     * @param mNameSurname
     * @param mUsername
     * @param mPassword
     * @param mBirthday
     * @param mNumber
     */
    public RegistrationRequestBody(String mNameSurname, String mUsername, String mPassword, String mBirthday, String mNumber) {
        this.mNameSurname = mNameSurname;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
        this.mBirthday = mBirthday;
        this.mNumber = mNumber;
    }
}
