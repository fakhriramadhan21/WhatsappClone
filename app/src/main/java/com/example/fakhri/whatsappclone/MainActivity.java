package com.example.fakhri.whatsappclone;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.fakhri.whatsappclone.Preferences.Preferences;
import com.example.fakhri.whatsappclone.models.Data;
import com.example.fakhri.whatsappclone.models.User;
import com.example.fakhri.whatsappclone.services.APIService;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textNama, textStatus, textNomor;
    CircleImageView imgFoto;
    String TAG = "WA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNama= (TextView)findViewById(R.id.nama);
        textStatus= (TextView)findViewById(R.id.status);
        textNomor= (TextView)findViewById(R.id.hohp);
        imgFoto= (CircleImageView)findViewById(R.id.fotoprofil);

        String nama=Preferences.getStringPreference("nama", getApplicationContext());
        String status=Preferences.getStringPreference("status", getApplicationContext());
        String no_telp=Preferences.getStringPreference("no_telp", getApplicationContext());

        textNama.setText(nama);
        textStatus.setText(status);
        textNomor.setText(no_telp);

        String username = Preferences.getStringPreference("username", getApplicationContext());

        final Call<User> userCall = APIService.service.getUser( "fakhri");
        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    Log.d("WA","Berhasil");
                    User userResponse= response.body();
                    if(userResponse.getStatus().equals("Succes")){
                        Data User = userResponse.getData();
                        textNama.setText(User.getNama());
                        textStatus.setText(User.getStatus());
                        textNomor.setText(User.getNoTelp());
                        Preferences.setStringPreference("nama", User.getNama(),getApplicationContext());
                        Preferences.setStringPreference("status", User.getStatus(),getApplicationContext());
                        Preferences.setStringPreference("no_telp", User.getNoTelp(),getApplicationContext());

                        Picasso.get()
                                .load(User.getImg())
                                .into(imgFoto);
                    }
                }
                else {
                    Log.e("WA",response.message());
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}
