package com.example.gui_assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.io.Serializable;
import java.time.LocalDate;


public class LocalEvent implements Serializable  {

    private static final long serialVersionUID = 1L;

    private LocalDate date;

    private String description;

    //
//    public  CheckBox checkbox = new CheckBox(" ");
//    public  Button delete_button = new Button("Delete");
////    public TextField details = new TextField();
////    public DatePicker date_picker = new DatePicker();
//
//    public HBox hbox = new HBox(10, checkbox, description, date, delete_button);
//
//    @FXML
//    private ListView<HBox> list_of_items;
//    ObservableList<HBox> list = FXCollections.observableArrayList(hbox);


    public LocalEvent(LocalDate date, String description, int delete_button, int check_box) {
        this.date = date;
        this.description = description;

        //


    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    //
    public int getCheck(){
        return 0;
    }

    //


    @Override
    public HBox display_item(){

    }

    // this makes LocalEvents dispaly nicely in GUI
//    @Override
//    public String toString() {
//        return date + " - " + description;
//    }

}
