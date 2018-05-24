package com.thaihuy.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.thaihuy.mvpexample.Presenter.PresenterLogin;
import com.thaihuy.mvpexample.View.ViewLogin;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,ViewLogin {

    private Button mLogin;
    private EditText mEmail, mPassword;
    private PresenterLogin presenterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEmail = findViewById(R.id.edEmail);
        mPassword = findViewById(R.id.edPassword);
        mLogin = findViewById(R.id.btnLogin);
        mLogin.setOnClickListener(this);
        presenterLogin = new PresenterLogin(this);
    }

    @Override
    public void onClick(View v) {
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();
        presenterLogin.receiverHandleLogin(email,password);
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailed() {
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    }
}
