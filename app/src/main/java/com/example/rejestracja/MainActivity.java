package com.example.rejestracja;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{
    private Button confirmButton;

    private EditText mailForm;
    private EditText passForm;
    private EditText confForm;

    private TextView popUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirmButton = findViewById(R.id.confirmButton);
        mailForm = findViewById(R.id.email);
        passForm = findViewById(R.id.password);
        confForm = findViewById(R.id.confirmpassword);

        popUpText = findViewById(R.id.popUpText);

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String emailInput = mailForm.getText().toString().trim();
                String passInput = passForm.getText().toString().trim();
                String confInput = confForm.getText().toString().trim();

                if(!emailInput.contains("@")) { popUpText.setText("Nieprawidłowy adres e-mail"); return;}
                if(!passInput.equals(confInput)) { popUpText.setText("Hasła się różnią"); return;}

                popUpText.setText("Witaj " + emailInput);
            }
        });

    }
}