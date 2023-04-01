package com.androidregiment.nootes.data.repo.note

import com.androidregiment.nootes.data.dao.note.NoteDao
import com.androidregiment.nootes.data.entity.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepoImpl @Inject constructor(private val noteDao : NoteDao) : NoteRepo {
    override fun getAllNotes(): Flow<List<Note>> =
        noteDao.getAllNotes()

    override fun getNoteById(id: Int): Flow<Note> =
        noteDao.getNoteById(id)

    override suspend fun addNote(note: Note) =
        noteDao.addNote(note)

    override suspend fun updateNote(note: Note) =
     noteDao.updateNote(note)

    override suspend fun deleteNote(note: Note) =
        noteDao.deleteNote(note)
}
