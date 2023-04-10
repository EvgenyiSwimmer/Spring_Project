package ru.molev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Моцарт - Дон Жуан");
        songs.add("Шопен - Вальс №19 Ля минор");
        songs.add("Чайковский - Щелкунчик");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}