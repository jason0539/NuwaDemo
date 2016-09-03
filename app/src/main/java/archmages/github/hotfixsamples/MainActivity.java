package archmages.github.hotfixsamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        //修改类,如果不修改,那么patch包中将没有该类
        BugClass bugClass = new BugClass();
        textView.setText(bugClass.bug());
        //新增类
        TestAddClass testAddClass = new TestAddClass();
        View view = testAddClass.getNewView(R.mipmap.ic_launcher,this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        addContentView(view, layoutParams);
    }
}
