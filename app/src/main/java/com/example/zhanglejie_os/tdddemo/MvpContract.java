package com.example.zhanglejie_os.tdddemo;

public interface MvpContract {
    interface Presenter {
        void handleClickSignin();
        void handleClickSignup();
    }
    interface MvpView{
        void onClickSignin();
        void onClickSighup();
    }
}
