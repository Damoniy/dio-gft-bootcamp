package com.damoniy.bootcamp.domain;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String title;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endingDate = startDate.plusDays(45);
    private final Set<User> users = new LinkedHashSet<>();
    private final Set<LearningContent> contents = new LinkedHashSet<>();

    public Bootcamp(String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void subscribeUser(User user) {
        if(users.contains(user)) {
            throw new IllegalStateException("Usuário já inscrito no bootcamp.");
        }
        this.users.add(user);
        user.signBootcamp(this);
    }

    public void addContent(LearningContent content) {
        if(contains(content)) {
            throw new IllegalStateException("Conteúdo já existe no bootcamp.");
        }
        contents.add(content);
    }

    private boolean contains(LearningContent content) {
        return contents.contains(content);
    }

    public Set<LearningContent> getContents() {
        return new LinkedHashSet(contents);
    }

    @Override public String toString() {
        return getTitle();
    }
}
