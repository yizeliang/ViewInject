package cn.yzl.abstractprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cn.yzl.viewinject.ViewInjectHelper;
import cn.yzl.viewinject.annotation.ViewInject;

public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.myview)
    TextView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjectHelper.inject(this);
        myView.setText("赋值成功了");
    }
}
