package com.example.fakhri.whatsappclone;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fakhri.whatsappclone.models.User;
import com.example.fakhri.whatsappclone.services.APIService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    EditText editUsername, editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editUsername = (EditText)findViewById(R.id.username);
        editPassword = (EditText)findViewById(R.id.password);

    }
    public void login(View view){
        final String username = editUsername.getText().toString();
        final String password = editPassword.getText().toString();
        if(username.equals("")|| password.equals("")){
            Toast.makeText(this,"Username dan password tidak boleh kosong", Toast.LENGTH_SHORT);
        }else {
            ///Call<User> =APIService.service.login(username,password);

            Toast.makeText(this, "berhasil login", Toast.LENGTH_SHORT);
        }
    }

}