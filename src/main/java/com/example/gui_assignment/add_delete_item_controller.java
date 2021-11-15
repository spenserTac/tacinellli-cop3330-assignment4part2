package com.example.gui_assignment;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class add_delete_item_controller {

    @FXML
    private AnchorPane item;
    private ListView<AnchorPane> list_of_items;
    ObservableList<AnchorPane> list = FXCollections.observableArrayList(item);

//    @Override
//    public void initialize(URL url, ResourceBundle rb){
//        list_of_items.setItems(list);
//    }

    @FXML
    void add_item(ActionEvent event) {
        // The blank item template will be added
        // right below the previous one, when the
        // add button is clicked. This will be added
        // to the .fxml file in the corresponding
        // list of items within the todolist .fxml
        // file.

        //list_of_items.setItems(list);
        list_of_items.getItems().addAll(item);
    }

    @FXML
    void delete_item(ActionEvent event) {
        // The specific item within the todolist will
        // be removed from the .fxml file.
        System.out.println("testing");
    }
}