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
import com.example.texttrader.db.MockBookData;

public class HomePageFragment extends Fragment {

    private Button postaBookButton;
    private Button findaBookButton;
    private Button messengerButton;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.home_page_fragment, container, false);

        postaBookButton = view.findViewById(R.id.post_a_book_btn);
        findaBookButton = view.findViewById(R.id.find_a_book_btn);
        messengerButton = view.findViewById(R.id.messenger_btn);

        if (MockBookData.getBookInfo().size() == 0) {
            MockBookData.setBooksInfo(); //This is to create mock book data
        }


        postaBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavigationHost) getActivity()).navigateTo(new PostaBookFragment(), true);
            }
        });

        findaBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavigationHost) getActivity()).navigateTo(new FindaBookFragment(), true);
            }
        });

        messengerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
