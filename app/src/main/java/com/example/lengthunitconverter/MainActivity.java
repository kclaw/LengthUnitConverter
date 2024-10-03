package com.example.lengthunitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = this.findViewById(R.id.convert_button);
        RadioGroup fromRadioGroup = this.findViewById(R.id.from_radioGroup);
        RadioGroup toRadioGroup = this.findViewById(R.id.to_radioGroup);
        EditText fromEditText = this.findViewById(R.id.from_editText);
        EditText toEditText = this.findViewById(R.id.to_editText);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int fromUnitId = fromRadioGroup.getCheckedRadioButtonId();
                RadioButton fromUnit = MainActivity.this.findViewById(fromUnitId);
                int toUnitId = toRadioGroup.getCheckedRadioButtonId();
                RadioButton toUnit = MainActivity.this.findViewById(toUnitId);
                double validatedFromQuantity = 0d;
                try {
                    validatedFromQuantity = Double.parseDouble(fromEditText.getText().toString());
                    Converter converter = new ConverterAdapter(validatedFromQuantity,fromUnit.getText().toString().toLowerCase(),toUnit.getText().toString().toLowerCase());
                    toEditText.setText(Double.toString(converter.generateResult()));
                } catch(NumberFormatException e){
                    Toast.makeText(MainActivity.this, "from quantity is not valid. please input a correct number.", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}