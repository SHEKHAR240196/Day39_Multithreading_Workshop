package com.bridgelabz;

import com.bridgelabz.News.NewsType;

public interface Observers {

    void onUpdate(News data);

    NewsType getNewsType();
    //NewsType getNewsType();
}
