package com.example.gui_assignment;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gui_controller{

    public  CheckBox checkbox = new CheckBox(" ");
    public  Button delete_button = new Button("Delete");
    public  TextField details = new TextField();
    public  DatePicker date_picker = new DatePicker();


    public  HBox hbox = new HBox(10, checkbox,details, date_picker, delete_button);

    @FXML
    private ListView<HBox> list_of_items;
    ObservableList<HBox> list = FXCollections.observableArrayList(hbox);

//    @FXML
//    private AnchorPane items_list;

    String dir = System.getProperty("user.dir");

    File new_tab = new File(dir + "/src/main/java/resources/" +
            "com.example.gui_assignment/new_tab.fxml");

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

//    @Override
//    public void initialize(URL url, ResourceBundle rb){
//        list_of_items.setItems(list);
//    }
//
    @FXML
    public void add_item(ActionEvent event) {
//        // The blank item template will be added
//        // right below the previous one, when the
//        // add button is clicked. This will be added
//        // to the .fxml file in the corresponding
//        // list of items within the todolist .fxml
//        // file.
//
//        CheckBox checkbox = new CheckBox(" ");
//        Button delete_button = new Button("Delete");
//        TextField details = new TextField();
//        DatePicker date_picker = new DatePicker();
//
//        HBox hbox = new HBox(10, checkbox,details, date_picker, delete_button);
//
//        list_of_items.getItems().add(hbox);
    }

    @FXML
    void delete_item(ActionEvent event) {
        // The specific item within the todolist will
        // be removed from the .fxml file.

        //list_of_items.getItems().remove();
    }


//    delete_button.setOnAction(new EventHandler<ActionEvent>() {
//
//    }



    @FXML
    void show_all_items(ActionEvent event) {
        // This is the default option.

        // The "tabs_controller" class will be used
        // to display the .fxml.
        System.out.println("testing");
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
        System.out.println("testing");
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
        System.out.println("testing");
    }

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

    @FXML
    public void switch_to_selected_tab(ActionEvent event) throws IOException {
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

    @FXML
    void edit_title(ActionEvent event) {
        System.out.println("testing");
    }

    @FXML
    void mark_complete(ActionEvent event) {
        System.out.println("testing");
    }

    @FXML
    void add_desciption(ActionEvent event) {
        System.out.println("testing");
    }

    @FXML
    void add_date(ActionEvent event) {
        System.out.println("testing");
    }


}
