package edu.ucsd.cse110.lab5_room.model;

import java.util.Arrays;
import java.util.List;

public class DummyPerson implements IPerson {
    private final String name;
    private final List<String> notes;

    public DummyPerson(String name, String[] notes) {
        this.name = name;
        this.notes = Arrays.asList(notes);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getNotes() {
        return notes;
    }
}
