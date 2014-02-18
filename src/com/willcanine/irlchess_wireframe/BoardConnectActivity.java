package com.willcanine.irlchess_wireframe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class BoardConnectActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_board_connect);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.board_connect, menu);
		return true;
	}
	
	public void gotoPlayerLoginActivity(View v){
		
		Intent i = new Intent (this, PlayerLoginActivity.class);
		startActivity(i);
		
	}
	
public void gotoWelcomeActivity(View v){
		
		Intent i = new Intent (this, Welcome.class);
		startActivity(i);
		
	}

}
