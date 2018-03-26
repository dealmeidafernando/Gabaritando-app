package br.edu.anhembi.gabaritando;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("RAM", "Tela Principal: onCreate");
        setContentView(R.layout.activity_principal);

        btRegister = (Button) findViewById(R.id.btnregister);

        btRegister.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent register = new Intent(Principal.this,Register.class);
        startActivity(register);
    }
}

