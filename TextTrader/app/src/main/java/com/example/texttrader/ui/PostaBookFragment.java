package com.example.texttrader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.texttrader.R;

public class PostaBookFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private Spinner bookPostSpinner;
    public String sselectedSpinnerText;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.book_post_form_fragment, container, false);

        bookPostSpinner = view.findViewById(R.id.book_post_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.trade_or_donate, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        bookPostSpinner.setAdapter(adapter);
        bookPostSpinner.setOnItemSelectedListener(this);

        Toast.makeText(getActivity(), "A book post form should pop up!!", Toast.LENGTH_SHORT).show();

        return view;
    };

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String choice = adapterView.getItemAtPosition(i).toString();
        sselectedSpinnerText = choice;
        if (i > 0) {
            Toast.makeText(getActivity(), choice + " selcted.", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
