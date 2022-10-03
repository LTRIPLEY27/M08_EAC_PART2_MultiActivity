package isabelcalzadilla.ioc.eac1_2_calzadilla_c;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends EnterToIOC {

    private TextView texter, user;
    private EditText text;
    private Button backing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // LLAMADO AL MÉTODO QUE INICIALIZA Y PRINTA LA ACTIVITY

        startThirdActivity();

        backing = findViewById(R.id.btn_turn_back);
        backing.setOnClickListener(this::getBack);

    }

    public void startThirdActivity(){
        Intent getting = getIntent();

        user = findViewById(R.id.users);
        user.setText("Benvingut/da a la IOC  " + getting.getStringExtra("user"));

        texter = findViewById(R.id.uso);
        texter.setText(getting.getStringExtra("parsing"));

        text = findViewById(R.id.receiver);
        text.setText(texter.getText());
    }


    public void getBack(View callBack){

        Intent back = new Intent(this, EnterToIOC.class);
        startActivity(back);
        Toast.makeText(getApplicationContext(), "Gracias, vuelva pronto", Toast.LENGTH_LONG).show();
    }

}