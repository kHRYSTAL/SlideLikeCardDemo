package me.khrystal.cardslidepanneldemo;

import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;
import java.util.List;

import me.khrystal.effect.DepthPageTransformer;
import me.khrystal.pager.MyAdapter;

/**
 * 在此写用途
 *
 * @FileName: me.khrystal.cardslidepanneldemo.PagerActivity.java
 * @author: kHRYSTAL
 * @email: 723526676@qq.com
 * @date: 2016-02-24 11:42
 */
public class PagerActivity extends FragmentActivity{
    ViewPager vPage = null;
    MyAdapter mAdapter = null;
    List<ImageView> mData = new ArrayList<ImageView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pager);
        getWindow().setBackgroundDrawableResource(R.drawable.purple_gradient);
        vPage = (ViewPager) findViewById(R.id.main_page);
        initView();
    }

    private void initView() {
        vPage.removeAllViews();
        getData(mData);
        mAdapter = new MyAdapter(mData, vPage);
        vPage.setAdapter(mAdapter);
        vPage.setCurrentItem(mData.size() / 2);
        vPage.setPageTransformer(true, new DepthPageTransformer());
    }

    int[] ids = new int[] { R.drawable.wall01,
            R.drawable.wall02, R.drawable.wall03,
            R.drawable.wall04 };

    private void getData(List<ImageView> data) {
        data.clear();
        for (int i = 0; i < ids.length; i++) {
            ImageView image = new ImageView(this);
            //
            image.setImageResource(ids[i]);
            data.add(image);
        }
    }
}
