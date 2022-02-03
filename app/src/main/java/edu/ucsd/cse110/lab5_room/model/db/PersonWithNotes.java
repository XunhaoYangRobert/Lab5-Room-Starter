package edu.ucsd.cse110.lab5_room.model.db;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import edu.ucsd.cse110.lab5_room.model.IPerson;

public class PersonWithNotes implements IPerson {
    @Embedded
    public Person person;

    @Relation(parentColumn = "id",
            entityColumn = "person_id",
            entity = Note.class,
            projection = {"text"})
    public List<String> notes;


    @Override
    public String getName() {
        return this.person.name;
    }

    @Override
    public List<String> getNotes() {
        return this.notes;
    }
}


