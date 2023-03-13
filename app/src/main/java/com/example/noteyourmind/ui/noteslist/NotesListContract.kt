package com.example.noteyourmind.ui.noteslist

import com.example.noteyourmind.model.Note

data class NotesListState(
    val noteList: List<Note>
)

sealed class NotesListEvent() {
    object OnAddNewNoteClicked : NotesListEvent()
    data class OnNoteLongClicked(val noteId: Long): NotesListEvent()
    data class OnSearchClicked(val query: String): NotesListEvent()
}