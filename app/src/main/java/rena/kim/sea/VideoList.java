package rena.kim.sea;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoList extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_list);
        WebView wv1 = findViewById(R.id.wv1);
        WebView wv2 = findViewById(R.id.wv2);
        WebView wv3 = findViewById(R.id.wv3);

        String video1 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/O-6f5wQXSu8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
        String video2 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/z6X5oEIg6Ak\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
        String video3 = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/xRxT9cOKiM8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";

        WebSettings ws1 = wv1.getSettings();
        ws1.setJavaScriptEnabled(true);
        wv1.loadData(video1, "text/html", "utf-8");

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
