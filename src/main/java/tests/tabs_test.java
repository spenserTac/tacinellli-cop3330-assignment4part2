package tests;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import org.testng.annotations.Test;

class tabsTest{

    @Test
    void switch_to_selected_tab_test(){
        // This test will run and determine
        // if the correct tab was switched to within
        // the todolist GUI. This can be determined by
        // looking at the title of the todolist and
        // making sure it corresponds with the file name (since
        // the naming convention of the file name of
        // the .fxml file contains the title of the
        // todolist).
    }

    @Test
    void close_current_tab_test(){
        // This test will run and determine if
        // the correct tab was closed and if the
        // file was not saved, this test will make sure
        // that that prompt pops up for the user to make
        // sure that the file was saved. Since all the
        // tabs are in the .fxml file, if the tab is
        // properly closed, that tab should be removed
        // from the corresponding section of the .fxml file
        // and this test will test for that.
    }
}