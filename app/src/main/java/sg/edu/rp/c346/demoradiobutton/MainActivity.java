package sg.edu.rp.c346.demoradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get the radioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);

                //Get the id of the selected radio button in the radioGroup
                int selectButtonId = rg.getCheckedRadioButtonId();

                //Get the radio button object from the id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectButtonId);

                //Show a Toast that display the text on the selected tadio button
                Toast.makeText(MainActivity.this,rb.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
