package id.agis.bottomnavigationwithtablayout.home;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import id.agis.bottomnavigationwithtablayout.R;
import id.agis.bottomnavigationwithtablayout.home.feedback.FeedBackFragment;
import id.agis.bottomnavigationwithtablayout.home.news.NewsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior, Context context) {
        super(fm, behavior);
        this.context = context;
    }

    @StringRes
    private final int[] tabTitles = new int[]{
            R.string.news,
            R.string.feedback
    };

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new NewsFragment();
                break;
            case 1:
                fragment = new FeedBackFragment();
                break;

        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return context.getResources().getString(tabTitles[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
