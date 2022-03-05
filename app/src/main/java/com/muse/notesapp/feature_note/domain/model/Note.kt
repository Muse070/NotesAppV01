package com.muse.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.muse.notesapp.ui.theme.*

// We are modelling the data that each Note will contain
// as well as the attributes of the entity
@Entity
class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    // Companion object allows 'noteColors' to be called without
    // the need of a function name inside the Note class
    companion object {
     val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}