package com.codecool.java.ccms_2xa.model.records;

public class Assignment {
    private int id;
    private String description;

    public Assignment (int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }
}
