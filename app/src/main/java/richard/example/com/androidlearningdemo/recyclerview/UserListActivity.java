package richard.example.com.androidlearningdemo.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import richard.example.com.androidlearningdemo.R;
import richard.example.com.androidlearningdemo.recyclerview.adapter.ContactsAdapter;
import richard.example.com.androidlearningdemo.recyclerview.model.Contact;

/**
 * Created by Administrator on 2016/11/17.
 */

public class UserListActivity extends AppCompatActivity {

    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_users);
        //Lookup the recylerview in activity layout
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        //Initialize contacts
        contacts = Contact.createContactsList(20);
        //Create adapter passing in the sample user data

        ContactsAdapter adapter = new ContactsAdapter(this, contacts);
        if(adapter == null)
            Log.d("UserListActivity", "============== 111111111111111 ============ ");

        if(rvContacts == null)
            Log.d("rvContacts", "============== 111111111111111 ============ ");
        //Attach the adapter to the recylerview to populate items
        rvContacts.setAdapter(adapter);
        //Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}
