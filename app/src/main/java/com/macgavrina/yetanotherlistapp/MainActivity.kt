package com.macgavrina.yetanotherlistapp

import android.os.Bundle
import android.util.Log
import androidx.core.view.GravityCompat
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.ui.NavigationUI
import androidx.navigation.findNavController
import androidx.navigation.ui.navigateUp


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        setupNavigationComponent()
    }

    override fun onBackPressed() {
        Log.d("MyApp","onBackPressed")
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        Log.d("MyApp", "on option item selected")

        when (item?.itemId) {
            android.R.id.home -> {
                //Handle home button (hamburger or back) instead of navigation component
                Log.d("MyApp", "It was home button!")
                val navController = findNavController(R.id.nav_host)
                val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
                navController.navigateUp(drawerLayout)
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setupNavigationComponent() {

        val navView: NavigationView = findViewById(R.id.nav_view)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)

        //Setup Navigation (from arch components)
        val navController = findNavController(R.id.nav_host)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            Log.d("MyApp", "OnDestinationChanged, destination = ${destination.label}")
        }

        //To handle navigation from side menu with Navigation component
        NavigationUI.setupWithNavController(navView, navController)

        //To handle top app bar with navigation component
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
    }
}
