package com.damoniy.bootcamp.domain;

abstract class LearningContent {
    protected static final Double defaultExp = 10d;
    private String title;
    private String description;

    public LearningContent(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getContentExp() {
        return this.defaultExp;
    }
}
