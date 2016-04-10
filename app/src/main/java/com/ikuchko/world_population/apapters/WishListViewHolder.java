package com.ikuchko.world_population.apapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikuchko.world_population.R;
import com.ikuchko.world_population.models.Country;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by iliak on 4/9/16.
 */
public class WishlistViewHolder extends RecyclerView.ViewHolder {

    private final Context context;
    private final ArrayList<Country> countryList;
    @Bind(R.id.flagView) ImageView flagView;
    @Bind(R.id.countryName) TextView countryName;
    @Bind(R.id.population) TextView population;
    @Bind(R.id.capital) TextView capital;

    public WishlistViewHolder(View itemView, ArrayList<Country> countries) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        context = itemView.getContext();
        this.countryList = countries;
    }

    public void bindCountry (Country country) {
        Picasso.with(context).load(country.getFlagImage()).resize(300, 156).centerCrop().into(flagView);
        countryName.setText(country.getName());
        population.setText(country.getPopulation());
        capital.setText(country.getCapital());
    }
}
