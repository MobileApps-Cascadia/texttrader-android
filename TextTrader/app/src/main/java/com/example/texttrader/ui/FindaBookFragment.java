package com.example.texttrader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.texttrader.NavigationHost;
import com.example.texttrader.R;
import com.example.texttrader.db.MockBookData;
import com.example.texttrader.db.MockUserData;

public class FindaBookFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.booklist_fragment, container, false);

        Toast.makeText(getActivity(), "A list of books should pop up!!", Toast.LENGTH_SHORT).show();

        recyclerView = view.findViewById(R.id.booklist_fragment);

        setAdapter();
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        return view;
    }

    private void setAdapter() {
        BookListRecyclerAdapter adapter = new BookListRecyclerAdapter(MockBookData.getBookInfo());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
