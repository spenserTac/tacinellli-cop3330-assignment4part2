package com.example.gui_assignment;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.File;
import java.io.IOException;

// This controls all the scenes.
public class tabs_controller {
    String dir = System.getProperty("user.dir");

    File new_tab = new File(dir + "/src/main/java/resources/" +
            "com.example.gui_assignment/new_tab.fxml");

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void switch_to_selected_tab(ActionEvent event) throws IOException{
        // Get title of the todolist, since the naming convention is
        // "<title>_todolist.fxml".

        // Then display that .fxml file as the current scene.
        System.out.println("testing");
    }

    @FXML
    public void close_current_tab(ActionEvent event) throws IOException{
        // Get title of the tab to the next tab. If there's no next tab,
        // then a blank page will be displayed.

        // Use the title
        // to find the correct .fxml file (naming convention
        // of "<title>_todolist.fxml"), and use the "switch_to_selected_tab"
        // to display that .fxml file.
        System.out.println("testing");
    }
}
