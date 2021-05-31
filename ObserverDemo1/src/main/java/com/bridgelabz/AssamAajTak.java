package com.bridgelabz;

import com.bridgelabz.News.NewsType;

public class AssamAajTak {

    public void onUpdate(News news) {
        System.out.println("News Received by Assam : " + news.news);
    }

    public NewsType getNewsType() {
        return NewsType.ASSAM;
    }
}

