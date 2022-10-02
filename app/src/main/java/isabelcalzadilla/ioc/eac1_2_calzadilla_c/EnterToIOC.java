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

public class EnterToIOC extends MainActivity implements View.OnClickListener {

    private TextView user;
    private Button btn_web, btn_call;
    private WebView web;
    private EditText wetToSearch, numberToCall;

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
        btn_call = findViewById(R.id.btn_caller);

        // LLAMADO A LA ACCION MEDIANTE LOS LISTENERS;
        btn_web.setOnClickListener(this);
        btn_call.setOnClickListener(this);
    }

    // ACTION LISTENER QUE CONTENDRÁ LAS ACCIONES SEGÚN SE PRESIONE EL BUTTON CON UN SWITCH
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_search:
                getInternet();
                break;
            case R.id.btn_caller:
                getCall();
                break;

        }
    }

    //MÉTODO QUE EJECUTA EL INTENT PARA BÚSQUEDA WEB
    public void getInternet(){
        web = findViewById(R.id.search);
        wetToSearch = findViewById(R.id.bar_search);
        String searchWeb = wetToSearch.getText().toString();

        web.setEnabled(true);
        web.loadUrl("https://" + searchWeb);

        Intent busqueda = new Intent(Intent.ACTION_VIEW, Uri.parse(web.getUrl()));
        startActivity(busqueda);
    }

    //MÉTODO QUE EJECUTA EL INTENT PARA LLAMADAS
    public void getCall(){

        numberToCall = findViewById(R.id.make_call);

        String number = numberToCall.getText().toString();

        Intent call = new Intent(Intent.ACTION_CALL, Uri.parse(number));

        startActivity(call);
    }


}