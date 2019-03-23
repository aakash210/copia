package com.example.activity_login;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
        private Button buttonSignIn;
        private EditText editTextEmail;
        private EditText editTextPassword;
        private TextView textViewSignup;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            editTextEmail = (EditText) findViewById(R.id.editTextEmail);
            editTextPassword = (EditText) findViewById(R.id.editTextPassword);
            buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
            textViewSignup = (TextView) findViewById(R.id.textViewSignUp);

            buttonSignIn.setOnClickListener(this);
            textViewSignup.setOnClickListener(this);
        }

