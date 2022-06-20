package com.example.texttrader.db;

import com.example.texttrader.R;

import java.util.ArrayList;

public class MockBookData {

    private static ArrayList<Book> booksList = new ArrayList<>();

    public static ArrayList<Book> getBookInfo() {
        return booksList;
    }

    public static void setBooksInfo() {
        booksList.add(new Book(R.drawable.the_zombie_survival_guide, "The Zombie Survival Guide", "1st","Max Brooks", "0987654321098","Paperback", "Donate"));
        booksList.add(new Book(R.drawable.world_war_z,"World War Z","1st","Max Brooks" , "0987654321098","Paperback","Donate"));
        booksList.add(new Book(R.drawable.the_art_of_war,"The Art of War","100th","Sun Tzu", "0987654321098","Paperback","Trade"));
        booksList.add(new Book(R.drawable.everyday_calculus,"Everyday Calculus","1st","Oscar E. Fernandez", "0987654321098","Paperback","Trade"));
        booksList.add(new Book("This Book Loves You","1st","Pewdiepie", "0987654321098","Paperback","Trade"));
        booksList.add(new Book(R.drawable.basic_physics,"Basic Physics","3rd","Karl F. Kuhn" , "0987654321098","Paperback","Trade"));
        booksList.add(new Book(R.drawable.the_forever_war,"The Forever War","1st","Joe Haldeman" , "0987654321098","Paperback","Donate"));
    }

    public static void addNewBook(String title, String edition, String authorName, String isbn13, String format, String donationStatus) {
        booksList.add(new Book(title, edition, authorName, isbn13, format, donationStatus));
    }

}
