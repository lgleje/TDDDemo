package com.example.zhanglejie_os.tdddemo;

public class SignPresenter implements MvpContract.Presenter {
    MvpContract.MvpView mvpView;

    public SignPresenter(MvpContract.MvpView mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void handleClickSignin() {
        mvpView.onClickSignin();

    }

    @Override
    public void handleClickSignup() {
        mvpView.onClickSighup();
    }
}
