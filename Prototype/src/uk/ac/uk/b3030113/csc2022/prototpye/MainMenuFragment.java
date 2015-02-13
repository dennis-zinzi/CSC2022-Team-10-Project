package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
//import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
//import android.widget.TextView;

public class MainMenuFragment extends Fragment implements OnClickListener{
	private static final String ARG_SECTION_NUMBER = "section_number";

	private Button qBalance;
	private Button qTransfer;
	private Button wallets;
	private Button fBanking;
	private Button help;
	private Button logout;

	public static MainMenuFragment newInstance(int sectionNumber) {
		MainMenuFragment fragment = new MainMenuFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}

	public MainMenuFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);

		//Find buttons in layout
		qBalance = (Button) rootView.findViewById(R.id.qBalance);
		qTransfer = (Button) rootView.findViewById(R.id.qTransfer);
		wallets = (Button) rootView.findViewById(R.id.wallets);
		fBanking = (Button) rootView.findViewById(R.id.fBanking);
		help = (Button) rootView.findViewById(R.id.help);
		logout = (Button) rootView.findViewById(R.id.logout);

		final android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
		
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
		((MainActivity) activity).onSectionAttached(getArguments().getInt(
				ARG_SECTION_NUMBER));
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}