package BehavioralDP.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{

    private List<String> newslist =new ArrayList<>();

    @Override
    public void update(String news) {
        newslist.add(news);
    }

    @Override
    public void printNews() {
        for (String news : newslist ) {
            System.out.println(news);
        }
    }
}
