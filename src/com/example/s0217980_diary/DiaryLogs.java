package com.example.s0217980_diary;

import java.util.ArrayList;

public class DiaryLogs {
	
	//public static ArrayList<DiaryLogs> entryLogs;

	static String timeEntry;
	static String entryEntered;
	int day;

	// single constructor that takes an integer and two string
	public DiaryLogs(int day, String timeEntry, String entryEntered) {
		super();
		this.day = day;
		this.timeEntry = timeEntry;
		DiaryLogs.entryEntered = entryEntered;

	}

	public String getTimeEntry() {	
		return timeEntry;
	}

	public void setTimeEntry(String timeEntry) {
		this.timeEntry = timeEntry;
	}

	public static String getEntryEntered() {
		return entryEntered;
	}

	public void setEntryEntered(String entryEntered) {
		DiaryLogs.entryEntered = entryEntered;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.timeEntry + "\n" + DiaryLogs.entryEntered;

		
	}
	
	
}
