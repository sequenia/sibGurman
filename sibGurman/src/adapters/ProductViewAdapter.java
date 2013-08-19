package adapters;

import java.util.List;

import sequenia.sibgurman.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import classes.Product;

public class ProductViewAdapter extends ArrayAdapter<Product> {
    private final Context context;
    private List<Product> items;

    public ProductViewAdapter(Context context, List<Product> products) {
        super(context, R.layout.product, products);
        this.context = context;
        this.items = products;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.productview, parent, false);

        TextView textViewNameProduct = (TextView) rowView.findViewById(R.id.textViewProductN);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageViewProduct);
        
        
   
        textViewNameProduct.setText(items.get(position).getName());
        imageView.setImageResource(items.get(position).getPictureId());
        
        return rowView;
    }
}