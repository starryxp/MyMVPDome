package com.xiaopeng.mymvpdome;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<ILoginView, LoginPresenter> implements ILoginView {


    @Bind(R.id.etPhone)
    EditText etPhone;
    @Bind(R.id.etPwd)
    EditText etPwd;
    @Bind(R.id.btnLogin)
    Button btnLogin;
    @Bind(R.id.tv_content)
    TextView tvContent;

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_main;
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        mPresenter.login(etPhone.getText().toString().trim(), etPwd.getText().toString().trim());
    }

    @Override
    public void setContentText(String content) {
        tvContent.setText(content);
    }
}
