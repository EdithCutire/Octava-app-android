package com.example.octavo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText texto1;
	private Button btn1;
	private TextView vistal;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        texto1=(EditText)findViewById(R.id.texto1);
        vistal=(TextView)findViewById(R.id.vista1);
       
    }
    public void ejecutarbtn(View View){
    	String respuesta = texto1.getContext().toString();
    	
    	vistal.setText(respuesta);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
