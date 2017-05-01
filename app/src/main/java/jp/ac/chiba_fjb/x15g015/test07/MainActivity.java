package jp.ac.chiba_fjb.x15g015.test07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //インスタンスの取得
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);

        //イベントの処理
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        //クラスのプロパティにする
        mTextView = (TextView) findViewById(R.id.textView);
    }

        if(v.getId() == R.id.b1)
            mTextView.setText("ボタン１がおされました");
        else if(v.getId() == R.id.b2)
            mTextView.setText("ボタン２がおされました");
        else if(v.getId() == R.id.b3)
            mTextView.setText("ボタン３がおされました");
        else if(v.getId() == R.id.b4)
            mTextView.setText("ボタン４がおされました");
    }


}
