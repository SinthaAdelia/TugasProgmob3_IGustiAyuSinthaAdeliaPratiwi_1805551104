package com.example.rekomendasidramakoreaterbaru2020;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>{
    private ArrayList<String> fotoDrakor = new ArrayList<>();
    private ArrayList<String> namaDrakor = new ArrayList<>();
    private ArrayList<String> infoDrakor = new ArrayList<>();
    private Context context;

    public recyclerViewAdapter(ArrayList<String> fotoDrakor, ArrayList<String> namaDrakor, ArrayList<String> infoDrakor, Context context) {
        this.fotoDrakor = fotoDrakor;
        this.namaDrakor = namaDrakor;
        this.infoDrakor = infoDrakor;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoDrakor.get(position)).into(holder.imageViewFotoDrakor);

        holder.textViewNamaDrakor.setText(namaDrakor.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, namaDrakor.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, detailActivity.class);

                intent.putExtra("foto_drakor", fotoDrakor.get(position));
                intent.putExtra("nama_drakor", namaDrakor.get(position));
                intent.putExtra("info_drakor", infoDrakor.get(position));

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaDrakor.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoDrakor;
        TextView textViewNamaDrakor;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoDrakor = itemView.findViewById(R.id.imageViewFotoDrakor);
            textViewNamaDrakor = itemView.findViewById(R.id.textViewNamaDrakor);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
