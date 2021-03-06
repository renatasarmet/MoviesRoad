package com.example.mariana.moviesroad.main_scene;

import android.text.TextUtils;

/**
 * Created by mariana on 11/10/17.
 */

public class MainPresenter {

    MainView mainView = null;

    public MainPresenter(MainView mainView){
        this.mainView = mainView;
    }

    public void login(String username, String password){
        if(TextUtils.isEmpty(username)){
            //set erro username
            mainView.setErrorUsername();
        }else if(TextUtils.isEmpty(password)){
            //set erro password
            mainView.setErrorPassword();
        }else{
            //efetuar login
            mainView.efetuaLogin();
        }
    }
}
