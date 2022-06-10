package com.example.texttrader.db;

import com.example.texttrader.R;

public class Book {
    private Integer BookImage;
    private String BookTitle;
    private String BookEdition;
    private String AuthorName;
    private String BookStatus;

    public Book(Integer bookimage, String booktitle, String bookedition, String authorname, String bookstatus) {
        setBookImage(bookimage);
        setBookTitle(booktitle);
        setBookEdition(bookedition);
        setAuthorName(authorname);
        setBookStatus(bookstatus);
    }

    public Book(String booktitle, String bookedition, String authorname, String bookstatus) {
        setBookImage(R.drawable.no_image);
        setBookTitle(booktitle);
        setBookEdition(bookedition);
        setAuthorName(authorname);
        setBookStatus(bookstatus);
    }

    public Integer getBookImage() {
        return BookImage;
    }

    public void setBookImage(Integer bookImage) {
        BookImage = bookImage;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getBookEdition() {
        return BookEdition;
    }

    public void setBookEdition(String bookEdition) {
        BookEdition = bookEdition;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getBookStatus() {
        return BookStatus;
    }

    public void setBookStatus(String bookStatus) {
        BookStatus = bookStatus;
    }
}
