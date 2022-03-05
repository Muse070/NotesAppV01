package com.muse.notesapp.feature_note.data.data_source

import androidx.room.*
import com.muse.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

// Create a DAO to define the functions to access/ manipulate the
// data in the room database
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteByID(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}