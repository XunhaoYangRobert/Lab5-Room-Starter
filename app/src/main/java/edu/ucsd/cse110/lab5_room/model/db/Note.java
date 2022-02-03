package edu.ucsd.cse110.lab5_room.model.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {
    @PrimaryKey
    @ColumnInfo(name = "id")
    public int noteId;

    @ColumnInfo(name = "person_id")
    public int personId;

    @ColumnInfo(name = "text")
    public String text;

    public Note(int noteId, int personId, String text) {
        this.noteId = noteId;
        this.personId = personId;
        this.text = text;
    }
}
