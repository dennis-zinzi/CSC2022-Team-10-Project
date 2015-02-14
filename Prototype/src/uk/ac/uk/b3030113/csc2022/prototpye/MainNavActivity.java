package uk.ac.uk.b3030113.csc2022.prototpye;

//import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentActivity;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
//import android.graphics.Color;
//import android.net.Uri;

public class MainNavActivity extends FragmentActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks{

	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private NavigationDrawerFragment mNavigationDrawerFragment;

	static int state;

	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_main_nav);


		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);

		setTitle("LLoyds Student");

		//		//Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));


	}

	public static void setState(int i){
		state = i;
	}


	@Override
	public void onNavigationDrawerItemSelected(int position) {
		if(state!=0){
			position = state-1;
		}
		// update the main content by replacing fragments
		android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
		switch (position+1) {
			case 1:
				fragmentManager.beginTransaction().replace(R.id.container, BalanceFragment.newInstance(position+1)).commit();
				break;
			case 2:
				fragmentManager.beginTransaction().replace(R.id.container, TransferFragment.newInstance(position+1)).commit();
				break;
			case 3:
				fragmentManager.beginTransaction().replace(R.id.container, WalletFragment.newInstance(position+1)).commit();
				break;
			case 4:
				fragmentManager.beginTransaction().replace(R.id.container, BankingFragment.newInstance(position+1)).commit();
				break;
			case 5:
				fragmentManager.beginTransaction().replace(R.id.container, HelpFragment.newInstance(position+1)).commit();
				state = 0;
				break;
			case 6:
				Intent logout = new Intent(this,LoginActivity.class);
				startActivity(logout);
				break;
		}
	}


	public void onSectionAttached(int number) {

	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		if (!mNavigationDrawerFragment.isDrawerOpen()) {
			// Only show items in the action bar relevant to this screen
			// if the drawer is not showing. Otherwise, let the drawer
			// decide what to show in the action bar.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
		return super.onCreateOptionsMenu(menu);
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

