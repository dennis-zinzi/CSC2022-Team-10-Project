package uk.ac.uk.b3030113.csc2022.prototpye;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//import android.widget.TextView;
 
public class BalanceFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";
    
    private TextView balanceLabel;
 
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
        
        balanceLabel = (TextView)rootView.findViewById(R.id.balanceText);
        
        
//        Account acc = users account; 
//        balanceLabel.setText(getBalance());
        
        return rootView;
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(getArguments().getInt(
                ARG_SECTION_NUMBER));
    }
}