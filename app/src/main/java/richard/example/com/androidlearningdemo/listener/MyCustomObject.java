package richard.example.com.androidlearningdemo.listener;

import org.json.JSONObject;

/**
 * Created by Administrator on 2016/11/18.
 */

public class MyCustomObject {

    //Step 1 - This interface defines the type of messages I want to communicate to my owner
    public interface MyCustomObjectListener {
            //These methods are the different events and
            // need to pass relevant arguments related to the event triggered
        public void ObjectReady(String title);
        //or when data has been loader
//        public void onDataLoader(SomeData data);
        public void onDataLoader();
    }

    //Step 2 - This variable represents the listener passed in by the owning object
    // The listener must implement the events interface and passes messages up to the parent
    private MyCustomObjectListener listener;


    //Constructor where listener events are ignored
    public MyCustomObject(){
            // set null or default listener or accept as argument to constructor
            this.listener = null;
            loadDataAsync();
    }

    //... setter defined here as shown earlier
    public void loadDataAsync() {
//        AsyncHttpClient client = new AsyncHttpClient();
//        client.get("https://mycustomapi.com/data/get.json", new JsonHttpResponseHandler() {
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
//                // Networking is finished loading data, data is processed
//                SomeData data = SomeData.processData(response.get("data"));
//                // Do some other stuff as needed....
//                // Now let's trigger the event
//                if (listener != null)
//                    listener.onDataLoaded(data); // <---- fire listener here
//            }
//        });
    }


        // Assign the listener implementing events interface that will receive the events
        public void setCustomObjectListener(MyCustomObjectListener listener) {
            this.listener = listener;
        }
}
