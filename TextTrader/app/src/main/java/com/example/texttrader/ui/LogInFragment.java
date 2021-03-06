package com.example.texttrader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.texttrader.NavigationHost;
import com.example.texttrader.R;
import com.example.texttrader.db.MockUserData;

public class LogInFragment extends Fragment {

    private TextView loginUsername;
    private TextView loginPassword;
    private Button loginButton;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.login_screen_fragment, container, false);

        loginUsername = view.findViewById(R.id.login_username);
        loginPassword = view.findViewById(R.id.login_password);
        loginButton = view.findViewById(R.id.login_btn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean canLogIn;
                if(MockUserData.isUsernameAndPasswordCorrect (loginUsername.getText().toString(), loginPassword.getText().toString())) {
                    ((NavigationHost) getActivity()).navigateTo(new HomePageFragment(), false);
                }else {
                    Toast.makeText(getActivity(), "Login failed, username or password is incorrect. Please try again!", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
