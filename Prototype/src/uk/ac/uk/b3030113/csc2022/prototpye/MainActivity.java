package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
//import android.os.Build;
import android.os.Bundle;
//import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.content.Intent;
//import android.graphics.Color;
//import android.net.Uri;

public  class MainActivity extends Activity implements
NavigationDrawerFragment.NavigationDrawerCallbacks{

	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private NavigationDrawerFragment mNavigationDrawerFragment;

	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//addListenerOnButton();

		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);


		// Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));
	}


	@Override
	public void onNavigationDrawerItemSelected(int position) {
		// update the main content by replacing fragments
		FragmentManager fragmentManager = getFragmentManager();
		switch (position+1) {
			case 1:
				fragmentManager.beginTransaction().replace(R.id.container, PlaceholderFragment.newInstance(position+1)).commit();
				break;
			case 2:
				fragmentManager.beginTransaction().replace(R.id.container, BalanceFragment.newInstance(position+1)).commit();
				break;
			case 3:
				fragmentManager.beginTransaction().replace(R.id.container, TransferFragment.newInstance(position+1)).commit();
				break;
		}
	}


	public void onSectionAttached(int number) {
		final Context context = this;
		switch (number) {
			case 1:
				break;
			case 2:
			//			
			//			Intent balance = new Intent(context, BalanceActivity.class);
			//			startActivity(balance);
			//			break;
			case 3:
			//			
			//			Intent transfer = new Intent(context, TransferActivity.class);
			//			startActivity(transfer);
				break;
			case 4:

			//			Intent wallet = new Intent(context,WalletActivity.class);
			//			startActivity(wallet);
				break;
			case 5:
			//			
			//			Intent banking = new Intent(context, BankingActivity.class);
			//			startActivity(banking);
				break;
			case 6:
			//			
			//			Intent help = new Intent(context,HelpActivity.class);
			//			startActivity(help);
				break;
			case 7:
			//			Intent logout = new Intent(context,LoginActivity.class);
			//			startActivity(logout);
				break;


		}
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


	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main,
					container, false);
			return rootView;
		}

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			((MainActivity) activity).onSectionAttached(getArguments()
					.getInt(ARG_SECTION_NUMBER));
		}
	}
	
	
	

	public static class BalanceFragment extends Fragment {
		private static final String ARG_SECTION_NUMBER = "section_number";

		public static BalanceFragment newInstance(int sectionNumber) {
			BalanceFragment fragment = new BalanceFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}
		public BalanceFragment() {

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_balance, container,
					false);

			return rootView;
		}
		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			((MainActivity) activity).onSectionAttached(getArguments().getInt(
					ARG_SECTION_NUMBER));
		}
	}
	
	
	public static class TransferFragment extends Fragment {
	    private static final String ARG_SECTION_NUMBER = "section_number";
	 
	    public static TransferFragment newInstance(int sectionNumber) {
	        TransferFragment fragment = new TransferFragment();
	        Bundle args = new Bundle();
	        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
	        fragment.setArguments(args);
	        return fragment;
	    }
	    public TransferFragment() {
	 
	    }
	 
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        View rootView = inflater.inflate(R.layout.fragment_transfer, container,
	                false);
	 
	        return rootView;
	    }
	    @Override
	    public void onAttach(Activity activity) {
	        super.onAttach(activity);
	        ((MainActivity) activity).onSectionAttached(getArguments().getInt(
	                ARG_SECTION_NUMBER));
	    }
	}
}
