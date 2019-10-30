package com.example.kuis1mobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class keluragaadapter extends RecyclerView.Adapter<keluragaadapter.KeluargaViewHolder>
{

    private ArrayList<keluarga> dataList;

    public keluragaadapter(ArrayList<keluarga> dataList)
    {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public keluragaadapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull keluragaadapter.KeluargaViewHolder holder, int position)
    {
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNamap.setText(dataList.get(position).getNamap());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtNamap;
        private ImageView srcGambar;

        public KeluargaViewHolder(@NonNull View itemView) {
            super(itemView);
            srcGambar =(ImageView)itemView.findViewById(R.id.gambar);
            txtNama = (TextView) itemView.findViewById(R.id.tv_nama);
            txtNamap = (TextView) itemView.findViewById(R.id.tv_namap);

        }
    }
}