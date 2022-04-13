package com.example.texttrader.ui;

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

public class AccountCreationFragment extends Fragment {

    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.account_creation_fragment, container, false);

        Button accountCreationButton = view.findViewById(R.id.create_account_btn);

        accountCreationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Account Created!", Toast.LENGTH_LONG).show();
                ((NavigationHost) getActivity()).navigateTo(new LogInFragment(), false);
            }
        });

        return view;
    };
}
