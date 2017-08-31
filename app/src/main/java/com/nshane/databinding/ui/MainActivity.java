package com.nshane.databinding.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nshane.databinding.R;
import com.nshane.databinding.bean.User;

public class MainActivity extends AppCompatActivity {


    private ImageView iv_avatar;
    private TextView tv_name;
    private TextView tv_desc;
    private Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        login();

    }

    private void login() {
        fill(User.newInstance());
    }

    private void logout() {
        fill(null);
    }

    private void initView() {
        iv_avatar = (ImageView) findViewById(R.id.detail_avatar);
        tv_name = (TextView) findViewById(R.id.detail_name);
        tv_desc = (TextView) findViewById(R.id.detail_desc);
        btn_exit = (Button) findViewById(R.id.detail_action_button);
    }


    private void fill(final User user) {
        int visibility = user != null ? View.VISIBLE : View.GONE;
        if (iv_avatar != null) {
            iv_avatar.setVisibility(visibility);
            if (user != null) {
                iv_avatar.setImageDrawable(getDrawable(user.getAvatar()));
            }
        }

        if (tv_name != null) {
            tv_name.setVisibility(visibility);
            if (user != null) {
                tv_name.setText(user.getName());
            }
        }

        if (tv_desc != null) {
            tv_desc.setVisibility(visibility);
            if (user != null) {
                tv_desc.setText(String.format("积分:%d 等级:%d", user.getScore(), user.getLevel()));
                Log.d("cg", user.getScore() + "|||" + user.getLevel());
            }
        }

        if (btn_exit != null) {
            btn_exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (user == null) login();
                    else logout();
                }
            });

            btn_exit.setText(user == null ? "登陆" : "注销");
        }
    }


}
