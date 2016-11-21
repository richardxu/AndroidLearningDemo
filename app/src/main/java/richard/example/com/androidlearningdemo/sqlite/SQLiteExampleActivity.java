package richard.example.com.androidlearningdemo.sqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by richardxu on 21/11/2016.
 */

public class SQLiteExampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //setContentView(R.layout);

        //Create sample data
        User sampleUser = new User();
        sampleUser.userName = "Steph";
        sampleUser.profilePictureUrl = "https://i.imgur.com/tGbaZCY.jpg";

        Post samplePost = new Post();
        samplePost.user = sampleUser;
        samplePost.text = "HELLO";

        //Get singleton instance of database
        PostsDatabaseHelper databaseHelper = PostsDatabaseHelper.getsInstance(this);

        // Add sample post to the database
        databaseHelper.addPost(samplePost);

        //Get all posts from database
        List<Post> posts = databaseHelper.getAllPosts();
        for (Post post : posts){
            //do somethings
        }
    }

}
