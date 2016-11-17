package richard.example.com.androidlearningdemo.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import richard.example.com.androidlearningdemo.R;
import richard.example.com.androidlearningdemo.listview.adapter.CustomListAdapter;
import richard.example.com.androidlearningdemo.listview.model.Item;

/**
 * Created by Administrator on 2016/11/17.
 */

public class ListViewWithBaseAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_with_baseadapter);

        ListView ittemsListView = (ListView) findViewById(R.id.list_view_items);

        //create adapter object
        CustomListAdapter adapter = new CustomListAdapter(this, generateItemsList());

        //set custom adapter as adapter to our list view
        ittemsListView.setAdapter(adapter);
    }

    /**
     * Util function to generate list of items
     *
     * @return ArrayList
     */
    private ArrayList<Item> generateItemsList(){
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescriptions[] = getResources().getStringArray(R.array.item_description);

        ArrayList<Item> list = new ArrayList<>();

        for(int i = 0; i < itemNames.length; i++){
            list.add(new Item(itemNames[i], itemDescriptions[i]));
        }

        return  list;
    }
}
