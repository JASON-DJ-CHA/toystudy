package com.example.carwash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.carwash.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    //    데이터 바인딩 사용하기1
    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


//      데이터바인딩사용하기 2
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up);
        binding





    }
}