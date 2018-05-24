package com.thaihuy.mvpexample.Presenter;

import com.thaihuy.mvpexample.Model.ModelImplPresenter;
import com.thaihuy.mvpexample.Model.ModelLogin;
import com.thaihuy.mvpexample.View.ViewLogin;

public class PresenterLogin implements ModelImplPresenter {
    private ModelLogin modelLogin;
    private ViewLogin viewLogin;

    public PresenterLogin(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }

    public void receiverHandleLogin(String email, String password) {
        modelLogin = new ModelLogin(this);
        modelLogin.handleLogin(email, password);
    }

    @Override
    public void onLoginSuccess() {
        viewLogin.onLoginSuccess();
    }

    @Override
    public void onLoginFailed() {
        viewLogin.onLoginFailed();
    }
}
