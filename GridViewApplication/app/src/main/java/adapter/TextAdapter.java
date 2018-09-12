package adapter;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.example.uc17201124.gridviewapplication.AtivarAcao;
import com.example.uc17201124.gridviewapplication.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by UC17201124 on 12/09/2018.
 */

public class TextAdapter extends BaseAdapter {
    private Activity activity;
    List<AtivarAcao> itens;

    public TextAdapter(Activity activity, List<AtivarAcao> itens) {
        this.activity = activity;
        this.itens = itens;
    }

    @Override
    public int getCount() {
        return this.itens.size();
    }

    @Override
    public Object getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView text = new TextView(this.activity);
        text.setText(itens.get(i).getTexto());

        text.setGravity(Gravity.CENTER);

        text.setLayoutParams(new GridView.LayoutParams(144, 144));

        //view = View.inflate(activity, android.R.layout.simple_list_item_1, null);
        return text;
    }
}
