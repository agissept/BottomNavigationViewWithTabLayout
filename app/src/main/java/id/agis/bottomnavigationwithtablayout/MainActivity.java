package id.agis.bottomnavigationwithtablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.agis.bottomnavigationwithtablayout.completedjob.CompletedJobFragment;
import id.agis.bottomnavigationwithtablayout.home.HomeFragment;
import id.agis.bottomnavigationwithtablayout.uncompletedjob.UncompletedJobFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());


        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        loadFragment(new HomeFragment());
                        break;
                    case R.id.action_uncompleted_job:
                        loadFragment(new UncompletedJobFragment());
                        break;
                    case R.id.action_completed_job:
                        loadFragment(new CompletedJobFragment());
                        break;
                }
                return true;
            }
        });
    }

    void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
