package richard.example.com.androidlearningdemo.recyclerview.adapter;

import android.content.Context;
import android.icu.text.LocaleDisplayNames;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import richard.example.com.androidlearningdemo.R;
import richard.example.com.androidlearningdemo.recyclerview.model.Contact;

/**
 * Created by Administrator on 2016/11/17.
 */

public class ContactsAdapter extends
        RecyclerView.Adapter<ContactsAdapter.ViewHolder>{

    //Store a member variable for the contacts
    private List<Contact> mContacts;
    //Store the context for easy access
    private Context mContext;

    public ContactsAdapter(Context context, List<Contact> contacts){
        mContacts = contacts;
        mContext = context;
        Log.d("Richard", "============== ContactsAdapter ============ ");
        if(mContext == null)
            Log.d("Richard", "============== 111111111111111 ============ ");

        if(contacts == null)
            Log.d("Richard", "============== 111111111111111 ============ ");
    }

    //Easy access to the context object in the recylerview
    private Context getContext(){
        return mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        //Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    //Involves populating data into the item throudh holder
    @Override
    public void onBindViewHolder(ContactsAdapter.ViewHolder viewHolder, int position) {
        //Get the data model based on position
        Contact contact = mContacts.get(position);

        //Set item views based on your views and data model
        TextView textView = viewHolder.nameTextView;
        textView.setText(contact.getName());
        Button button = viewHolder.messageButton;
        button.setText("Message");

    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            messageButton = (Button) itemView.findViewById(R.id.message_button);
        }
    }
}
