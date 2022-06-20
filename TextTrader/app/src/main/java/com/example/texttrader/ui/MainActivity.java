package com.example.texttrader.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.texttrader.NavigationHost;
import com.example.texttrader.R;
import com.example.texttrader.db.Book;
import com.example.texttrader.db.MockUserData;

public class MainActivity extends AppCompatActivity implements NavigationHost {

    static Book tempBook = new Book("TEST","1st","Some Author","1234567890123","Paperback", "Trade");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new LandingFragment())
                    .commit();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void navigateTo(Fragment fragment, boolean addToBackstack) {
        FragmentTransaction transaction =
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, fragment);
        if (addToBackstack) {
            transaction.addToBackStack(null);
        }

        transaction.commit();
    }
}