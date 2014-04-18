package com.example.s0217980_diary;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

/**
 * @author tirthoguha
 * 
 */
public class MainActivity extends Activity {
	


		public static int Monday=0;
	    public static int Tuesday=1;
	    public static int Wednesday=2;
	    public static int Thursday=3;
	    public static int Friday=4;
/*	    public static String timeEntry;
	    public static String entryEntered;*/
	   // public static ArrayList<String> logs;
	    //public static String[] entry;
	    //public static String time;
	    //public static String text;
	    //public static String totalEntry;
	    //public static ArrayList<DiaryLogs> diaryLogs;
	    //public static ArrayList<DiaryLogs> test;
	    //public static DiaryLogs[] entryLogs;
	    //public static ArrayAdapter<DiaryLogs> monAdapter;
	    //public static ArrayList< String > myStringList;
	  //public static ArrayList<DiaryLogs> entryLogs;
	    
	  

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Home_fragment hf = new Home_fragment();
			fragmentTransaction.replace(android.R.id.content, hf);
			fragmentTransaction.commit();
			setContentView(R.layout.activity_main);



			}




		public void monClick(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Monday_fragment mf = new Monday_fragment();
			fragmentTransaction.replace(android.R.id.content, mf);
			fragmentTransaction.commit();
		}

		public void tuesClick(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Tuesday_fragment tf = new Tuesday_fragment();
			fragmentTransaction.replace(android.R.id.content, tf);
			fragmentTransaction.commit();
		}

		public void wedClick(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Wednesday_fragment wf = new Wednesday_fragment();
			fragmentTransaction.replace(android.R.id.content, wf);
			fragmentTransaction.commit();
		}

		public void thursClick(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Thursday_fragment thf = new Thursday_fragment();
			fragmentTransaction.replace(android.R.id.content, thf);
			fragmentTransaction.commit();
		}

		public void friClick(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Friday_fragment ff = new Friday_fragment();
			fragmentTransaction.replace(android.R.id.content, ff);
			fragmentTransaction.commit();
		}

		public void next_Home_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Monday_fragment mf = new Monday_fragment();
			fragmentTransaction.replace(android.R.id.content, mf);
			fragmentTransaction.commit();
		}

		public void previous_Home_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Friday_fragment ff = new Friday_fragment();
			fragmentTransaction.replace(android.R.id.content, ff);
			fragmentTransaction.commit();
		}

		public void next_Mon_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Tuesday_fragment tf = new Tuesday_fragment();
			fragmentTransaction.replace(android.R.id.content, tf);
			fragmentTransaction.commit();
		}

		public void previous_Mon_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Friday_fragment ff = new Friday_fragment();
			fragmentTransaction.replace(android.R.id.content, ff);
			fragmentTransaction.commit();

		}

		public void next_Tues_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Wednesday_fragment wf = new Wednesday_fragment();
			fragmentTransaction.replace(android.R.id.content, wf);
			fragmentTransaction.commit();
		}

		public void previous_Tues_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Monday_fragment mf = new Monday_fragment();
			fragmentTransaction.replace(android.R.id.content, mf);
			fragmentTransaction.commit();

		}

		public void next_Wed_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Thursday_fragment thf = new Thursday_fragment();
			fragmentTransaction.replace(android.R.id.content, thf);
			fragmentTransaction.commit();
		}

		public void previous_Wed_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Tuesday_fragment tf = new Tuesday_fragment();
			fragmentTransaction.replace(android.R.id.content, tf);
			fragmentTransaction.commit();

		}

		public void next_Thurs_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Friday_fragment ff = new Friday_fragment();
			fragmentTransaction.replace(android.R.id.content, ff);
			fragmentTransaction.commit();
		}

		public void previous_Thurs_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Wednesday_fragment wf = new Wednesday_fragment();
			fragmentTransaction.replace(android.R.id.content, wf);
			fragmentTransaction.commit();

		}

		public void next_Fri_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Monday_fragment ff = new Monday_fragment();
			fragmentTransaction.replace(android.R.id.content, ff);
			fragmentTransaction.commit();
		}

		public void previous_Fri_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Thursday_fragment wf = new Thursday_fragment();
			fragmentTransaction.replace(android.R.id.content, wf);
			fragmentTransaction.commit();

		}

		public void home_Click(View view) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction fragmentTransaction = fragmentManager
					.beginTransaction();
			Home_fragment hf = new Home_fragment();
			fragmentTransaction.replace(android.R.id.content, hf);
			fragmentTransaction.commit();

		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;

		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// TODO Auto-generated method stub
			switch (item.getItemId()) {
			case R.id.action_profile:
				FragmentManager fragmentManager = getFragmentManager();
				FragmentTransaction fragmentTransaction = fragmentManager
						.beginTransaction();
				Profile_fragment pf = new Profile_fragment();
				fragmentTransaction.replace(android.R.id.content, pf);
				fragmentTransaction.commit();

				break;
			case R.id.action_saveEntries:

				break;
			case R.id.action_sendAllEntries:
				//call delete dialog
				deleteDialog();
				break;
			}
			return false;
		}

		@Override
		public void onBackPressed() {
			new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher)
					.setTitle("Save entries to DB first?")
					.setNegativeButton("No", new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							// if no, close app
							MainActivity.this.finish();

						}
					})
					.setPositiveButton(android.R.string.ok, new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							// if ok, save entries to Database

						}
					})

					.create().show();

		}

		public void deleteDialog() {

			new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher)
					.setTitle("Are you sure? This will delete all entries.")
					.setNegativeButton(android.R.string.cancel, new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub


						}
					})
					.setPositiveButton(android.R.string.ok, new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub


						}
					})

					.create().show();

		}

	}
