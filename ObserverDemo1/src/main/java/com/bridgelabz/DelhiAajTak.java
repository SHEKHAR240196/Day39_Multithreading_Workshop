package com.bridgelabz;

import com.bridgelabz.News.NewsType;

public class DelhiAajTak {

    public void onUpdate(News news) {
        System.out.println("News Received by Delhi : " + news.news);
    }

    public News.NewsType getNewsType() {
        return NewsType.DELHI;
    }
}
