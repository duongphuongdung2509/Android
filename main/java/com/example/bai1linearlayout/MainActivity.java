package com.example.bai1linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etPass, etUser;
Button btnDangnhap, btnThoat;
TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai1);
        setControl();
        setEvent();
    }

    private void setControl() {
        etPass = (EditText) findViewById(R.id.etPass);
        etUser = (EditText) findViewById(R.id.etUser);
        btnDangnhap = (Button) findViewById(R.id.btnDangnhap);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        txtShow = (TextView) findViewById(R.id.txtShow);
    }

    private void setEvent() {
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPass.setText("");
                etUser.setText("");
                txtShow.setText("");
            }
        });

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtShow.setText("Đăng nhập thành công");
            }
        });
    }
}
