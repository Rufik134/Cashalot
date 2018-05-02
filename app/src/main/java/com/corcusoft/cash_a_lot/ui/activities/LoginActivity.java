package com.corcusoft.cash_a_lot.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.network.request.LoginRequestBody;

public class LoginActivity extends AppCompatActivity {


    private EditText mUsername,mPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {
        mUsername = findViewById(R.id.edit_text_username);
        mPass = findViewById(R.id.edit_text_pass);
    }

    public void login(View view) {
        if (checkEmptyFields()){
            logIntoAccount();
        }
    }

    private void logIntoAccount() {
        LoginRequestBody requestBody = new LoginRequestBody(
                mUsername.getText().toString(),
                mPass.getText().toString()
        );

    }

    public void toRegistrate(View view) {
        Intent intent = new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }

    private  boolean checkEmptyFields(){
        if (mUsername.getText().length()!=0 && mPass.getText().length()!=0) {
            return  true;
        }
        return false;

    }
}
