package isabelcalzadilla.ioc.eac1_2_calzadilla_c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // ATRIBUTOS DE LA CLASE A SER USADOS PARA INTENTS Y DEMÁS

    private Button button;
    private EditText usuari;
    private EditText password;
    private String tesxUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // DEFINICIÓN DEL BUTTON PARA LOGRAR EL INTENT

        button = findViewById(R.id.enter_button);

            // SETTING DEL BUTTON PARA QUE LLAME AL MÉTODO DEL INTENT Y NOS TRASLADE A LA SGUNDA ACTIVITY
        button.setOnClickListener(this::callActivityTwo);

    }


    //MÉTODO PARA LLAMAR A LA SEGUNDA ACTIVITY
    public void callActivityTwo(View activityTwo){

        usuari = findViewById(R.id.usuari);
        tesxUser = usuari.getText().toString();
        password = findViewById(R.id.password);

        String user = usuari.toString();
        String pass = password.toString();

        if(user.length() > 0 && pass.length() > 0){
            // ADICIÓN DEL SEGUNDO ACTIVITY AL INTENT PARA DISPARAR LA ACCIÓN EN CUANTO EL BOTTON SEA LLAMADO
            Intent activityDos = new Intent(this, EnterToIOC.class);

            //LLAMADO AL EDITTEXT PARA PASAR EL PARAMETRO USER MEDIANTE EL ENLAZAMIENTO DE ID A LA SEGUNDA ACTIVITY

            activityDos.putExtra("getUser", tesxUser);
            //MÉTODO 'startActivity' LA ACCIÓN MEDIANTE EL INTENT DE LA ACTIVIDAD 2
            startActivity(activityDos);
            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();

        }


    }


}