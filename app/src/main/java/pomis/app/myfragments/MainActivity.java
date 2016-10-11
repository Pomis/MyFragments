package pomis.app.myfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Page> pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArray();
        initViewPager();
        openDefaultPage();
    }

    private void initArray() {
        pages = new ArrayList<>();
        pages.add(new Page(new BlankFragment(), "Первая страница"));
        pages.add(new Page(new BlankFragment2(), "Вторая страница"));
    }

    void initViewPager(){
        viewPager = (ViewPager) findViewById(R.id.vp_main_pager);

        viewPager.setAdapter(new FragmentStatePagerAdapter(
                getSupportFragmentManager()
        ) {
            @Override
            public Fragment getItem(int position) {
                return pages.get(position).resource;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return String.valueOf(position);
            }

            @Override
            public int getCount() {
                return pages.size();
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle(pages.get(position).title);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void openDefaultPage() {
        viewPager.setCurrentItem(0);
        setTitle(pages.get(0).title);
    }
}
