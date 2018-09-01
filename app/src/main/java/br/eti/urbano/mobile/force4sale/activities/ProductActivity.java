package br.eti.urbano.mobile.force4sale.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.eti.urbano.mobile.force4sale.R;
import br.eti.urbano.mobile.force4sale.util.DebugActivity;

public class ProductActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }
}
