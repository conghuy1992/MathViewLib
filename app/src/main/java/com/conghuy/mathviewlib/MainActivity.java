package com.conghuy.mathviewlib;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        MathView tvContent = (MathView) findViewById(R.id.tvContent);
        tvContent.setText(msg);
    }

    String msg= "<math style=\"font-family:'Times New Roman'\" xmlns=\"http://www.w3.org/1998/Math/MathML\"><mstyle mathsize=\"14px\"><mn>1</mn><mo>.</mo><mo>&#xA0;</mo><mi>&#x110;&#x1ECB;nh</mi><mo>&#xA0;</mo><mi>ngh&#x129;a</mi><mspace linebreak=\"newline\"/><mi>Cho</mi><mo>&#xA0;</mo><mi>h&#xE0;m</mi><mo>&#xA0;</mo><mi>s&#x1ED1;</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">y</mi><mo>=</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mi>x&#xE1;c</mi><mo>&#xA0;</mo><mi>&#x111;&#x1ECB;nh</mi><mo>&#xA0;</mo><mi>tr&#xEA;n</mi><mo>&#xA0;</mo><mi>t&#x1EAD;p</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">D</mi><mspace linebreak=\"newline\"/><mo>.</mo><mo>&#xA0;</mo><mi mathvariant=\"normal\">M</mi><mo>&#xA0;</mo><mi>&#x111;&#x1B0;&#x1EE3;c</mi><mo>&#xA0;</mo><mi>g&#x1ECD;i</mi><mo>&#xA0;</mo><mi>l&#xE0;</mi><mo>&#xA0;</mo><mi>GTLN</mi><mo>&#xA0;</mo><mi>c&#x1EE7;a</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mi>tr&#xEA;n</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">D</mi><mo>&#xA0;</mo><mi>n&#x1EBF;u</mi><mo>:</mo><mo>&#xA0;</mo><mfenced open=\"{\" close=\"\"><mtable columnalign=\"left\"><mtr><mtd><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mo>&#x2264;</mo><mi mathvariant=\"normal\">M</mi></mtd></mtr><mtr><mtd><mo>&#x2203;</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>,</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>)</mo><mo>&#xA0;</mo><mo>=</mo><mo>&#xA0;</mo><mi mathvariant=\"normal\">M</mi></mtd></mtr></mtable></mfenced><mspace linebreak=\"newline\"/><mo>.</mo><mo>&#xA0;</mo><mi mathvariant=\"normal\">m</mi><mo>&#xA0;</mo><mi>&#x111;&#x1B0;&#x1EE3;c</mi><mo>&#xA0;</mo><mi>g&#x1ECD;i</mi><mo>&#xA0;</mo><mi>l&#xE0;</mi><mo>&#xA0;</mo><mi>GTNN</mi><mo>&#xA0;</mo><mi>c&#x1EE7;a</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>&#xA0;</mo><mi>tr&#xEA;n</mi><mo>&#xA0;</mo><mi mathvariant=\"normal\">D</mi><mo>&#xA0;</mo><mi>n&#x1EBF;u</mi><mo>:</mo><mo>&#xA0;</mo><mfenced open=\"{\" close=\"\"><mtable columnalign=\"left\"><mtr><mtd><mi mathvariant=\"normal\">m</mi><mo>&#x2264;</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><mi mathvariant=\"normal\">x</mi><mo>)</mo><mo>,</mo><mo>&#x2200;</mo><mi mathvariant=\"normal\">x</mi><mo>&#x2208;</mo><mi mathvariant=\"normal\">D</mi></mtd></mtr><mtr><mtd><mo>&#x2200;</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>&#x2208;</mo><mi mathvariant=\"normal\">D</mi><mo>,</mo><mi mathvariant=\"normal\">f</mi><mo>(</mo><msub><mi mathvariant=\"normal\">x</mi><mn>0</mn></msub><mo>)</mo><mo>=</mo><mi mathvariant=\"normal\">m</mi></mtd></mtr></mtable></mfenced></mstyle></math>";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
