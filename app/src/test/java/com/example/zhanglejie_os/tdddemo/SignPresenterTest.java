package com.example.zhanglejie_os.tdddemo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

public class SignPresenterTest {

    @Mock
    private MvpContract.MvpView mvpView;
    private SignPresenter signPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        signPresenter = new SignPresenter(mvpView);
    }

    @Test
    public void handleClickSignin() {
        signPresenter.handleClickSignin();
        verify(mvpView).onClickSignin();
    }

    @Test
    public void handleClickSignup() {
        signPresenter.handleClickSignup();
        verify(mvpView).onClickSighup();
    }
}