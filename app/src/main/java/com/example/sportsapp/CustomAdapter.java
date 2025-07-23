package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.lang.Record;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {
    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // inflating the each item in the layout view
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tem_layout,parent,false);
        return new SportsViewHolder(itemView);


        //Creates a new ViewHolder by inflating the XML layout (card_tem_layout.xml) for each row/card.
        //
        //LayoutInflater.from(...) = Turns XML into a real View object.
        //
        //inflate(...) = Loads the layout for one item (like one sport card).
        //
        //new SportsViewHolder(itemView) = Wraps the view inside a ViewHolder class.




    }



    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        // called for each item in the list and is responsible for binding the datafrom the sport obbject to the views within  the
        // sportviewholder'
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);


    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        // Holds the references to the views within the layout
        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
            textView =itemView.findViewById(R.id.textview);
            imageView=itemView.findViewById(R.id.imageviewCard);

        }
    }
}
