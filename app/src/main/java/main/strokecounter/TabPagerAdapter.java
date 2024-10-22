package main.strokecounter;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import main.strokecounter.fragments.CreateCourseFragment;
import main.strokecounter.fragments.EditCourseFragment;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    Storage storage;
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CreateCourseFragment();
            case 1:
                return new EditCourseFragment();
            default:
                return new CreateCourseFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
