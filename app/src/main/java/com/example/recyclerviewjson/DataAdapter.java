package com.example.recyclerviewjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private Context context;
    private List<DataList> list;

    public DataAdapter(Context context, List<DataList> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DataList datalist = list.get(position);

        holder.textTitle.setText(datalist.getTitle());
        holder.textid.setText(String.valueOf(datalist.getId()));
        holder.textalbumid.setText(String.valueOf(datalist.getAlbumId()));
        holder.texturl.setText(datalist.getUrl());
        holder.textthumburl.setText(datalist.getThumbUrl());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle, textid, textalbumid, texturl, textthumburl;

        public ViewHolder(View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.title);
            textid = itemView.findViewById(R.id.id);
            textalbumid = itemView.findViewById(R.id.albumid);
            texturl = itemView.findViewById(R.id.url);
            textthumburl = itemView.findViewById(R.id.thumburl);
        }
    }

}