package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
import android.view.*;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
//import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProtoApp extends Activity implements OnClickListener {
	
	Button balanceButton;
	Button transferButton;
	Button walletsButton;
	Button helpButton;
	
	Button logoutButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proto__app);
		
		addListenerOnButton();
	}
	
	public void addListenerOnButton() {
		//Determine button to add listener to
		balanceButton = (Button) findViewById(R.id.qBalance);
		transferButton = (Button)findViewById(R.id.qTransfer);
		walletsButton = (Button)findViewById(R.id.wallets);
		helpButton = (Button)findViewById(R.id.help);
		logoutButton = (Button)findViewById(R.id.logout);
		

		final Context context = this;

		//Add listener using Anonymous class
		balanceButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * Move to balance screen
				 */
			}

		});
		
		transferButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * Move to transfers screen
				 */
			}

		});
		
		walletsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * Move to wallet screen
				 */
			}

		});
		
		helpButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * Move to help/contact screen
				 */
			}

		});
		
		logoutButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				/*
				 * Code to logout
				 */
				
				Intent intent = new Intent(context, LoginActivity.class);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
