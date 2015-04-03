package com.example.jonathan.reproductor;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

   ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lvcansiones);

        String[] cansiones = {"AC/DC ","No woman no cry","Magic the rude","Let her go","Perfect"};
        //int[] imagenes = {R.drawable.acdcicon,R.drawable.canciondosicono,R.drawable.magicicono,R.drawable.leticono,R.drawable.canticono};

        //Manipular los datos del array
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cansiones);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                int itemPosition = posicion;
                String itemValue = (String) listView.getItemAtPosition(posicion);
                switch (posicion) {
                    case 0:
                        Intent cancion1 = new Intent(getApplicationContext(), Cancion1.class);
                        startActivity(cancion1);
                        break;
                    case 1:
                        Intent cancion2 = new Intent(getApplicationContext(), Cancion2.class);
                        startActivity(cancion2);
                        break;
                    case 2:
                        Intent cancion3 = new Intent(getApplicationContext(), Cancion3.class);
                        startActivity(cancion3);
                        break;
                    case 3:
                        Intent cancion4 = new Intent(getApplicationContext(), Cancion4.class);
                        startActivity(cancion4);
                        break;
                    case 4:
                        Intent cancion5 = new Intent(getApplicationContext(), Cancion5.class);
                        startActivity(cancion5);
                        break;

                }

            }
        });

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
}
