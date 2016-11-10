package richard.example.com.androidlearningdemo.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/10.
 */

public class TabLayoutFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tabs_layout);

        // Get the ViewPager and set it's PagerAdapter so that is can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(), TabLayoutFragment.this));

        //Give the TabLayout the viewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
