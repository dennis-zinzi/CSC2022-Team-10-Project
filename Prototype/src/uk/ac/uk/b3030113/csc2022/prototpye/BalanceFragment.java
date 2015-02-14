package uk.ac.uk.b3030113.csc2022.prototpye;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.TextView;

public class BalanceFragment extends Fragment {
	private static final String ARG_SECTION_NUMBER = "section_number";

	private TextView balanceLabel;
	private TextView overdraftLabel;
	private Button addToBudget;
	private Button manageBudgets;
	Account a;
	User u;
	
	public static BalanceFragment newInstance(int sectionNumber) {
		BalanceFragment fragment = new BalanceFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}
	public BalanceFragment() {
		a = new Account(25,1096.67,2500.00);
		u = new User("DZ",30);
		u.addBudget(new Budget("Personal",100));
		u.addBudget(new Budget("Groceries",200));
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_balance, container,
				false);


		balanceLabel = (TextView)rootView.findViewById(R.id.balanceText);
		overdraftLabel = (TextView)rootView.findViewById(R.id.overdraftText);
		addToBudget = (Button)rootView.findViewById(R.id.addToBudget);
		manageBudgets = (Button)rootView.findViewById(R.id.budgetManage);

		balanceLabel.setText(a.getBalance()+"");
		overdraftLabel.setText(a.getOverdraftLimit()+"");
		
		//addToBudget -> ask which to add to, then make appropriate change on progress bar;
		
		//manageBudgets -> Budget manager screen (New Budget, Modify Budget, Delete Budget, Remove from Budget);



		return rootView;
	}
//	@Override
//	public void onAttach(Activity activity) {
//		super.onAttach(activity);
//		((MainActivity) activity).onSectionAttached(getArguments().getInt(
//				ARG_SECTION_NUMBER));
//	}
}