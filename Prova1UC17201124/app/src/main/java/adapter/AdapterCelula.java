package adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.uc17201124.prova1uc17201124.R;

import org.w3c.dom.Text;

import java.util.List;

import modelo.Celula;

/**
 * Created by UC17201124 on 03/10/2018.
 */

public class AdapterCelula extends BaseAdapter{
    private Activity activity;
    private List<Celula> celulas;

    public AdapterCelula(Activity activity, List<Celula> celulas) {
        this.activity = activity;
        this.celulas = celulas;
    }

    @Override
    public int getCount() {
        return this.celulas.size();
    }

    @Override
    public Object getItem(int i) {
        return this.celulas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Celula celula = this.celulas.get(i);
        view = View.inflate(this.activity, R.layout.grid_item_layout, null);
        ImageView imagem = new ImageView(this.activity);
        imagem.setImageResource(celula.getImagem());

        CheckBox checkBox = view.findViewById(R.id.checkbox);
        return setPropsImagem(imagem);
    }

    private ImageView setPropsImagem(ImageView imagem) {
        imagem.setLayoutParams(new GridView.LayoutParams(500, 500));
        imagem.setPadding(16, 16, 16, 16);
        imagem.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imagem;
    }
}
