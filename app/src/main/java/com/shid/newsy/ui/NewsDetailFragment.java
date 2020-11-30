package com.shid.newsy.ui;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shid.newsy.R;
import com.shid.newsy.data.FakeDataSource;
import com.shid.newsy.data.NewsItem;
import com.shid.newsy.databinding.FragmentNewsDetailBinding;


public class NewsDetailFragment extends Fragment {

    public NewsDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        FragmentNewsDetailBinding fragmentNewsDetailsBinding =
                DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_news_detail,container,false);

        // we need to test if databinding works fine : so we need a news item
        // we can get a random item from the datasource class

        FakeDataSource fakeDataSource = new FakeDataSource();
        NewsItem item =fakeDataSource.generateRandomNewsItem();

        item.setFav(true);
        fragmentNewsDetailsBinding.setNewsItemData(item);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_detail, container, false);
    }
}