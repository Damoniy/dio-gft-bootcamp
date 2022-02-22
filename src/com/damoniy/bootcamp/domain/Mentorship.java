package com.damoniy.bootcamp.domain;

import java.time.LocalDate;

public class Mentorship extends LearningContent {
    private final LocalDate date = LocalDate.now();

    public Mentorship(String title, String description) {
        super(title, description);
        setTitle(title);
        setDescription(description);
    }

    public LocalDate getDate() {
        return date;
    }

    @Override public String toString() {
        return super.getTitle();
    }
}
