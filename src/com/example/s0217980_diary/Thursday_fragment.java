package com.example.s0217980_diary;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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

public class Thursday_fragment extends Fragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(
				R.layout.thursday_fragment, container, false);
	}
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		currentDateTime();
		super.onViewCreated(view, savedInstanceState);
		
		
		
	}
	public void currentDateTime(){
	EditText timeText = (EditText) getView().findViewById(R.id.dateTimeEText);
	SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy:H:m");
	String dateTime = df.format(Calendar.getInstance().getTime());
	timeText.setText(dateTime);
	}
	
	@Override
	public void onStart() {
			
			Button saveBtn = (Button) getView().findViewById(R.id.saveDiaryEntryBtn);
			saveBtn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					EditText timeText = (EditText) getView().findViewById(R.id.dateTimeEText);
					String timeEntry = timeText.getText().toString();
					EditText entryText = (EditText) getView().findViewById(R.id.diaryEntryEText);
					String entryEntered = entryText.getText().toString();
					
					//toast for testing purpose
					String TotalEntry = timeEntry + "\n" + entryEntered;
					Toast.makeText(getActivity(), TotalEntry, Toast.LENGTH_SHORT).show();
					
					
					
				}
			});
			
			Button showBtn = (Button) getView().findViewById(R.id.showDiaryEntriesBtn);
			showBtn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					FragmentManager fragmentManager = getFragmentManager();
					FragmentTransaction fragmentTransaction = fragmentManager
							.beginTransaction();
					Thursday_list_fragment mlf = new Thursday_list_fragment();
					fragmentTransaction.replace(android.R.id.content, mlf);
					fragmentTransaction.commit();
					
				}
			});
			
			
			
			super.onStart();
		}
}

