package com.example.myapplication.data;

import com.example.myapplication.data.model.BooksModel;

import java.util.ArrayList;

public class BooksClient {

    public static ArrayList<BooksModel> list = new ArrayList();

    public static ArrayList<BooksModel> getBooks() {
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        list.add(new BooksModel("new Book"));
        return list;

    }


}
