package com.xiaopeng.mymvpdome;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by xiaopeng on 2017/10/16.
 */

public class LoginPresenter extends BasePresenter<ILoginView> {

    private Context context;

    public LoginPresenter(BaseActivity context) {
        super(context);
        this.context = context;
    }

    public void login(String phoneNum,String passWord) {

        if (TextUtils.isEmpty(phoneNum)) {
            Toast.makeText(context.getApplicationContext(), "手机号码不能空", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(passWord)) {
            Toast.makeText(context.getApplicationContext(), "密码不能空", Toast.LENGTH_SHORT).show();
            return;
        }

//        Toast.makeText(context.getApplicationContext(), "登陆 手机：" + phoneNum + " 密码：" + passWord, Toast.LENGTH_SHORT).show();

        getView().setContentText("登陆 手机：" + phoneNum + " 密码：" + passWord);
    }

}
