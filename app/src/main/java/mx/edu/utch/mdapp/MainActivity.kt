package mx.edu.utch.mdapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import mx.edu.utch.mdapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabPrincipal.setOnClickListener{
            Toast.makeText(this,"Fab prin", Toast.LENGTH_SHORT).show()
        }

        binding.cuadritoOwo.btnCardComprar.setOnClickListener{
            Toast.makeText(this,"I'm buying this owo", Toast.LENGTH_SHORT).show()
        }

        binding.cuadritoOwo.btnCardCancelar.setOnClickListener{
            Toast.makeText(this,"I'm not buying this u.u", Toast.LENGTH_SHORT).show()
        }

        setSupportActionBar(binding.mainBottomAppBar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.option_1 ->{
                newGame()
                true
            }
            R.id.option_2->{
                showHelp()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showHelp() {
        Log.e("Click","opt 1")
    }

    private fun newGame() {
        Log.e("Click","opt 2")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_owo, menu)
        return true
    }

}