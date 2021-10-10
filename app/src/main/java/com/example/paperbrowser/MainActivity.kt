package com.example.paperbrowser

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.w_b)
        webView.webViewClient = WebViewClient()
        webView.apply{
            loadUrl("https://duckduckgo.com/")
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled = true
        }
    }

    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
    


}