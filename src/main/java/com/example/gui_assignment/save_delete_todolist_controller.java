package com.example.gui_assignment;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.controlsfx.control.action.Action;

public class save_delete_todolist_controller {
    // When "new" button is clicked from "file" tab
    @FXML
    void new_todolist(ActionEvent event) {
        // create new .fxml file, and populate it with
        // base gui fxml. code.

        // Then use "tabs_controller" to display that
        // new file.
        System.out.println("testing");
    }

    @FXML
    void remove_todolist(ActionEvent event) {
        // The .fxml files will be looped through,
        // the .fxml file has a naming convention of
        // "<title>_todolist.fxml". The title of the
        // current todolist will be compared to each
        // of the title (TextField with id="todolist_title")
        // in the .fxml file. When the match is found,
        // the .fxml file will be deleted, and the current
        // tab will be closed, using the "tabs_controller" class.
        System.out.println("testing");
    }

    @FXML
    void open_todolist(ActionEvent event) {
        // Open prompt to for the user to select which todolist
        // they want to open.

        // The selected dir will be saved.

        // The "tab_controller" class will be used to
        // display the selected todolist.
        System.out.println("testing");
    }

    @FXML
    void open_multiple_todolists(ActionEvent event) {
        // When the "save_all_todolists_as" function is called
        // (when the "save all as" is selected in the file tab),
        // a new dir is created, and this is where all the todolists
        // in the gui are stored. Because of this, only
        // the todolists within that dir will be opened when this
        // function is called (ie, if the user manually adds or
        // removes todolists from said dir, they will not open).

        // Open prompt to for the user to select which dir of todolists
        // they want to open.

        // The dir will be looped through, and the
        // "open_todolist" function above will be called
        // for each todolist.
        System.out.println("testing");
    }

    @FXML
    void save_current_todolist(ActionEvent event){
        // If current todolist (tab, ie scene), doesn't exist,
        // call the "save_current_todolist_as" function, else,
        // loop through all .fxml files, find the matching file,
        // with naming convention "<title>_todolist.fxml", and
        // update that .fxml file.
        System.out.println("testing");
    }

    // All the todolists within the tabs system
    // will be saved into a directory within the cwd.
    @FXML
    void save_all_todolists_as(ActionEvent event) {
        // Create directory in cwd.

        // Open prompt to select file location, name of directory, etc.
        // (Similar to all applications).

        // Loop through each todolist (the tab, ie scene),
        // and call the above "save_current_todolist" function
        // for each todolist. If a todolist was created, but never saved,
        // the function below, "save_current_todolist_as" will be called.
        System.out.println("testing");
    }

    @FXML
    void save_current_todolist_as(ActionEvent event) {
        // Open prompt to select file location, name of dir, etc.
        // (Similar to all applications).

        // Create fxml. file in "resources" dir, with the naming
        // convention of "<title>_todolist.fxml".
        System.out.println("testing");
    }
}
