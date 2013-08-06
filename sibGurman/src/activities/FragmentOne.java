package activities;

import adapters.BrandAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import classes.AllProducts;
import com.actionbarsherlock.app.SherlockListFragment;

public class FragmentOne extends SherlockListFragment{
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
   	{  
	    BrandAdapter adapter = new BrandAdapter(getActivity().getBaseContext(), AllProducts.pelmens);
	    setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
   }
}
