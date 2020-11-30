package com.shid.newsy.ui.news;

import androidx.annotation.NonNull;

import com.shid.newsy.data.NewsItem;
import com.shid.newsy.databinding.ItemNewsImageBinding;
import com.shid.newsy.databinding.ItemNewsTextBinding;

public class TextViewHolder extends BaseViewHolder {

    ItemNewsTextBinding itemNewsTextBinding;

    public TextViewHolder(@NonNull ItemNewsTextBinding itemNewsTextBinding) {
        super(itemNewsTextBinding.getRoot());
        this.itemNewsTextBinding = itemNewsTextBinding;
    }

    @Override
    public void bindData(NewsItem item) {

        itemNewsTextBinding.setNewsItemText(item);

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
