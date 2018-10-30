package sti.gimay.userinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_textfield, button_button, button_checkbox, button_radiobutton, button_picker;

    String button_textfield_value, button_button_value, button_checkbox_value, button_radiobutton_value, button_picker_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_textfield= (Button) findViewById(R.id.button_textfield);
        button_button= (Button) findViewById(R.id.button_button);
        button_checkbox= (Button) findViewById(R.id.button_checkbox);
        button_radiobutton= (Button) findViewById(R.id.button_radiobutton);
        button_picker= (Button) findViewById(R.id.button_picker);

        button_textfield.setOnClickListener(this);
        button_button.setOnClickListener(this);
        button_checkbox.setOnClickListener(this);
        button_radiobutton.setOnClickListener(this);
        button_picker.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_textfield:
                Intent textfieldButtonIntent =  new Intent (this, TextFieldDemo.class);
                startActivity(textfieldButtonIntent);
                break;

            case R.id.button_button:
                Intent buttonButtonIntent = new Intent(this, ButtonDemo.class);
                startActivity(buttonButtonIntent);
                break;

            case R.id.button_checkbox:
                Intent buttonCheckboxIntent = new Intent (this,CheckBoxDemo.class);
                startActivity(buttonCheckboxIntent);
                break;

            case R.id.button_radiobutton:
                Intent buttonRadiobuttonIntent =new Intent (this,RadiobuttonDemo.class);
                startActivity(buttonRadiobuttonIntent);
                break;

            case R.id.button_picker:
                Intent buttonPickerIntent= new Intent (this,PickerDemo.class);
                startActivity(buttonPickerIntent);
                break;
        }

    }
}
