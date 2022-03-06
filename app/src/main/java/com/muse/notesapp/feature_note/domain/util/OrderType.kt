package com.muse.notesapp.feature_note.domain.util

sealed class OrderType {
    // object keyword ensures we create only one instance of the class
    // the kotlin compiler makes the constructor private, creates a static reference for the object,
    // and initializes the reference only in a static block.
    // Static blocks are called only once when the static field is first accessed.
    object Ascending: OrderType()
    object Descending: OrderType()
}
