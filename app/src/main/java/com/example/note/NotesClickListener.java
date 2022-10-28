package com.example.note;

import androidx.cardview.widget.CardView;

import com.example.note.Models.Notes;

public interface NotesClickListener {
    void onclick(Notes notes);

    void onLongClick(Notes notes, CardView cardView);
}
