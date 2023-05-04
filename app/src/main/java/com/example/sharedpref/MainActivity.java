package com.example.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtAd; Button btnKaydet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAd = (EditText) findViewById(R.id.txtAd);
        btnKaydet = (Button) findViewById(R.id.btnKaydet);

        SharedPreferences sp = this.getPreferences(Context.MODE_PRIVATE);
        String deger = sp.getString("kullanıcı","");
        txtAd.setText(deger);
    }

    public void Kaydet(){
        String ad = txtAd.getText().toString();
        SharedPreferences sp = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("kullanıcı", ad);
        editor.apply();

    }

}