package br.eti.urbano.mobile.force4sale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.eti.urbano.mobile.force4sale.R;
import br.eti.urbano.mobile.force4sale.util.DebugActivity;

public class HomeActivity extends DebugActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void abrirTela(View view) {

        switch (view.getId()){
            default:
                Log.i(TAG, String.format("Id: %s",view.getId()));
                break;
        }
    }
}
