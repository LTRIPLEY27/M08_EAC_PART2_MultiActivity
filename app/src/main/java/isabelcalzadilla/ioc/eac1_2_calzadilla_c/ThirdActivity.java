package isabelcalzadilla.ioc.eac1_2_calzadilla_c;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends EnterToIOC {

    private TextView texter;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // LLAMADO AL MÉTODO QUE INICIALIZA Y PRINTA LA ACTIVITY

        startThirdActivity();
    }

    public void startThirdActivity(){
        Intent getting = getIntent();

        texter = findViewById(R.id.uso);
        texter.setText(getting.getStringExtra("parsing"));

        text = findViewById(R.id.receiver);
        text.setText(texter.getText());
    }
}