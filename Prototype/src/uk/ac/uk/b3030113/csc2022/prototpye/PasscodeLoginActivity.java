package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PasscodeLoginActivity extends Activity implements OnClickListener{

	Button loginButton;
	Button backButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passcode_login);
		
		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.passcode_login, menu);
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
	
	public void addListenerOnButton() {
		final Context context = this;
		
		//Determine button to add listener to
		loginButton = (Button) findViewById(R.id.loginP);
		backButton = (Button)findViewById(R.id.backP);

		//Add listener using Anonymous class
		loginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				/*
				 * Code to verify login details and log user into main menu
				 */
				
				/*
				 * Code to move to Main Activity (ProtoApp)
				 */
				Intent intent = new Intent(context, MainActivity.class);
				startActivity(intent);
			}

		});

		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(context, LoginActivity.class);
				startActivity(intent);
			}
		});
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
