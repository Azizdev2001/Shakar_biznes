package com.example.shakarbiznes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.shakarbiznes.databinding.ActivityMainBinding
import com.example.shakarbiznes.fragments.BoshFragment
import com.example.shakarbiznes.fragments.HisobotFragment
import com.example.shakarbiznes.fragments.KlientFragment
import com.example.shakarbiznes.fragments.SkladFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val boshFragment = BoshFragment()
    private val hisobotFragment = HisobotFragment()
    private val klientFragment = KlientFragment()
    private val skladFragment = SkladFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(boshFragment)

        binding.bottomNavView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.bosh_sahifa -> replaceFragment(boshFragment)
                R.id.kunlik_hisobot -> replaceFragment(hisobotFragment)
                R.id.klientlar -> replaceFragment(klientFragment)
                R.id.sklad -> replaceFragment(skladFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container , fragment)
            transaction.commit()
        }
    }

}