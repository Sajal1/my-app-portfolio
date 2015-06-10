package adn.example.com.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button();
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

    public void button (){

       Button button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Button1 pressed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


       Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Button2 pressed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Button3 pressed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Button4 pressed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Button5 pressed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence text = "Button6 pressed";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}
