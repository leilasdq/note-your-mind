package com.example.noteyourmind.ui.noteslist

import com.example.noteyourmind.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesListViewModel @Inject constructor(

): BaseViewModel<NotesListEvent>() {
    override fun onTriggerEvent(event: NotesListEvent) {
        when (event) {
            is NotesListEvent.OnNoteLongClicked -> removeNote(event.noteId)
            is NotesListEvent.OnAddNewNoteClicked -> {}
            is NotesListEvent.OnSearchClicked -> searchNoteByTitle(event.query)
        }
    }

    private fun removeNote(noteId: Long) {
        // todo: call usecase to remove note from db
    }

    private fun searchNoteByTitle(query: String) {
        // todo: call usecase to search and return a list of notes
    }

}