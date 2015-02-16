package uk.ac.uk.b3030113.csc2022.prototpye;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabbedPageAdapter extends FragmentPagerAdapter {

	public TabbedPageAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
			case 0:
				// Balance fragment
				return new BalanceFragment();
			case 1:
				// Transfer fragment
				return new TransferFragment();
			case 2:
				// Wallets fragment 
				return new WalletFragment();
			case 3:
				// Banking fragment
				return new BankingFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}

}
