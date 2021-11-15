package com.example.gui_assignment;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;


public class gui_controller implements Initializable {

    //
    @FXML
    private Button deleteEventButton;

    //
    @FXML
    private CheckBox check_box;

    @FXML
    private Button addEventButton;

    @FXML
    private TextField eventDescriptionTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ListView<LocalEvent> eventListView;


    @FXML
    private void addEventHandler(ActionEvent e)
    {
        //create new Event by getting values from gui
        var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText(), 0, 0);

        // add the new event to the list
        eventListView.getItems().add(newEvent);

        //reset fields
        // set date on today
        datePicker.setValue(LocalDate.now());

        // set text empty
        eventDescriptionTextField.setText("");
    }

    //
    @FXML
    private void deleteEventHandler(ActionEvent e)
    {
        //create new Event by getting values from gui

        //var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText());

        // add the new event to the list
        eventListView.getItems().remove(2);


        //datePicker.setValue(LocalDate.now());


        // eventDescriptionTextField.setText("");
    }

    //
    @FXML
    private  void checkEventHandler(ActionEvent e){

        //var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText());
          var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText(), 0, 1);

        eventListView.getItems().add(newEvent);
    }

    //
    @FXML
    private  void uncheckEventHandler(ActionEvent e){

        //var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText());
        var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText(), 0, 0);

        eventListView.getItems().add(newEvent);
    }

    public Object[] getEvents()  {
        return eventListView.getItems().toArray();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            var events = EventSerializer.deserialize();
            eventListView.getItems().addAll(events);
        }catch(Exception e)  {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("TodoFX");
            alert.setHeaderText("Events could not be loaded from file system");
        }

    }

}