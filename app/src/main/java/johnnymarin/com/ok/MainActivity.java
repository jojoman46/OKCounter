package johnnymarin.com.ok;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


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
    Integer i = 0, i1=0, i2=0;
    String s = "",s1 = "",s2 = "";
    public void isItClear(View v){
        Button button = (Button) v;
        i++;
        s = (""+i);
        ((Button) v).setText(s);
    }

    public void infernalButton(View v){
        Button button = (Button) v;
        i1++;
        s1 = (""+i1);
        ((Button) v).setText(s1);
    }
    public void okButton(View v){
        Button button = (Button) v;
        i2++;
        s2 = (""+i2);
        ((Button) v).setText(s2);
    }
}
