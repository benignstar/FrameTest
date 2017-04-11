package benignstar.kr.hs.emirim.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but[]=new Button[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < but.length; i++) {
            but[i] = (Button) findViewById(R.id.but1 + i);

        }
    }

}
