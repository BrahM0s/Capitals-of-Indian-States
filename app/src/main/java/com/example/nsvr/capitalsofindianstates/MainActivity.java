package com.example.nsvr.capitalsofindianstates;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner dropdown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown=(Spinner) findViewById(R.id.spinner);

        Toast.makeText(this,"As of May 2018",Toast.LENGTH_LONG).show();
    }

    public void display(View v){
        String selection= dropdown.getSelectedItem().toString();
        String[] stateArray = getResources().getStringArray(R.array.states);
        String[] capitalArray = getResources().getStringArray(R.array.capitals);

        if(selection.equals("Select the State")){
            Toast.makeText(this,"Select the State",Toast.LENGTH_LONG).show();
        } else{
            TextView text=(TextView) findViewById(R.id.capital);
            for(int i=0; i<37; i++){
                if(selection.equals(stateArray[i]))
                    text.setText(capitalArray[i]);
            }
        }
    }
}
