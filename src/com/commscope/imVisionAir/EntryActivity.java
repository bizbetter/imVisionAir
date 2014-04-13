package com.commscope.imVisionAir;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EntryActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button)findViewById(R.id.buttonOK);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonOK){
            TextView view1 = (TextView)findViewById(R.id.messageMain);
            view1.setText("Good Test");
        }
    }
}
