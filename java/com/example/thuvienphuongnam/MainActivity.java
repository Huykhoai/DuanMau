package com.example.thuvienphuongnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thuvienphuongnam.Trangchu.TrangchuActivity;
import com.example.thuvienphuongnam.dao.SachDAO;
import com.example.thuvienphuongnam.dao.ThuThuDao;

public class MainActivity extends AppCompatActivity {
      EditText edUser,edPass;
      Button btnDangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         edUser = findViewById(R.id.login_edusername);
         edPass = findViewById(R.id.login_edpassword);
         btnDangnhap = findViewById(R.id.login_btnlogin);
        ThuThuDao thuThuDao = new ThuThuDao(getApplicationContext());
         btnDangnhap.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String user = edUser.getText().toString();
                 String pass = edPass.getText().toString();
               if(thuThuDao.CheckThuthu(user,pass)){
                   SharedPreferences sharedPreferences =getSharedPreferences("THONGTIN", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("mtt", user);
                        editor.commit();

                        Intent intent = new Intent(getApplicationContext(), TrangchuActivity.class);
                        startActivity(intent);
               }else {
                   Toast.makeText(MainActivity.this, "USer Hoac mat khau khong dung", Toast.LENGTH_SHORT).show();
               }
             }
         });
    }
}