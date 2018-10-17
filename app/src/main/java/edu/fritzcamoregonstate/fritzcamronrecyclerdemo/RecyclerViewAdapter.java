package edu.fritzcamoregonstate.fritzcamronrecyclerdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Item> mItems;
    private Context mContext;

    public RecyclerViewAdapter(List<Item> items, Context context) {
        mItems = items;
        mContext = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewHeading;
        public TextView mTextViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewHeading = (TextView) itemView.findViewById(R.id.itemHeadingResource);
            mTextViewDescription = (TextView) itemView.findViewById(R.id.itemDescriptionResource);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout, viewGroup, false);

        return new ViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Item item = mItems.get(i);
        viewHolder.mTextViewHeading.setText(item.getTextHeading());
        viewHolder.mTextViewDescription.setText(item.getTextDescription());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
