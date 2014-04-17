package com.example.s0217980_diary;

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

public class Profile_fragment extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.profile_main, container, false);

	}

	@Override
	public void onStart() {

		Button saveProfile = (Button) getView().findViewById(
				R.id.saveProfileBtn);
		
		

		
		saveProfile.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				EditText username = (EditText) getView().findViewById(
						R.id.userNameEText);
				EditText password = (EditText) getView().findViewById(
						R.id.passwordEText);
				EditText repeatPassword = (EditText) getView().findViewById(
						R.id.repeatPasswordEText);
				String user = username.getText().toString();
				String pass= password.getText().toString();
				String rePass= repeatPassword.getText().toString();
				
				
				
				if(pass.equals("") || rePass.equals("") ||  user.equals("")){
					
					Toast.makeText(getActivity(), "Username & Password cannot be blank", Toast.LENGTH_SHORT).show();

					
					
				}
			
				
			else if (pass.equals(rePass) ){
				String TotalEntry = "Username: "+ user + "\n"+"Password: " + pass;
			//toast for testing purpose
			Toast.makeText(getActivity(), TotalEntry, Toast.LENGTH_SHORT).show();
			// take to home fragment
			goHome();
			}
			else if(pass != rePass)
			{
					Toast.makeText(getActivity(), "Password did not match", Toast.LENGTH_SHORT).show();
				}
			

			}
		});
		super.onStart();
	}

	public void goHome() {
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		Home_fragment hf = new Home_fragment();
		fragmentTransaction.replace(android.R.id.content, hf);
		fragmentTransaction.commit();
	}

}
