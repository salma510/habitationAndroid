package com.example.exo2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText t1, t2, t3, t4, output1, output2, output3;
    private CheckBox piscine;
    private Button calculButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des vues
        t3 = findViewById(R.id.t3); // Surface
        t4 = findViewById(R.id.t4); // Nombre de pièces
        piscine = findViewById(R.id.checkbox); // Piscine
        calculButton = findViewById(R.id.calculButton); // Bouton de calcul
        output1 = findViewById(R.id.output1); // Impôt de base
        output2 = findViewById(R.id.output2); // Impôt supplémentaire
        output3 = findViewById(R.id.output3); // Impôt total

        calculButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Récupération des valeurs entrées
                    int surface = Integer.parseInt(t3.getText().toString());
                    int nombrePieces = Integer.parseInt(t4.getText().toString());
                    boolean hasPiscine = piscine.isChecked();

                    // Calcul des impôts
                    int impotBase = surface * 2;
                    int impotSupp = nombrePieces * 50 + (hasPiscine ? 100 : 0);
                    int impotTotal = impotBase + impotSupp;

                    // Affichage des résultats
                    output1.setText(String.valueOf(impotBase));
                    output2.setText(String.valueOf(impotSupp));
                    output3.setText(String.valueOf(impotTotal));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Veuillez entrer des valeurs valides", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}