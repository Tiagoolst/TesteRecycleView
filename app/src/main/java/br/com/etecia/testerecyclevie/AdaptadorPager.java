package br.com.etecia.testerecyclevie;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdaptadorPager extends FragmentStateAdapter {

    public AdaptadorPager (MainActivity mainActivity){
        super(FragmentActivity);
    }

}
