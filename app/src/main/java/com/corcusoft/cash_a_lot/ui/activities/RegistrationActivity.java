package com.corcusoft.cash_a_lot.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.network.request.RegistrationRequestBody;

public class RegistrationActivity extends AppCompatActivity {


    private EditText mUsername,mNameSurname,mBirthday,mNumber,mPassword;
    private ImageView mCaledarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void registrate(View view) {
        if (checkEmptyFields()) {
            registerAccount();
        }
        else {
            //showToastMessage
        }
    }

    private void registerAccount() {
        RegistrationRequestBody requestBody = new RegistrationRequestBody(
                mNameSurname.getText().toString(),
                mUsername.getText().toString(),
                mPassword.getText().toString(),
                mBirthday.getText().toString(),
                mNumber.getText().toString()
        );

    }

    private boolean checkEmptyFields() {
        if (mUsername.getText().length()!=0
                && mNameSurname.getText().length()!=0
                && mBirthday.getText().length()!=0
                && mNumber.getText().length()!=0
                && mPassword.getText().length()!=0 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
