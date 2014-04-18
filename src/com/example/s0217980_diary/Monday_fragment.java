package com.example.s0217980_diary;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Monday_fragment extends Fragment {

	ArrayList<String> myStringList;
	Bundle bundle;
	public static ArrayList<DiaryLogs> entryLogs;
	EditText timeText;
	EditText entryText;
	DiaryLogs dl;
	ArrayList<String> temp;

	/*
	 * String timeEntry; String entryEntered;
	 */

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.monday_fragment, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		currentDateTime();
		
		super.onViewCreated(view, savedInstanceState);
		
		
	}

	public void currentDateTime() {
		EditText timeText = (EditText) getView().findViewById(
				R.id.dateTimeEText);
		SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy:H:m");
		String dateTime = df.format(Calendar.getInstance().getTime());
		timeText.setText(dateTime);
	}

	public ArrayList<String> toStringList(Collection<DiaryLogs> entryLogs) {
		ArrayList<String> stringList = new ArrayList<String>();
		for (DiaryLogs myobj : entryLogs) {
			stringList.add(myobj.toString());
		}
		return stringList;
	}

	@Override
	public void onStart() {


		timeText = (EditText) getView().findViewById(R.id.dateTimeEText);
		entryText = (EditText) getView().findViewById(R.id.diaryEntryEText);
		Button saveBtn = (Button) getView()
				.findViewById(R.id.saveDiaryEntryBtn);
		saveBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String timeEntry = timeText.getText().toString();
				String entryEntered = entryText.getText().toString();
				dl = new DiaryLogs(MainActivity.Monday, timeEntry, entryEntered);
				entryLogs.add(dl);
				myStringList = toStringList(entryLogs);

				entryText.setText("");
			}
		});
		Button showBtn = (Button) getView().findViewById(
				R.id.showDiaryEntriesBtn);
		showBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				if (myStringList.isEmpty()) {

					Toast.makeText(getActivity(), "myStringList empty",
							Toast.LENGTH_SHORT).show();
					//System.out.println(entryLogs);
				} else {
					//System.out.println(myStringList.toString());
					FragmentManager fragmentManager = getFragmentManager();
					FragmentTransaction fragmentTransaction = fragmentManager
							.beginTransaction();
					bundle = new Bundle();
					Monday_list_fragment mlf = new Monday_list_fragment();
					bundle.putStringArrayList("list", myStringList);
					mlf.setArguments(bundle);
					fragmentTransaction.replace(android.R.id.content, mlf);
					fragmentTransaction.commit();

				}
			}
		});
		super.onStart();
	}
	
	@Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList("list", myStringList);
    }

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);
		entryLogs = new ArrayList<DiaryLogs>();
		myStringList = new ArrayList<String>();
		/*if (savedInstanceState != null) {
            // Restore last state for checked position.
			myStringList = savedInstanceState.getStringArrayList("list");
        }*/
	}
}