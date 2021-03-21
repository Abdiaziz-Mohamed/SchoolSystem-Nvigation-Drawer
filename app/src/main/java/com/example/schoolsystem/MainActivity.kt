package com.example.schoolsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentTransaction
import com.example.schoolsystem.Fragments.*
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var LogoutFragment: LogoutFragment
    lateinit var studentFragment: StudentFragment
    lateinit var searchFragment: SearchFragment
    lateinit var dashboardFragment: DashboardFragment
    lateinit var profileFragment: ProfileFragment
    lateinit var financialsFragment: FinancialsFragment
    lateinit var academicsFragment: AcademicsFragment
    lateinit var timetableFragment: TimetableFragment
    lateinit var assignmentsFragment: AssignmentsFragment
    lateinit var my_Performancefragment: My_PerformanceFragment
    lateinit var coCurriculumactivitiesfragment: Co_CurriculumActivitiesFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar);
        val actionBar = supportActionBar
        actionBar?.title = "Navigation Drawer"

        val drawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle (
                this,
                DrawerLayout,
                toolbar,
                (R.string.open),
                (R.string.close)
        ) {

        }
        drawerToggle.isDrawerIndicatorEnabled = true
        DrawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        nav_view.setNavigationItemSelectedListener (this)

        // Now implement navigation item selected listener
        //the default fragment is Dashboard
        dashboardFragment = DashboardFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.Frame_layout, dashboardFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
        //so this is our fragment code
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        //now create our related fragments
        when (menuItem.itemId) {
            R.id.dashboard ->{
                dashboardFragment = DashboardFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, dashboardFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.profile ->{
                profileFragment = ProfileFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, profileFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.financials ->{
                financialsFragment = FinancialsFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, financialsFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.academics ->{
                academicsFragment = AcademicsFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, academicsFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.timetable ->{
                timetableFragment = TimetableFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, timetableFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.assignments ->{
                assignmentsFragment = AssignmentsFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, assignmentsFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.myperformance ->{
                my_Performancefragment = My_PerformanceFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, my_Performancefragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.cocurriculum ->{
                coCurriculumactivitiesfragment = Co_CurriculumActivitiesFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, coCurriculumactivitiesfragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.search ->{
                searchFragment = SearchFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, searchFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.Logout->{
                LogoutFragment = LogoutFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, LogoutFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.Student ->{
                studentFragment = StudentFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.Frame_layout, studentFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
        }
        DrawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (DrawerLayout.isDrawerOpen(GravityCompat.START)) {
            DrawerLayout.closeDrawer(GravityCompat.START)
        } else{
            super.onBackPressed()
    }

    }
}