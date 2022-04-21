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
                if (loginUsername.getText().toString().equals("admin") && loginPassword.getText().toString().equals("admin")) {
                    Toast.makeText(getActivity(), "Login successful, this should go to another screen", Toast.LENGTH_LONG).show();
                    ((NavigationHost) getActivity()).navigateTo(new HomePageFragment(), false);
                } else {
                    Toast.makeText(getActivity(), "Login failed. Please try again!", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
