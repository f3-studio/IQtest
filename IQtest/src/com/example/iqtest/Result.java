package com.example.iqtest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Result extends Activity {

	private TextView resultTV;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		//Bundle bundle = this.getIntent().getExtras();
		//int result = Integer.valueOf(bundle.getInt("RESULT"));
		int result = this.getIntent().getIntExtra("RESULT", 190);
		
		resultTV=(TextView)findViewById(R.id.result);
		
		resultTV.setText("你的智商是：" + String.valueOf(result) + "!!! \n\n");
		if(result<50) resultTV.append("你根本就是智障哈哈哈哈哈哈!!");
		else if(result>=50 && result<100) resultTV.append("嗯...根本腦");
		else if(result>=100 && result<150) resultTV.append("你只是個沒有價值的普通人");
		else if(result>=150 && result<179) resultTV.append("幹~~民國百年難得一見的天才");
		else if(result==179) resultTV.append("吃我ㄉ大屌喇!!!!!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

		finish();
	}

}
