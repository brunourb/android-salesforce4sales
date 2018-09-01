package br.eti.urbano.mobile.force4sale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.eti.urbano.mobile.force4sale.R;
import br.eti.urbano.mobile.force4sale.util.DebugActivity;

public class ProductActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String texto = bundle.getString("nome");
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
        }
    }
}
