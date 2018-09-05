package com.example.uc17201124.listviewpersonalizada.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uc17201124.listviewpersonalizada.R;
import com.example.uc17201124.listviewpersonalizada.model.Carro;

import java.util.List;

/**
 * Created by UC17201124 on 05/09/2018.
 */

public class AdapterCarro extends BaseAdapter{
    private Activity activity;
    private List<Carro> carros;

    public AdapterCarro(Activity activity, List<Carro> carros) {
        this.activity = activity;
        this.carros = carros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int i) {
        return carros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Carro carro = this.carros.get(i);
        //View vCarrinho = LayoutInflater.from(this.activity).inflate(R.layout.layout_list_carrinho, null);

        view = View.inflate(activity, R.layout.layout_list_carrinho, null);

        TextView modelo = view.findViewById(R.id.modelo);
        TextView fabricante = view.findViewById(R.id.fabricante);
        ImageView imgLogo = view.findViewById(R.id.imgLogo);

        modelo.setText(carro.getModelo());
        fabricante.setText(carro.getFabricante());
        imgLogo.setImageResource(carro.getImagem());

        return view;
    }
}
