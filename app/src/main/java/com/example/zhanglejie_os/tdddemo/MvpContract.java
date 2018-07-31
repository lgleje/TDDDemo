package com.example.zhanglejie_os.tdddemo;

public interface MvpContract {
    public interface Presenter {
        public void handleClickSignin();
        public void handleClickSignup();
    }
    public interface MvpView{
        public void onClickSignin();
        public void onClickSighup();
    }
}
