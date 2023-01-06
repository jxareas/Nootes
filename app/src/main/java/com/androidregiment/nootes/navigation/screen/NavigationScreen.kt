package com.androidregiment.nootes.navigation.screen

sealed class NavigationScreen(
    val route: String,
    val title: String,
) {
    object AllNotesScreen : NavigationScreen(
        route = "all_notes",
        title = "All Notes"
    )

    object AddNoteScreen : NavigationScreen(
        route = "add_notes",
        title = "Add Notes"
    )

}
