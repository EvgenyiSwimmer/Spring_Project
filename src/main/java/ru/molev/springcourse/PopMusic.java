package ru.molev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Popping Bottles - Chico Rose");
        songs.add("7vvch and Sinny - Time Back");
        songs.add("Halsey - Nightmare");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}