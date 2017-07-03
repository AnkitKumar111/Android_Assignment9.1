package com.example.ankitkumar.menusubmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SubMenuXmlActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    TextView tv;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		getSupportActionBar();

		tv=(TextView)findViewById(R.id.Tv01);


    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.menus, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.TextRed:
			tv.setTextColor(Color.RED);
			break;
		case R.id.TextGreen:
			tv.setTextColor(Color.GREEN);
			break;
		case R.id.TextBlue:
			tv.setTextColor(Color.BLUE);
			break;
			
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	
}