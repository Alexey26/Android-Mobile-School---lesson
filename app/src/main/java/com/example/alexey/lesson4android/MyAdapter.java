package com.example.alexey.lesson4android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public class MagazListViewHolder extends RecyclerView.ViewHolder {
        TextView nameView, address, namelogin;


        public MagazListViewHolder(View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.textView1);
            address = itemView.findViewById(R.id.textView2);
            namelogin = itemView.findViewById(R.id.textView3);
        }

        public void setName(String nameText) {
            nameView.setText(nameText);
        }

        public void setAddress(String addressText) {
            address.setText(addressText);
        }

        public void setNamelogin(String login) {
            namelogin.setText(login);
        }
    }

    List<Magazine> magazines;

    public MyAdapter(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    @Override
    public int getItemCount() {
        return magazines.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, null);
            return new MagazListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MagazListViewHolder userListViewHolder = (MagazListViewHolder) holder;
        userListViewHolder.setName(magazines.get(position).getName());
        userListViewHolder.setAddress(magazines.get(position).getAddress());
        userListViewHolder.setNamelogin(magazines.get(position).getLogin());

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
