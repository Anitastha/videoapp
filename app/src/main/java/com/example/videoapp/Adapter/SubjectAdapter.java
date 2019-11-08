package com.example.videoapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.videoapp.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import javax.security.auth.Subject;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>{
ArrayList<Subject> subject;
Context context;
    Adapter adapter;

    public SubjectAdapter(ArrayList<Subject> subject, Context context, Adapter adapter) {
        this.subject = subject;
        this.context = context;
        this.adapter = adapter;
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_main,parent,false);
        SubjectViewHolder holder = new SubjectViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return subject.size();
    }

    public class SubjectViewHolder extends RecyclerView.ViewHolder {
        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
