package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProtoApp extends Activity {
	
	Button loginButton;
	Button exitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proto__app);

		addListenerOnButton();
	}
	
	public void addListenerOnButton() {
		//Determine button to add listener to
		loginButton = (Button) findViewById(R.id.login);
		exitButton = (Button)findViewById(R.id.exit);

		//Add listener using Anonymous class
		loginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				//Code to access web-page upon tapping button
				
				Intent browserIntent = 
						new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lloydsbank.com/"));
				startActivity(browserIntent);
				 /**/
			}

		});
		
		exitButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				int pid = android.os.Process.myPid();
				android.os.Process.killProcess(pid);
				
				Intent intent = new Intent(Intent.ACTION_MAIN);
				intent.addCategory(Intent.CATEGORY_HOME);
				startActivity(intent);
			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.proto__app, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
