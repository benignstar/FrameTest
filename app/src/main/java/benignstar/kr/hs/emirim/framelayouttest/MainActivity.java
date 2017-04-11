package benignstar.kr.hs.emirim.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.R.attr.visible;

public class MainActivity extends AppCompatActivity {
    Button but[]=new Button[3];
    LinearLayout lLayout[]=new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < but.length; i++) {
            but[i] = (Button) findViewById(R.id.but1 + i);
            but[i].setOnClickListener(butClick);
        }
        for(int i=0; i<lLayout.length; i++)
            lLayout[i]=(LinearLayout)findViewById(R.id.Linear1+i);
    }

    View.OnClickListener butClick=new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            for(int i=0; i<lLayout.length; i++) {
                if (view.getId() == R.id.but1 + i) lLayout[i].setVisibility(View.VISIBLE);
                else lLayout[i].setVisibility(View.INVISIBLE);
            }
        }
    };

}
