package com.thaihuy.mvpexample.Model;

public class ModelLogin {
    private ModelImplPresenter modelImplPresenter;

    public ModelLogin(ModelImplPresenter modelImplPresenter){
        this.modelImplPresenter = modelImplPresenter;
    }

    public void handleLogin(String email, String password) {
        if (email.equals("Huy") && password.equals("123")) {
            modelImplPresenter.onLoginSuccess();
        } else {
            modelImplPresenter.onLoginFailed();
        }

    }
}
