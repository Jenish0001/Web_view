package com.example.web_view.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.example.web_view.R;

public class Web_View extends AppCompatActivity {
    WebView web_view;
    private TextView txt_view_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        blinding();
        String link=getIntent().getStringExtra("n1");
        String title=getIntent().getStringExtra("n2");

        web_view.loadUrl(link);

        web_view.setWebViewClient(new WebViewClient());
        web_view.getSettings().setJavaScriptEnabled(true);

        txt_view_s.setText(title);
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
    }

    private void blinding() {

        web_view = findViewById(R.id.web_view);
        txt_view_s = findViewById(R.id.txt_view_s);
    }

    @Override
    public void onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack();
        } else {
            super.onBackPressed();
        }

    }
}