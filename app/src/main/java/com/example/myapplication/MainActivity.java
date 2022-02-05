package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.adapter.BooksAdapter;
import com.example.myapplication.data.BooksClient;
import com.example.myapplication.data.model.BooksModel;
import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<BooksModel> list = new ArrayList<>();
    private BooksAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initi();


    }

    private void initi() {
        list = BooksClient.getBooks();
        bookAdapter = new BooksAdapter(list);
        binding.recyclerView.setAdapter(bookAdapter);
    }
}