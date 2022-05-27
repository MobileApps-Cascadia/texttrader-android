package com.example.texttrader.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.texttrader.NavigationHost;
import com.example.texttrader.R;
import com.example.texttrader.db.MockUserData;

public class LandingFragment extends Fragment {

    private Button signInButton;
    private Button createAccountButton;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.landing_fragment, container, false);

        signInButton = view.findViewById(R.id.signin_btn);
        createAccountButton = view.findViewById(R.id.create_account_btn);

        MockUserData.setUsersInfo(); //This is to create two mock users

        Toast.makeText(getActivity(), "Welcome!", Toast.LENGTH_SHORT).show();

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavigationHost) getActivity()).navigateTo(new LogInFragment(), true);
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ((NavigationHost) getActivity()).navigateTo(new AccountCreationFragment(), true);
            }
        });

        return view;
    }
}
