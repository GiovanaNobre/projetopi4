package com.example.aluguel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaentrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaentrar);

        Button cadVendas = (Button)findViewById(R.id.cadVendas);
        cadVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cad = new Intent(getApplicationContext(), CadVeiculos.class);
                startActivity(cad);
            }
        });
    }
}
