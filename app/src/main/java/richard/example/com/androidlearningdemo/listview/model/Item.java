package richard.example.com.androidlearningdemo.listview.model;

/**
 * Created by Administrator on 2016/11/17.
 */

/**
 *
 * Item model
 */

public class Item {
    private String itemName;
    private String itemDescription;

    public Item(String name, String description){
        this.itemName = name;
        this.itemDescription = description;
    }

    public String getItemName(){
        return this.itemName;
    }

    public String getItemDescription(){
        return this.itemDescription;
    }
}
