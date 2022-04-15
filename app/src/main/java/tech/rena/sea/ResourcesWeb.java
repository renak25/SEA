package tech.rena.sea;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResourcesWeb extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resourcesweb);
        WebView myWebView = (WebView) findViewById(R.id.website1);
        myWebView.loadUrl("https://www.cdc.gov/healthyyouth/mental-health/index.htm");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClientClass());
    }

    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest wrr) {
            Log.d("check URL", String.valueOf(wrr.getUrl()));
            view.loadUrl(String.valueOf(wrr.getUrl()));
            return true;
        }
    }
}

