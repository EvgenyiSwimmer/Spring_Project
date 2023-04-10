package ru.molev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Rammstein - Ich Will");
        songs.add("Linkin Park - In The End");
        songs.add("Papa Roach - Last Resort");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}