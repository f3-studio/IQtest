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
		
		resultTV.setText("�A�����ӬO�G" + String.valueOf(result) + "!!! \n\n");
		if(result<50) resultTV.append("�A�ڥ��N�O���٫�����������!!");
		else if(result>=50 && result<100) resultTV.append("��...�ڥ���");
		else if(result>=100 && result<150) resultTV.append("�A�u�O�ӨS�����Ȫ����q�H");
		else if(result>=150 && result<179) resultTV.append("�F~~����ʦ~���o�@�����Ѥ~");
		else if(result==179) resultTV.append("�Y�ڣx�j�x��!!!!!");
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
