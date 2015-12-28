package com.example.jpulltorefreshtest;

import com.markupartist.android.widget.PullToRefreshListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
	PullToRefreshListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
	private void init() {
		mListView=new PullToRefreshListView(this);
		
	}


}
