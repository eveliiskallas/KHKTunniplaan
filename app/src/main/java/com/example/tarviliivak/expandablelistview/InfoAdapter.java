package com.example.tarviliivak.expandablelistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Belal on 10/18/2017.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {


    private Context mCtx;
    private List<Info> infoList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public InfoAdapter(Context mCtx, List<Info> infoList) {
        this.mCtx = mCtx;
        this.infoList = infoList;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.info_list, null);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        Info info = infoList.get(position);


        holder.textViewDate.setText(info.getKuupaev());
        holder.textViewTime.setText(info.getAeg());
        holder.textViewSubject.setText(String.valueOf(info.getAine()));
        holder.textViewGroup.setText(String.valueOf(info.getGrupp()));
        holder.textViewTeacher.setText(String.valueOf(info.getOpetaja()));

    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    class InfoViewHolder extends RecyclerView.ViewHolder {

        TextView textViewDate, textViewTime, textViewSubject, textViewGroup, textViewTeacher;

        public InfoViewHolder(View itemView) {
            super(itemView);

            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            textViewSubject = itemView.findViewById(R.id.textViewSubject);
            textViewGroup = itemView.findViewById(R.id.textViewGroup);
            textViewTeacher = itemView.findViewById(R.id.textViewTeacher);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}