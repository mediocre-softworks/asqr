package org.mediocre.asqr;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SingleQuizActivity extends AppCompatActivity {

    /*
    EditText edit = (EditText)findViewById(R.id.editext1);
    TextView tview = (TextView)findViewById(R.id.textview1);
    String result = edit.getText().toString();
    tview.setText(result);
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_quiz);

        TextView tv = (TextView)findViewById(R.id.QUESTION);
        tv.setText("The question is how much is the fish?");
    }

    /** Called when the user taps the Back button */
    public void startMenu(View view) {
        String toast = new String(getString(R.string.toastBack));
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    /** Called when the user taps the Next button */
    public void quizCheck(View view) {


        EditText edit = (EditText)findViewById(R.id.ANSWER);
        String result = edit.getText().toString();

        TextView tv = (TextView)findViewById(R.id.QUESTION);
        tv.setText(result);

        if (result.equals("rightanswer")){
            String toast = new String(getString(R.string.good));
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
        else{
            String toast = new String(getString(R.string.bad));
            Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
        }
    /** This is a total mess */

    }
}
