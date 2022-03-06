package com.muse.notesapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.muse.notesapp.feature_note.domain.model.Note

@Database(
    // Define the table in the database
    entities = [Note::class],
    version = 1
)

// Create the database
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}