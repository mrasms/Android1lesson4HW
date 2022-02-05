package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.data.model.BooksModel;

import java.util.ArrayList;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksHolder> {
    ArrayList<BooksModel> list = new ArrayList<>();

    public BooksAdapter(ArrayList<BooksModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public BooksAdapter.BooksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder, parent, false);

        return new BooksHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BooksAdapter.BooksHolder holder, int position) {
    holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BooksHolder extends RecyclerView.ViewHolder {
       TextView tvBookNames;
        public BooksHolder(@NonNull View itemView) {
            super(itemView);
            tvBookNames=itemView.findViewById(R.id.tv_book_names);
        }

        public void onBind(BooksModel booksModel) {
            tvBookNames.setText(booksModel.getBooksName());
        }
    }
}
