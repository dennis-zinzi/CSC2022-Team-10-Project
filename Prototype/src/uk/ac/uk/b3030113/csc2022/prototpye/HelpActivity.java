package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_help);
		setTitle("Help");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help, menu);
		return true;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent i = new Intent(this,SettingsActivity.class);
			startActivity(i);
			finish();
			return true;
		}
		else if(id == R.id.action_logout){
			setResult(1);
			finish();
		}
		return super.onOptionsItemSelected(item);
	}


}