package com.example.a20200140050_act1_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignIn);

        //Menghuhbungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email ke dalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password ke dalam variabel password
                password = edpassword.getText().toString();

                if (nama.equals("fachreza.ft20@mail.umy.ac.id")&&password.equals("inipassword")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Berhasil",Toast.LENGTH_LONG).show();

                }
                else if (password.equals("inipassword")) {
                    //jika Email salah
                    Toast.makeText(getApplicationContext(), "Email yang anda masukkan salah", Toast.LENGTH_LONG).show();

                }
                else if (nama.equals("fachreza.ft20@mail.umy.ac.id")) {
                    //jika Password salah
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();

                }
                else {
                    //jika email dan password salah
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}