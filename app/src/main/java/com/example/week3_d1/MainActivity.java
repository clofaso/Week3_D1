package com.example.week3_d1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
int i = 0;
TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.tv1);
        mTextView.setOnClickListener(view -> {
            ((TextView)view).setTextSize(20+i++);
        });

        findViewById(R.id.btn1).setOnClickListener(this::toShwToast);

    }

    private void toShwToast(View view) {
        Toast.makeText(MainActivity.this, "Christine was here", Toast.LENGTH_LONG).show();
    }

    public void shwSB(View view) {
        Snackbar sb = Snackbar.make(view,"C.LoFaso was here", Snackbar.LENGTH_LONG);
        sb.show();
    }

    class MyLstnr implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            findViewById(R.id.btn3).setOnClickListener(view1 -> {
                mTextView.setText("Hello Christine");
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}