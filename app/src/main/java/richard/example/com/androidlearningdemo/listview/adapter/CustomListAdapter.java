package richard.example.com.androidlearningdemo.listview.adapter;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import richard.example.com.androidlearningdemo.R;
import richard.example.com.androidlearningdemo.listview.model.Item;

/**
 * Created by Administrator on 2016/11/17.
 */

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item>   items;

    public CustomListAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size(); //returns total item in the list
    }

    @Override
    public Object getItem(int positoin) {
        return items.get(positoin); //returns the item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        Button button = null;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_list_view_row_items,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        button = (Button) convertView.findViewById(R.id.button_handler);
        button.setTag(position);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(, "===============");
                Log.d("richard","====== position: " + position);
            }
        });
        Item currentItem = (Item) getItem(position);
        viewHolder.itemName.setText(currentItem.getItemName());
        viewHolder.itemDescription.setText(currentItem.getItemDescription());

        return convertView;
    }

    //ViewHolder inner class
    private class ViewHolder {
        TextView itemName;
        TextView itemDescription;

        public ViewHolder(View view){
            itemName = (TextView) view.findViewById(R.id.text_view_item_name);
            itemDescription = (TextView) view.findViewById(R.id.text_view_item_description);
        }
    }
}
