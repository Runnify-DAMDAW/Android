package dam.moviles.runnifydamdaw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dam.moviles.runnifydamdaw.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    private fun inicializarBinding(inflater: LayoutInflater, container: ViewGroup?){
        binding = FragmentLoginBinding.inflate(inflater,container,false)
    }


}