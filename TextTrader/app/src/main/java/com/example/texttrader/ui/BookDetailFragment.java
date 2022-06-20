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

import com.example.texttrader.R;

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

        bookDetailTitle.setText(MainActivity.tempBook.getBookTitle());
        bookDetailImage.setImageResource(MainActivity.tempBook.getBookImage());
        bookDetailAuthor.setText(MainActivity.tempBook.getBookAuthorName());
        bookDetailEdition.setText(MainActivity.tempBook.getBookEdition());
        bookDetailISBN13.setText(MainActivity.tempBook.getBookISBN13());
        bookDetailFormat.setText(MainActivity.tempBook.getBookFormat());
        bookDetailStatus.setText(MainActivity.tempBook.getBookStatus());

        return view;
    };

}
