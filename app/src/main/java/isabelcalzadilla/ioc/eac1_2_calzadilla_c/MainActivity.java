package isabelcalzadilla.ioc.eac1_2_calzadilla_c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // INICIALIZACIÓN DEL BUTTON
        enterButton = findViewById(R.id.enter_button);

        // LLAMADO AL MÉTODO CON EL BUTTON PARA FORZAR EL INTENT
        enterButton.setOnClickListener(this::callToActivityTwo);
    }


    // MÉTODO QUE TOMARÁ LA ACCIÓN DEL BUTTON Y LLAMARÁ A LA SEGUNDA ACTIVITY
    public void callToActivityTwo(View activityTwo){

        Intent actTwo = new Intent(this, MainActivity2.class);

        startActivity(actTwo);
    }
}