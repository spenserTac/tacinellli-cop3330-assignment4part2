package com.example.gui_assignment;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class add_delete_item_controller {

    @FXML
    private AnchorPane item;

    @FXML
    void add_item(ActionEvent event) {
        // The blank item template will be added
        // right below the previous one, when the
        // add button is clicked. This will be added
        // to the .fxml file in the corresponding
        // list of items within the todolist .fxml
        // file.
    }

    @FXML
    void delete_item(ActionEvent event) {
        // The specific item within the todolist will
        // be removed from the .fxml file.
    }
}