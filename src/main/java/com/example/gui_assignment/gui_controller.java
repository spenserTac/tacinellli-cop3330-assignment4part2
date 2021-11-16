package com.example.gui_assignment;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class gui_controller implements Initializable {
    //

    @FXML
    private Button addEventButton;

    //
    @FXML
    private TextField instancenumberTextField;

    @FXML
    private Button deleteEventButton;

    @FXML
    private Button checkEventButton;


    @FXML
    private Button changeDescEventButton;
    @FXML
    private TextField changeDescTextField;

    @FXML
    private Button changeDateButton;
    @FXML
    private DatePicker changeDateField;
    //

    @FXML
    private TextField eventDescriptionTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ListView<LocalEvent> eventListView;

    @FXML
    private Button clearList;

    @FXML
    private Button fAllButton;
    @FXML
    private Button fICButton;
    @FXML
    private Button fCButton;

    public int i = 1;


    @FXML
    private void addEventHandler(ActionEvent e)
    {
        if(eventDescriptionTextField.getText().length() < 256 && eventDescriptionTextField.getText().length() > 1) {
            var newEvent = new LocalEvent(datePicker.getValue(), eventDescriptionTextField.getText(), i, 0);
            i++;
            eventListView.getItems().add(newEvent);
            //list_of_items.getItems().add(newEvent);


            //

            //reset fields
            // set date on today
            datePicker.setValue(LocalDate.now());

            // set text empty
            eventDescriptionTextField.setText("");
        }
    }


    public Object[] getEvents()  {
        //return list_of_items.getItems().toArray();
        return eventListView.getItems().toArray();
    }



    @FXML
    private void clearList(ActionEvent e)
    {

        int k = 0;
        while(true){
            eventListView.getItems().remove(k);
            if(eventListView.getItems().size() == 0){
                return;
            }
            k++;
        }
    }


    @FXML
    private void deleteEventHandler(ActionEvent e)
    {
        int num = Integer.parseInt(instancenumberTextField.getText());
        eventListView.getItems().remove(num-1);

//        for(int j = 0; j < eventListView.getItems().size(); j++){
//            if(num-1 == j){
//                eventListView.getItems().remove(j);
//            }
//        }
    }

    @FXML
    private void checkEventHandler(ActionEvent e)
    {
        int num = Integer.parseInt(instancenumberTextField.getText());
        LocalEvent instance = eventListView.getItems().get(num-1);

        LocalEvent new_event;

        if(instance.getCheck() == 0){
            new_event = new LocalEvent(instance.getDate(), instance.getDescription(),
                    instance.getNumber(), 1);
        }else{
            new_event = new LocalEvent(instance.getDate(), instance.getDescription(),
                    instance.getNumber(), 0);
        }

        eventListView.getItems().set(num-1, new_event);

    }

    @FXML
    private void changeDescEventHandler(ActionEvent e)
    {
        int num = Integer.parseInt(instancenumberTextField.getText());

        String text = changeDescTextField.getText();
        LocalEvent instance = eventListView.getItems().get(num-1);

        var new_event = new LocalEvent(instance.getDate(), text, instance.getNumber(), instance.getCheck());

        eventListView.getItems().set(num-1, new_event);
//
//        instance.setDescription(text);

    }

    @FXML
    private void changeDateEventHandler(ActionEvent e)
    {
        int num = Integer.parseInt(instancenumberTextField.getText());
        LocalEvent instance = eventListView.getItems().get(num-1);

        var new_event = new LocalEvent(changeDateField.getValue(), instance.getDescription(),
                instance.getNumber(), instance.getCheck());

        eventListView.getItems().set(num-1, new_event);

    }

    @FXML
    private void fAllEventHandler(ActionEvent e)
    {
        eventListView.getItems();

    }

    @FXML
    ListView<LocalEvent> filtered_events;
    int m = 0;

    @FXML
    private void fICEventHandler(ActionEvent e)
    {

        int n = 0;
        while(true){
            LocalEvent instance = eventListView.getItems().get(n);

            if(instance.getCheck() == 0){
                filtered_events.getItems().add(instance);
            }

            if(eventListView.getItems().size() == n+1){
                return;
            }

        }

//        int k = 0;
//        while(true){
//            eventListView.getItems().remove(k);
//            if(eventListView.getItems().size() == 0){
//                return;
//            }
//            k++;
//        }


    }

    @FXML
    private void fCEventHandler(ActionEvent e)
    {
        System.out.println("none");

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