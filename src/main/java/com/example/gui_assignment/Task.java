package com.example.gui_assignment;

import javafx.application.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
//import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javafx.print.PrinterJob;

public class Task {

    private final SimpleStringProperty todo;
    private final SimpleStringProperty day;
    private final SimpleStringProperty time;
    private final SimpleStringProperty deadline;
    private final SimpleStringProperty mentor;
    private final SimpleStringProperty description;

    private Task(String todo1, String day1, String time1, String deadline1, String mentor1, String description1){

        this.todo = new SimpleStringProperty(todo1);
        this.day = new SimpleStringProperty (day1);
        this.time = new SimpleStringProperty(time1);
        this.deadline = new SimpleStringProperty(deadline1);
        this.mentor = new SimpleStringProperty(mentor1);
        this.description = new SimpleStringProperty(description1);
    }

    public String getToDo() {
        return todo.get();
    }

    public void setToDo(String todo1) {
        todo.set(todo1);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String day1) {
        day.set(day1);
    }

    public String getTime() {
        return time.get();
    }

    public void setTime(String time1) {
        time.set(time1);
    }

    public String getDeadline() {
        return deadline.get();
    }

    public void setDeadline(String deadline1) {
        deadline.set(deadline1);
    }

    public String getMentor() {
        return mentor.get();
    }

    public void setMentor(String mentor1) {
        mentor.set(mentor1);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String deadline1) {
        description.set(deadline1);
    }

}