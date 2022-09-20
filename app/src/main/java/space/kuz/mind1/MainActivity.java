package space.kuz.mind1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private EditText inputEditText;
        private Button mainButton;
        private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.input_edit_view);
        mainButton = findViewById(R.id.main_button);
        resultTextView = findViewById(R.id.result_text_view);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String originStr = inputEditText.getText().toString();
                String resultString = improveString(originStr);
                resultTextView.setText(resultString);
              //  Toast.makeText(this,"Я тостик",Toast.LENGTH_LONG).show();
            }
        });
    }
     private  String improveString (String result){
        return result.toUpperCase();
     }
}