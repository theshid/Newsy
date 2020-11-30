package com.shid.newsy.ui.news;

import androidx.annotation.NonNull;

import com.shid.newsy.data.NewsItem;
import com.shid.newsy.databinding.ItemNewsImageBinding;
import com.shid.newsy.databinding.ItemNewsTextBinding;

public class ImageViewHolder extends BaseViewHolder {

    ItemNewsImageBinding itemNewsImageBinding;

    public ImageViewHolder(@NonNull ItemNewsImageBinding itemNewsImageBinding) {
        super(itemNewsImageBinding.getRoot());
        this.itemNewsImageBinding = itemNewsImageBinding;
    }

    @Override
    public void bindData(NewsItem item) {

        itemNewsImageBinding.setNewsItemImage(item);

    }

    @Override
    public ItemNewsTextBinding getItemNewsTextBinding() {
        return null;
    }

    @Override
    public ItemNewsImageBinding getItemNewsImageBinding() {
        return null;
    }

}
