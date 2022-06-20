package com.example.texttrader.db;

import com.example.texttrader.R;

public class Book {
    private Integer BookImage;
    private String BookTitle;
    private String BookEdition;
    private String BookAuthorName;
    private String BookISBN13;
    private String BookFormat;
    private String BookStatus;

    public Book(Integer bookimage, String booktitle, String bookedition, String authorname, String bookisbn13, String bookformat, String bookstatus) {
        setBookImage(bookimage);
        setBookTitle(booktitle);
        setBookEdition(bookedition);
        setBookAuthorName(authorname);
        setBookISBN13(bookisbn13);
        setBookFormat(bookformat);
        setBookStatus(bookstatus);
    }

    public Book(String booktitle, String bookedition, String authorname, String bookisbn13, String bookformat, String bookstatus) {
        setBookImage(R.drawable.no_image);
        setBookTitle(booktitle);
        setBookEdition(bookedition);
        setBookAuthorName(authorname);
        setBookISBN13(bookisbn13);
        setBookFormat(bookformat);
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

    public String getBookAuthorName() {
        return BookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        BookAuthorName = bookAuthorName;
    }

    public String getBookStatus() {
        return BookStatus;
    }

    public void setBookStatus(String bookStatus) {
        BookStatus = bookStatus;
    }

    public String getBookISBN13() {return BookISBN13;}

    public void setBookISBN13(String bookISBN13) {BookISBN13 = bookISBN13;}

    public String getBookFormat() {return BookFormat;}

    public void setBookFormat(String bookFormat) {BookFormat = bookFormat;}
}
