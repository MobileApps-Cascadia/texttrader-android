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
import com.example.texttrader.db.MockBookData;
import com.example.texttrader.db.MockUserData;

public class PostaBookFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private TextView bookPostTitle;
    private TextView bookPostAuthor;
    private TextView bookPostEdition;
    private TextView bookPostISBN;
    private Spinner bookPostSpinner;
    public String sselectedSpinnerText;
    private Button bookPostButton;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.book_post_form_fragment, container, false);

        bookPostTitle = view.findViewById(R.id.book_post_title);
        bookPostAuthor = view.findViewById(R.id.book_post_author);
        bookPostEdition = view.findViewById(R.id.book_post_edition);
        bookPostISBN = view.findViewById(R.id.book_post_isbn);
        bookPostSpinner = view.findViewById(R.id.book_post_spinner);
        bookPostButton = view.findViewById(R.id.book_post_button);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.trade_or_donate, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        bookPostSpinner.setAdapter(adapter);
        bookPostSpinner.setOnItemSelectedListener(this);

        bookPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    MockBookData.addNewBook(bookPostTitle.getText().toString(), bookPostAuthor.getText().toString(), bookPostEdition.getText().toString(), bookPostISBN.getText().toString(), sselectedSpinnerText);
                    Toast.makeText(getActivity(), "Book Added", Toast.LENGTH_LONG).show();
                    ((NavigationHost) getActivity()).navigateTo(new HomePageFragment(), false);
            }
        });

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
