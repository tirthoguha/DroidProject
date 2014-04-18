package com.example.s0217980_diary;

import java.util.ArrayList;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Monday_list_fragment extends ListFragment {
	ArrayList<String> logs;
	Bundle bundle;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater
				.inflate(R.layout.monday_list_fragment, container, false);

	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {

		super.onViewCreated(view, savedInstanceState);
		bundle = this.getArguments();
		if (bundle != null) {
			logs = bundle.getStringArrayList("list");

			ArrayAdapter<String> adapter = new ArrayAdapter<String>(
					getActivity(), android.R.layout.simple_list_item_1, logs);
			setListAdapter(adapter);
			adapter.notifyDataSetChanged();
			//System.out.println(Monday_fragment.myStringList);
		}

	}

}