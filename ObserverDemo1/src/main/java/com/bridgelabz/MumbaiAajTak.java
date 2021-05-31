package com.bridgelabz;

import com.bridgelabz.News.NewsType;

public class MumbaiAajTak {
    public void onUpdate(News news) {
        System.out.println("News Received by Mumbai : " + news.news);
    }

    public NewsType getNewsType() {
        return NewsType.MUMBAI;
    }
}

