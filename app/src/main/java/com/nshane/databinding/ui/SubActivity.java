package com.nshane.databinding.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nshane.databinding.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lbl on 2017/5/23.
 */

public class SubActivity extends AppCompatActivity {
    @BindView(R.id.detail_avatar)
    ImageView detailAvatar;
    @BindView(R.id.detail_name)
    TextView detailName;
    @BindView(R.id.detail_desc)
    TextView detailDesc;
    @BindView(R.id.detail_action_button)
    Button detailActionButton;
    private ViewDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sub);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub);
        ButterKnife.bind(this);

//        login();
    }

//    private void login() {
//        fill(User.newInstance());
//    }

//    private void fill(User user) {
//        int visibility = user!=null? View.VISIBLE:View.GONE;
//        if (user!=null){
//            binding.
//        }
//    }


}
