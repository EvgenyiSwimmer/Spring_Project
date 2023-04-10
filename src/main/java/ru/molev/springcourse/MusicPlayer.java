package ru.molev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else if (genre == MusicGenre.ROCK){
            System.out.println(rockMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(popMusic.getSongs().get(randomNumber));
        }
    }
}