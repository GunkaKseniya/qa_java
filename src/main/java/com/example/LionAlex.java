package com.example;

import java.util.List;

public class LionAlex extends Lion {
    public static final String GENDER_ALEX = "Самец";

    public LionAlex(Feline feline) throws Exception {
        super(GENDER_ALEX, feline);
    }

    @Override
    public int getKittens() {
        return super.getKittens(); // Используем метод из родительского класса
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}