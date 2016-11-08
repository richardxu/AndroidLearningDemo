package richard.example.com.androidlearningdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Administrator on 2016/11/8.
 */

public class SplashScreen extends Activity {

    // Splash screen timer
    private static int SPLASH_TIMEOUT_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIMEOUT_OUT);

        /**
         * show splashscreen from network calls
         */

    }

    /**
     * Async Task to make http call
     */
    private class PrefectchData extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            /*
             * Will make http call here This call will download required data
             * before launching the app
             * example:
             * 1. Downloading and storing in SQLite
             * 2. Downloading images
             * 3. Fetching and parsing the xml / json
             * 4. Sending device information to server
             * 5. etc.,
             */
//            JsonParser jsonParser = new JsonParser();
//            String json = jsonParser
//                    .getJSONFromUrl("http://api.androidhive.info/game/game_stats.json");
//
//            Log.e("Response: ", "> " + json);
//
//            if (json != null) {
//                try {
//                    JSONObject jObj = new JSONObject(json)
//                            .getJSONObject("game_stat");
//                    now_playing = jObj.getString("now_playing");
//                    earned = jObj.getString("earned");
//
//                    Log.e("JSON", "> " + now_playing + earned);
//
//                } catch (JSONException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//
//            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
//            // After completing http call
//            // will close this activity and lauch main activity
//            Intent i = new Intent(SplashScreen.this, MainActivity.class);
//            i.putExtra("now_playing", now_playing);
//            i.putExtra("earned", earned);
//            startActivity(i);
//
//            // close this activity
//            finish();
//        }
        }
    }

}
