package com.example.texttrader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.texttrader.NavigationHost;
import com.example.texttrader.R;
import com.example.texttrader.db.MockUserData;

public class AccountCreationFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private TextView createUsernameEditText;
    private TextView createFirstNameEditText;
    private TextView createLastNameEditText;
    private TextView createPasswordEditText;
    private TextView createConfirmPasswordEditText;
    private Spinner collegeNameSpinner;
    private Button accountCreationButton;
    public String selectedSpinnerText;

    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.account_creation_fragment, container, false);

        createUsernameEditText = view.findViewById(R.id.create_username);
        createFirstNameEditText = view.findViewById(R.id.create_users_first_name);
        createLastNameEditText = view.findViewById(R.id.create_users_last_name);
        createPasswordEditText = view.findViewById(R.id.create_password);
        createConfirmPasswordEditText = view.findViewById(R.id.confirm_create_password);
        collegeNameSpinner = view.findViewById(R.id.create_school_spinner);
        accountCreationButton = view.findViewById(R.id.create_account_btn);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.college_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        collegeNameSpinner.setAdapter(adapter);
        collegeNameSpinner.setOnItemSelectedListener(this);


        accountCreationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String testString = ("Creating account with the following info " +
                        "\nUsername: " + createUsernameEditText.getText().toString() +
                        "\nFirst Name: " + createFirstNameEditText.getText().toString() +
                        "\nLast Name: " + createLastNameEditText.getText().toString() +
                        "\nPassword: " + createPasswordEditText.getText().toString() +
                        "\nConfirm Password: " + createConfirmPasswordEditText.getText().toString() +
                        "\nSchool: " + selectedSpinnerText
                );

                if ((MockUserData.doesUsernameExist (createUsernameEditText.getText().toString()) == -1) && isBothPasswordsTheSame (createPasswordEditText.getText().toString(), createConfirmPasswordEditText.getText().toString())) {
                    MockUserData.addNewUser(createUsernameEditText.getText().toString(), createFirstNameEditText.getText().toString(), createLastNameEditText.getText().toString(), createPasswordEditText.getText().toString(), selectedSpinnerText);
                    Toast.makeText(getActivity(), testString, Toast.LENGTH_LONG).show();
                    ((NavigationHost) getActivity()).navigateTo(new LogInFragment(), false);
                } else {
                    Toast.makeText(getActivity(), "Error: account not created", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    };

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String choice = adapterView.getItemAtPosition(i).toString();
        selectedSpinnerText = choice;
        if (i > 0) {
            Toast.makeText(getActivity(), choice + " selcted.", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public static Boolean isBothPasswordsTheSame (String firstPassword, String secondPassword) {
        if (firstPassword.equals(secondPassword)) {
            return true;
        }
        return false;
    }
}
