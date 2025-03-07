package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dam.moviles.runnifydamdaw.R
import dam.moviles.runnifydamdaw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inicializarBinding()
        inicializarToolbar()
        setContentView(binding.root)
    }

    fun inicializarToolbar(){
        setSupportActionBar(binding.materialToolbar)
    }

    fun inicializarBinding(){
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}