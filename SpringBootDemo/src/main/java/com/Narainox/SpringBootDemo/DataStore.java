package com.Narainox.SpringBootDemo;
import java.util.HashMap;

public class DataStore {
    private  HashMap<String,String> store=new HashMap<>();
    DataStore()
    {
        store.put("Ayush","A Good Coder.");
        store.put("Abhay","A Good Financer.");
        store.put("gfg","Great Website.");
        store.put("Ayushi","A Good LudoPlayer.");
    }
    public String searchAWord(String word)
    {
        return store.get(word);
    }
}
