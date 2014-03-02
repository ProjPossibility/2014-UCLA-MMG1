package com.example.spellwithfriends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Originally, the "Hello World" example took in the
        // "R.layout.activity_main.xml"-thing as a parameter for
        // setContentView() to draw objects on the screen,
        // but for testing stuff, I made the parameter something else 
        setContentView(new BubbleSurfaceView(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /** Called when the user clicks the Credits button */
    public void showCredits(View view) {
    	Intent intent = new Intent(this, DisplayCredits.class);
    	startActivity(intent);
    }
 
}
