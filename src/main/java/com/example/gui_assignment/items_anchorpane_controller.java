package com.example.gui_assignment;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

// This controls the filter function.
public class items_anchorpane_controller {

    @FXML
    private AnchorPane items_list;

    @FXML
    void show_all_items(ActionEvent event) {
        // This is the default option.

        // The "tabs_controller" class will be used
        // to display the .fxml.
    }

    @FXML
    void show_complete(ActionEvent event) {
        // The "tabs_controller" class will be used
        // to display the .fxml.

        // (All items in a todolist are within an
        // anchorpane with an id="item" in the .fxml file.)
        // This anchorpane will be looped through. (Every
        // item in this anchorpane, has a RadioButton with
        // id="complete_status"). If the item's RadioButton's
        // "selected" parameter is equal to "true", then this
        // item will be displayed, else, it won't.
    }

    @FXML
    void show_incomplete(ActionEvent event) {
        // The "tabs_controller" class will be used
        // to display the .fxml.

        // (All items in a todolist are within an
        // anchorpane with an id="item" in the .fxml file.)
        // This anchorpane will be looped through. (Every
        // item in this anchorpane, has a RadioButton with
        // id="complete_status"). If the item's RadioButton's
        // "selected" parameter is equal to "false", then this
        // item will be displayed, else, it won't.
    }
}
