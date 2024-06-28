package com.example.halamanawal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.halamanawal.databinding.ActivityExploreBinding

class ExploreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExploreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExploreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(MenuFragment1())

        binding.botNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.explore -> replaceFragment(MenuFragment1())
                R.id.article -> replaceFragment(MenuFragment2())
                R.id.education -> replaceFragment(MenuFragment3())

                else ->{

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction().addToBackStack(null)
        fragmentTransaction.replace(R.id.frm_lay, fragment)
        fragmentTransaction.commit()

    }
}