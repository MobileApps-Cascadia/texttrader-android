package com.example.texttrader.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.texttrader.NavigationHost;
import com.example.texttrader.R;
import com.example.texttrader.db.MockUserData;

public class BookDetailFragment extends Fragment {

    private TextView bookDetailTitle;
    private ImageView bookDetailImage;
    private TextView bookDetailAuthor;
    private TextView bookDetailEdition;
    private TextView bookDetailISBN13;
    private TextView bookDetailFormat;
    private TextView bookDetailStatus;
    private Button bookDetailMessageButton;

    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.book_detail_fragment, container, false);

        bookDetailTitle = view.findViewById(R.id.detail_book_title);
        bookDetailImage = view.findViewById(R.id.bookImageView);
        bookDetailAuthor = view.findViewById(R.id.detail_author);
        bookDetailEdition = view.findViewById(R.id.detail_edition);
        bookDetailISBN13 = view.findViewById(R.id.detail_isbn_13);
        bookDetailFormat = view.findViewById(R.id.detail_format);
        bookDetailStatus = view.findViewById(R.id.detail_book_status);
        bookDetailMessageButton = view.findViewById(R.id.message_btn);

        bookDetailTitle.setText("This is title");
        bookDetailImage.setImageResource(R.drawable.no_image);
        bookDetailAuthor.setText("This is Nmae");
        bookDetailEdition.setText("This is 13th");
        bookDetailISBN13.setText("1234567890987");
        bookDetailFormat.setText("Paperback");
        bookDetailStatus.setText("Trade");

        return view;
    };

}
