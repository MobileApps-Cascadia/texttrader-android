package com.example.texttrader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.texttrader.R;

public class PostaBookFragment extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.book_post_form_fragment, container, false);

        Toast.makeText(getActivity(), "A book post form should pop up!!", Toast.LENGTH_SHORT).show();

        return view;
    }
}
