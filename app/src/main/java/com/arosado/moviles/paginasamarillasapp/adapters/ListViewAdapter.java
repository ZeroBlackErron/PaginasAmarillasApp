package com.arosado.moviles.paginasamarillasapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.arosado.moviles.paginasamarillasapp.NombresAnimales;
import com.arosado.moviles.paginasamarillasapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    // Declararamos las Variables
    Context mContext;
    LayoutInflater inflater;
    private List<NombresAnimales> nombreListaAnimales = null;
    private ArrayList<NombresAnimales> arraylist;

    public ListViewAdapter(Context context, List<NombresAnimales> animalNamesList) {
        mContext = context;
        this.nombreListaAnimales = animalNamesList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<NombresAnimales>();
        this.arraylist.addAll(animalNamesList);
    }

    public class ViewHolder {
        TextView nombre;
    }

    @Override
    public int getCount() {
        return nombreListaAnimales.size();
    }

    @Override
    public NombresAnimales getItem(int position) {
        return nombreListaAnimales.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.list_view_items, null);
            // Buscar los datos y presentarlos en el listview_item.xml
            holder.nombre = (TextView) view.findViewById(R.id.nombre);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Establecer resultados en el TextView
        holder.nombre.setText(nombreListaAnimales.get(position).getAnimalName());
        return view;
    }

    // Función filtrar
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        nombreListaAnimales.clear();
        if (charText.length() == 0) {
            nombreListaAnimales.addAll(arraylist);
        } else {
            for (NombresAnimales wp : arraylist) {
                if (wp.getAnimalName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    nombreListaAnimales.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
