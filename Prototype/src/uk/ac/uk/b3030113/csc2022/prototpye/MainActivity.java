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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.widget.DrawerLayout;
import android.content.Intent;
//import android.graphics.Color;
//import android.net.Uri;

public  class MainActivity extends Activity implements
NavigationDrawerFragment.NavigationDrawerCallbacks, OnClickListener{

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
			case 4:
				fragmentManager.beginTransaction().replace(R.id.container, WalletFragment.newInstance(position+1)).commit();
				break;
			case 5:
				fragmentManager.beginTransaction().replace(R.id.container, BankingFragment.newInstance(position+1)).commit();
				break;
			case 6:
				fragmentManager.beginTransaction().replace(R.id.container, HelpFragment.newInstance(position+1)).commit();
				break;
			case 7:
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

	
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
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
			
			
			Button qBalance;
			Button fBanking;
			Button help;
			Button logout;
			Button wallets;
			Button qTransfer;


			
			//Determine button to add listener to
			qBalance = (Button) rootView.findViewById(R.id.qBalance);
			fBanking = (Button) rootView.findViewById(R.id.fBanking);
			help = (Button) rootView.findViewById(R.id.help);
			logout = (Button) rootView.findViewById(R.id.logout);
			wallets = (Button) rootView.findViewById(R.id.wallets);
			qTransfer = (Button) rootView.findViewById(R.id.qTransfer);

			final FragmentManager fragmentManager = getFragmentManager();
			
			
			
			qBalance.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					fragmentManager.beginTransaction().replace(R.id.container, BalanceFragment.newInstance(2)).commit();
				}

			});
			qTransfer.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					fragmentManager.beginTransaction().replace(R.id.container, TransferFragment.newInstance(3)).commit();
				}

			});
			wallets.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					fragmentManager.beginTransaction().replace(R.id.container, WalletFragment.newInstance(4)).commit();
				}

			});
			fBanking.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					fragmentManager.beginTransaction().replace(R.id.container, BankingFragment.newInstance(5)).commit();
				}

			});
			help.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					fragmentManager.beginTransaction().replace(R.id.container, HelpFragment.newInstance(6)).commit();
				}

			});
			logout.setOnClickListener(new OnClickListener(){
				
				@Override
				public void onClick(View v){
					Intent logout = new Intent(getActivity(), LoginActivity.class);
					startActivity(logout);
				}

			});
			
			
			
			
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

	public static class WalletFragment extends Fragment {
		private static final String ARG_SECTION_NUMBER = "section_number";

		public static WalletFragment newInstance(int sectionNumber) {
			WalletFragment fragment = new WalletFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}
		public WalletFragment() {

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_wallet, container,
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
	
	
	
	public static class BankingFragment extends Fragment {
	    private static final String ARG_SECTION_NUMBER = "section_number";
	 
	    public static BankingFragment newInstance(int sectionNumber) {
	        BankingFragment fragment = new BankingFragment();
	        Bundle args = new Bundle();
	        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
	        fragment.setArguments(args);
	        return fragment;
	    }
	    public BankingFragment() {
	 
	    }
	 
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        View rootView = inflater.inflate(R.layout.fragment_banking, container,
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
	
	


	public static class HelpFragment extends Fragment {
	    private static final String ARG_SECTION_NUMBER = "section_number";
	 
	    public static HelpFragment newInstance(int sectionNumber) {
	        HelpFragment fragment = new HelpFragment();
	        Bundle args = new Bundle();
	        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
	        fragment.setArguments(args);
	        return fragment;
	    }
	    public HelpFragment() {
	 
	    }
	 
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        View rootView = inflater.inflate(R.layout.fragment_help, container,
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

