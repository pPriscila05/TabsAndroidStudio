package com.example.tarea7tabs;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SectionsPageAdapter extends FragmentStateAdapter {

    public SectionsPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                tab1 tab1 = new tab1();
                return tab1;
            case 1:
                tab2 tab2 = new tab2();
                return tab2;
            case 2:
                tab3 tab3 = new tab3();
                return tab3;
            case 3:
                tab4 tab4 = new tab4();
                return tab4;

        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
