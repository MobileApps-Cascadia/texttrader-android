package com.example.texttrader.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.texttrader.R;
import com.example.texttrader.db.Book;

import java.util.ArrayList;

public class BookListRecyclerAdapter extends RecyclerView.Adapter<BookListRecyclerAdapter.MyViewHolder> {

    private ArrayList<Book> booksList;

    public BookListRecyclerAdapter(ArrayList<Book> booksList){
        this.booksList = booksList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView bookImg;
        private TextView titleTxt;
        private TextView editionTxt;
        private TextView authorTxt;
        private TextView bookStatusTxt;

        public MyViewHolder(final View view){
            super(view);
            bookImg = view.findViewById(R.id.book_image);
            titleTxt = view.findViewById(R.id.book_title);
            editionTxt = view.findViewById(R.id.edition_volume);
            authorTxt = view.findViewById(R.id.author);
            bookStatusTxt = view.findViewById(R.id.book_status);
        }
    }

    @NonNull
    @Override
    public BookListRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.booklist_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookListRecyclerAdapter.MyViewHolder holder, int position) {
        Integer image = booksList.get(position).getBookImage();
        holder.bookImg.setImageResource(image);
        String title = booksList.get(position).getBookTitle();
        holder.titleTxt.setText(title);
        String edition = booksList.get(position).getBookEdition();
        holder.editionTxt.setText(edition);
        String author = booksList.get(position).getAuthorName();
        holder.authorTxt.setText(author);
        String status = booksList.get(position).getBookStatus();
        holder.bookStatusTxt.setText(status);
    }

    @Override
    public int getItemCount() {
        return booksList.size();
    }
}
