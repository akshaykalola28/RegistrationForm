package com.example.akshay.registrationform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * On click submit button
     */
    public void submitForm(View v) {
        EditText fnview = (EditText) findViewById(R.id.fn_view);
        String firstName = fnview.getText().toString();

        EditText lnview = (EditText) findViewById(R.id.ln_view);
        String lastName = lnview.getText().toString();

        RadioGroup genderGroup = (RadioGroup) findViewById(R.id.gender_view);
        RadioButton rb = (RadioButton) genderGroup.findViewById(genderGroup.getCheckedRadioButtonId());
        //Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();

        EditText cityview = (EditText) findViewById(R.id.city_view);
        String city = cityview.getText().toString();

        EditText stateview = (EditText) findViewById(R.id.state_view);
        String state = stateview.getText().toString();

        EditText emailview = (EditText) findViewById(R.id.email_view);
        String emailID = emailview.getText().toString();

        EditText coNoview = (EditText) findViewById(R.id.co_no);
        String coNumber = coNoview.getText().toString();

        String displayData = "Name: " + firstName + " " + lastName ;
        displayData += "\nGender: " + rb.getText() ;
        displayData += "\nCity: " + city ;
        displayData += "\nState: " + state ;
        displayData += "\nEmail ID: " + emailID ;
        displayData += "\nContact Number: " + coNumber ;

        displayMessage(displayData);

        Toast.makeText(MainActivity.this,"Form has been successfully submitted!!",Toast.LENGTH_SHORT).show();
    }

    public void displayMessage(String display) {
        TextView dispalyView = (TextView) findViewById(R.id.display);
        dispalyView.setText(display);
    }

}
