package richard.example.com.androidlearningdemo.webview;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/15.
 */

public class ActivtyWebView extends Activity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        myWebView = (WebView) findViewById(R.id.webview);

        //Configure related browser settings
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        //Configure the client to use when opening URLs
        myWebView.setWebViewClient(new MyBrowser());

        //Load the initial URL
        myWebView.loadUrl("http://www.baidu.com");
    }

    //Manage the behavio when URLs ara loader
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }
}
