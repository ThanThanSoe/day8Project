package com.padcmyanmar.padc9.day8_project.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.day8_project.R;
import com.padcmyanmar.padc9.day8_project.views.holders.FirstItemViewHolder;
import com.padcmyanmar.padc9.day8_project.views.holders.SecondItemViewHolder;

public class RVAdapter extends RecyclerView.Adapter {
    public static final int VT_FIRST =0;
    public static final int VT_SECOND = 1;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        int laoutRes;
        switch (viewType){
            case VT_FIRST:
                laoutRes = R.layout.item_view_first;
                View view = layoutInflater.inflate(laoutRes,parent,false);
                return new FirstItemViewHolder(view);

            case VT_SECOND:
                laoutRes = R.layout.item_view_second;
                View viewSecond = layoutInflater.inflate(laoutRes,parent,false);
                return new SecondItemViewHolder(viewSecond);

                default:
                    laoutRes = R.layout.item_view_first;
                    View defaultView = layoutInflater.inflate(laoutRes,parent,false);
                    return new FirstItemViewHolder(defaultView);

        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    @Override
    public int getItemViewType(int position) {
        int itemViewType = 1;
        if(position == 0)
            return itemViewType=VT_FIRST;
        return itemViewType;

        /*return super.getItemViewType(position);*/
    }
}
