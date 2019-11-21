package com.example.aluguel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btentrar = (Button) findViewById(R.id.btentrar);
        Button btcadastrar =(Button) findViewById(R.id.btcadastrar);
        btcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new Intent(MainActivity.this, cadusuario.class);
                startActivity(cadastrar);
            }
        });
        btentrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent entrar=new Intent(MainActivity.this,cadusuario.class);
                startActivity(entrar);


            }

        });
    }

}
