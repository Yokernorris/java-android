package com.android.recyclerview;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.android.recyclerview.RestaurantFragment.OnListFragmentInteractionListener;
import com.bumptech.glide.Glide;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link } and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyRestaurantRecyclerViewAdapter extends RecyclerView.Adapter<MyRestaurantRecyclerViewAdapter.ViewHolder> {

    private Context ctx;
    private final List<Restaurante> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyRestaurantRecyclerViewAdapter(Context context,List<Restaurante> items, OnListFragmentInteractionListener listener) {
        this.ctx = context;
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_restaurant, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //Rescatamos  los datos  del elemento que ocupa la posicion 'position'

        holder.mItem = mValues.get(position);
        holder.nombreRestaurante.setText(holder.mItem.getNombre());
        holder.direccionRestaurante.setText(holder.mItem.getDireccion());
        holder.ratingRestaurante.setRating(holder.mItem.getValoracion());
        Glide.with(ctx)
                .load(holder.mItem.getUrl())
                .centerCrop()
                .into(holder.fotoRestaurante);



        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView fotoRestaurante;
        public final TextView nombreRestaurante;
        public final TextView direccionRestaurante;
        public final RatingBar ratingRestaurante;
        public Restaurante mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            fotoRestaurante = view.findViewById(R.id.imageViewPhoto);
            nombreRestaurante = view.findViewById(R.id.nombreView);
            direccionRestaurante = view.findViewById(R.id.textViewDireccion);
            ratingRestaurante = view.findViewById(R.id.ratingBarRestaurant);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + nombreRestaurante.getText() + "'";
        }
    }
}
