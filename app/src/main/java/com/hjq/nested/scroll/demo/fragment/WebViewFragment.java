package com.hjq.nested.scroll.demo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;

import com.hjq.nested.scroll.demo.R;
import com.hjq.nested.scroll.layout.NestedScrollWebView;

public class WebViewFragment extends Fragment {

   @Nullable
   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      NestedScrollWebView nestedScrollWebView = (NestedScrollWebView) inflater.inflate(R.layout.fragment_web_view, container, false);
      nestedScrollWebView.setWebViewClient(new WebViewClient());
      nestedScrollWebView.loadUrl("https://github.com/getActivity");
      return nestedScrollWebView;
   }
}