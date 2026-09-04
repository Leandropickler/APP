package com.example;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String GOOGLE_URL = "https://www.google.com";
    private static final String FMP_URL = "https://www.fmpsc.edu.br";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGoogle = findViewById(R.id.btn_google);
        Button btnFmp = findViewById(R.id.btn_fmp);

        btnGoogle.setOnClickListener(v -> openUrl(GOOGLE_URL));
        btnFmp.setOnClickListener(v -> openUrl(FMP_URL));
    }

    private void openUrl(String url) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, R.string.cant_open_url, Toast.LENGTH_SHORT).show();
        }
    }
}
