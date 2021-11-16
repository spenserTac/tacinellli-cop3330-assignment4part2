package com.example.gui_assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.io.Serializable;
import java.time.LocalDate;


public class LocalEvent implements Serializable  {

    private static final long serialVersionUID = 1L;

    private LocalDate date;

    private String description;
    private int number;
    private int check;



    public LocalEvent(LocalDate date, String description, int number, int check) {
        this.date = date;
        this.description = description;
        this.number = number;
        this.check = check;

    }

    public LocalDate getDate() {
        return date;
    }

    public int setDate(LocalDate new_date) {
        this.date = new_date;
        return 0;
    }


    public String getDescription() {
        return description;
    }

    public int setDescription(String new_string) {
        this.description = new_string;
        return 0;
    }

    public int setCheck(int ncheck){
        this.check = ncheck;
        return 0;
    }

    public int getNumber() {
        return number;
    }

    public int getCheck() {
        return check;
    }



    // this makes LocalEvents dispaly nicely in GUI
    @Override
    public String toString() {
        return number + "| " + check + " |    " + date + "  -  " + description;
    }


}
