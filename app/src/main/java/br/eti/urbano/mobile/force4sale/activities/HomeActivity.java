package br.eti.urbano.mobile.force4sale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.eti.urbano.mobile.force4sale.R;

public abstract class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void abrirTela(View view) {

        switch (view.getId()){
            default:

        }
    }
}
