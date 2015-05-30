package com.example.fernandogodinez.loteria;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Seleccionar_objetivo extends ActionBarActivity {
	
	private int tamanio_tabla;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_objetivo);
		
		Bundle bundle = getIntent().getExtras();
		tamanio_tabla = bundle.getInt("tamanio_tabla");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seleccionar_objetivo, menu);
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
	
    public void seleccionarModoTradicional(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "tradicional");//modo_juego = "tradicional"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "tradicional");//modo_juego = "tradicional"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "tradicional");//modo_juego = "tradicional"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoTradicional

    public void seleccionarModoEsquinas(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "esquinas");//modo_juego = "esquinas"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "esquinas");//modo_juego = "esquinas"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "esquinas");//modo_juego = "esquinas"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoEsquinas

    public void seleccionarModoDiagIzq(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "diag_izquierda");//modo_juego = "diag_izquierda"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "diag_izquierda");//modo_juego = "diag_izquierda"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "diag_izquierda");//modo_juego = "diag_izquierda"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoDiagIzq
	
    public void seleccionarModoDiagDer(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "diag_derecha");//modo_juego = "diag_derecha"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "diag_derecha");//modo_juego = "diag_derecha"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "diag_derecha");//modo_juego = "diag_derecha"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoDiagDer

    public void seleccionarModoHoriz(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "horizontal");//modo_juego = "horizontal"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "horizontal");//modo_juego = "horizontal"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "horizontal");//modo_juego = "horizontal"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoHoriz

    public void seleccionarModoVert(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "vertical");//modo_juego = "vertical"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "vertical");//modo_juego = "vertical"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "vertical");//modo_juego = "vertical"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoVert

    public void seleccionarModoCruz(View view){
		if(tamanio_tabla==33){
			Intent tabla3x3 = new Intent(Seleccionar_objetivo.this,Tabla3x3.class);
			tabla3x3.putExtra("tamanio_tabla", 33);//tamanio_tabla = tabla 3x3
			tabla3x3.putExtra("modo_juego", "cruz");//modo_juego = "cruz"
			startActivity(tabla3x3);
		}
		if(tamanio_tabla==44){
			Intent tabla4x4 = new Intent(Seleccionar_objetivo.this,Tabla4x4.class);
			tabla4x4.putExtra("tamanio_tabla", 44);//tamanio_tabla = tabla 4x4
			tabla4x4.putExtra("modo_juego", "cruz");//modo_juego = "cruz"
			startActivity(tabla4x4);
		}
		if(tamanio_tabla==55){
			Intent tabla5x5 = new Intent(Seleccionar_objetivo.this,Tabla5x5.class);
			tabla5x5.putExtra("tamanio_tabla", 55);//tamanio_tabla = tabla 5x5
			tabla5x5.putExtra("modo_juego", "cruz");//modo_juego = "cruz"
			startActivity(tabla5x5);
		}
    }//fin de seleccionarModoCruz
	
}
