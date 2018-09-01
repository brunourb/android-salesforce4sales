package br.eti.urbano.mobile.force4sale.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.eti.urbano.mobile.force4sale.R;
import br.eti.urbano.mobile.force4sale.models.Product;
import br.eti.urbano.mobile.force4sale.util.DebugActivity;

public class HomeActivity extends DebugActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void abrirTela(View view) {

        Intent intent = null;
        Bundle bundle = null;

        switch (view.getId()){

            case R.id.btnProduto:
                //call view Product
                Log.i(TAG, "\t\tCall view Product ");

                intent = new Intent(this, ProductActivity.class);
                bundle = new Bundle();
                bundle.putString("nome","Tela de produto");
                intent.putExtras(bundle);
                startActivity(intent);

                break;

            case R.id.btnCategory:
                //call view Category
                Log.i(TAG, "\t\tCall view Category ");

                intent = new Intent(this, ProductActivity.class);
                bundle = new Bundle();
                bundle.putString("nome","Tela de produto");
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.btnUser:
                //call view user
                Log.i(TAG, "\t\tCall view User ");

                intent = new Intent(this, ProductActivity.class);
                bundle = new Bundle();
                bundle.putString("nome","Tela de produto");
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            default:
                Log.e(TAG, "\t\tView not found ");
                Log.e(TAG, String.format("Id: %s",view.getId()));
                break;
        }
    }
}
