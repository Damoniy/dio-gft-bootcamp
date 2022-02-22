package com.damoniy.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class User {
    private String name;
    private Set<LearningContent> subscribedContent = new LinkedHashSet();
    private Set<LearningContent> learnedContent = new LinkedHashSet();

    public User(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUserProfileExp() {
        return this.learnedContent.stream().mapToDouble(LearningContent::getContentExp).sum();
    }

    public Set<LearningContent> getSubscribedContent() {
        return new LinkedHashSet(subscribedContent);
    }

    public void signBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
    }

    public void goBeyond() {
        Optional<LearningContent> content = this.subscribedContent.stream().findFirst();
        if(!content.isPresent()) {
            throw new IllegalStateException("O usuário não está inscrito em nenhum bootcamp.");
        }
        update(content.get());
    }

    private void update(LearningContent content) {
        this.learnedContent.add(content);
        this.subscribedContent.remove(content);
    }

    public Set<LearningContent> getLearnedContent() {
        return new LinkedHashSet(learnedContent);
    }

    public void setContentLearned(Set<LearningContent> learnedContent) {
        for(LearningContent content : learnedContent) {
            if (!this.learnedContent.contains(content)) {
                this.learnedContent.add(content);
            }
        }
    }

    @Override public String toString() {
        return getName();
    }
}
