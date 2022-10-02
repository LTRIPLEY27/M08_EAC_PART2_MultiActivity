package isabelcalzadilla.ioc.eac1_2_calzadilla_c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EnterToIOC extends MainActivity {

    private TextView user;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_to_ioc);

        // RECEPCIÓN DEL VALOR DEL NOMBRE USER ENVIADO POR PUTEXTRA DEL OTRO INTENT
        Intent name = getIntent();

        user = findViewById(R.id.user);
        user.setText("Benvingut/da a la IOC  " + name.getStringExtra("getUser"));
    }
}