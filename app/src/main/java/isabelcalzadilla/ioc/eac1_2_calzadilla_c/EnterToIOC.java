package isabelcalzadilla.ioc.eac1_2_calzadilla_c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterToIOC extends MainActivity {

    private TextView user;
    private Button btn_web;
    private WebView web;
    private EditText wetToSearch;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_to_ioc);

        // RECEPCIÓN DEL VALOR DEL NOMBRE USER ENVIADO POR PUTEXTRA DEL OTRO INTENT
        Intent name = getIntent();

        user = findViewById(R.id.user);
        user.setText("Benvingut/da a la IOC  " + name.getStringExtra("getUser"));

        btn_web = findViewById(R.id.btn_search);
        btn_web.setOnClickListener(this::searchInternet);
    }

    public void searchInternet(View view){


        web = findViewById(R.id.search);
        wetToSearch = findViewById(R.id.bar_search);
        String searchWeb = wetToSearch.getText().toString();

         //web.getSettings().setJavaScriptEnabled(true);
        web.setEnabled(true);
        web.loadUrl("https://" + searchWeb);

        Intent busqueda = new Intent(Intent.ACTION_VIEW, Uri.parse(web.getUrl()));

    }
}