package com.example.fernandogodinez.loteria;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class play extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
	
    public void seleccionarObjetivo3x3(View view){
        Intent seleccionar_objetivo = new Intent(play.this,Seleccionar_objetivo.class);
		seleccionar_objetivo.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
        startActivity(seleccionar_objetivo);
    }

    public void seleccionarObjetivo4x4(View view){
        Intent seleccionar_objetivo = new Intent(play.this,Seleccionar_objetivo.class);
		seleccionar_objetivo.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
        startActivity(seleccionar_objetivo);
    }

    public void seleccionarObjetivo5x5(View view){
        Intent seleccionar_objetivo = new Intent(play.this,Seleccionar_objetivo.class);
		seleccionar_objetivo.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
        startActivity(seleccionar_objetivo);
    }
	
}
