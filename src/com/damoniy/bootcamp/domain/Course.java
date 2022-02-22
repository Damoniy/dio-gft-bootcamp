package com.damoniy.bootcamp.domain;

public class Course extends LearningContent {

    private EnumCategory category;
    private int workload;

    public int getWorkload() {
        return workload;
    }

    private void setWorkload(int workload) {
        this.workload = workload;
    }

    public Course(String title, String description, EnumCategory category, int workload) {
        super(title, description);
        setTitle(title);
        setDescription(description);
        setCategory(category);
        setWorkload(workload);
    }

    public void setCategory(EnumCategory category) {
        this.category = category;
    }

    public EnumCategory getCategory() {
        return category;
    }

    @Override
    public double getContentExp() {
        return super.getContentExp() * getWorkload();
    }

    @Override public String toString() {
        return getTitle();
    }
}
