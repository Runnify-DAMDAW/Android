package dam.moviles.runnifydamdaw

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dam.moviles.runnifydamdaw.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inicializarBinding(inflater, container)
        inicializarBoton()
        return binding.root
    }

    private fun inicializarBinding(inflater: LayoutInflater, container: ViewGroup?){
        binding = FragmentLoginBinding.inflate(inflater,container,false)
    }

    private fun inicializarBoton(){

        val nc = findNavController()
        val flecha = LoginFragmentDirections.actionLoginFragmentToMainFragment()

        Log.d("Mensaje", "Cambiando ventana")

        binding.btnLogin.setOnClickListener {
            nc.navigate(flecha)
        }
    }


}