package com.example.iqtest;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
	}

	public void fuck(View v) {
		AlertDialog.Builder fuck = new AlertDialog.Builder(this);

		fuck.setTitle("·F").setMessage("·F!!!?")
				.setPositiveButton("½T©w", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Intent dial = new Intent(Intent.ACTION_CALL, Uri
								.parse("tel:0975758212"));
						startActivity(dial);

					}
				}).show();

	}

	public void sonla(View v) {
		AlertDialog.Builder sonla = new AlertDialog.Builder(this);

		sonla.setTitle("§º³â!!!!!").setMessage("·M¤H¸`§Ö¼Ö«¢«¢«¢«¢«¢«¢«¢«¢«¢«¢")
				.setPositiveButton("½T©w", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						finish();
					}
				}).show();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question, menu);
		return true;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

		finish();
	}
	
	public void setResult(View v){
		int result = (int)(Math.random()*180);
		
		/*Bundle bundle = new Bundle();
		bundle.putInt("RESULT", result);*/
		
		Intent intent = new Intent(this, Result.class);
		//intent.putExtras(bundle);
		intent.putExtra("RESULT", result);
		
		startActivity(intent);
	}
}
