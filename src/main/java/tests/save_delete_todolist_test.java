package tests;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import org.testng.annotations.Test;

class saveDeleteTodoListTest {
    @Test
    void new_todolist_test(){
        // This test will run and determine if a new
        // todolist file was created on the users
        // external storage device. The user's storage
        // device will be looped through, and the
        // corresponding file name for the todolist will
        // be searched for.
    }

    @Test
    void remove_todolist_test(){
        // This test will run and determine if
        // the corresponding todolist was removed
        // from the user's storage device. The user's
        // storage device will be searched for, if the
        // file is not found, then that means the test
        // will pass.
    }

    @Test
    void open_todolist_test(){
        // This test will run and determine if the
        // correct todolist file was opened and
        // inserted in the tab section of the GUI.
        // This will be done by going to the corresponding
        // section of the .fxml file, and seeing if the
        // correct todolist is there.
    }

    @Test
    void open_multiple_todolists_test(){
        // This test will run and determine
        // if all the correct todolists were
        // added to the tab section of the GUI and
        // exist in the .fxml file. This will be done
        // by looping through and executing the
        // open_todolist_test() for every tab that
        // should be opened.
    }

    @Test
    void save_current_todolist_test(){
        // This test will run and determine
        // if the todolist was properly saved.
        // Then it will test if the .fxml file was
        // properly updated after the save
        // button was clicked.
    }

    @Test
    void save_all_todolists_as_test(){
        // This test will run and determine
        // if all the corresponding todolists
        // were properly saved and if the .fxml
        // files were saved. This will be done
        // by looping and executing the function,
        // save_current_todolist_test(), for
        // every todolist that should have been saved.
    }

    @Test
    void save_current_todolist_as_test(){
        // This test will run and determine if the
        // todolist file was properly saved as. When
        // the save as button is clicked, a new .fxml
        // file should be created on the users external
        // storage device, and this test will determine
        // if this was properly done.
    }
}