package ch.ffhs.fragments.dynamiclayout;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ch.ffhs.fragments.dynamiclayout.TeamsFragment.ListSelectionListener;

//Several Activity lifecycle methods are instrumented to emit LogCat output
//so you can follow this class' lifecycle
public class DescriptionViewerActivity extends Activity implements
		ListSelectionListener {

	public static String[] mTeamArray;
	public static String[] mDescriptionArray;


	private final DescriptionsFragment mDescriptionFragment = new DescriptionsFragment();
	private FragmentManager mFragmentManager;
	private FrameLayout mTeamFrameLayout, mDescriptionsFrameLayout;

	private static final int MATCH_PARENT = LinearLayout.LayoutParams.MATCH_PARENT;
	private static final String TAG = "DescriptionViewerActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		Log.i(TAG, getClass().getSimpleName() + ":entered onCreate()");

		super.onCreate(savedInstanceState);

		// Get the string arrays with the teams and descriptions
		mTeamArray = getResources().getStringArray(R.array.Teams);
		mDescriptionArray = getResources().getStringArray(R.array.Descriptions);

		setContentView(R.layout.main);

		// TODO: Get references to the TeamFragment and to the DescriptionsFragment
		/*
		mTeamFrameLayout = ...;
		mDescriptionsFrameLayout = ...;
		*/

		// TODO: Get a reference to the FragmentManager
		/*
		mFragmentManager = ...
		*/

		// TODO:
		// Start a new FragmentTransaction
		// Add the TeamFragment to the layout
		// Commit the FragmentTransaction
		// Add a OnBackStackChangedListener on the manager to reset the layout when the back stack changes
	}

	private void setLayout() {

		//TODO:
		// Determine whether the DescriptionFragment has been added
		if (!mDescriptionFragment.isAdded()) {
			// Make the TeamFragment occupy the entire layout, DescriptionFragment is of width 0.
		} else {
			// Make the TeamLayout take 1/3 of the layout's width
			// Make the DescriptionLayout take 2/3's of the layout's width
		}
	}

	// Called when the user selects an item in the TeamsFragment
	@Override
	public void onListSelection(int index) {
		//TODO:
		// If the DescriptionFragment has not been added, add it now
		if (!mDescriptionFragment.isAdded()) {
			// Start a new FragmentTransaction

			// Add the DescriptionFragment to the layout

			// Add this FragmentTransaction to the backstack => addToBackStack auf FragmentTransaction

			// Commit the FragmentTransaction

			// Force Android to execute the committed FragmentTransaction
			mFragmentManager.executePendingTransactions();
		}
		
		if (mDescriptionFragment.getShownIndex() != index) {
			// Tell the DescriptionFragment to show the description string at position index
			mDescriptionFragment.showDescriptionAtIndex(index);
		}
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStop()");
		super.onStop();
	}

}