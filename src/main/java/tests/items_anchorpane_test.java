package tests;

/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 * Copyright 2021 Spenser Tacinelli
 */

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

class itemsAnchorPaneTest{
    @Test
    void show_all_items_test() {
        // This test will run, and determine
        // if all the items in the todo list
        // are showing, when that option in the
        // filter is selected.
    }

    @Test
    void show_complete_test() {
        // This test will run, and determine
        // if all the completed items are showing
        // on the todolist, when that option
        // is selected in the filter dropdown.
        // An item is known to be completed, when
        // the radio button in the item in the .fxml
        // file is checked.
    }

    @Test
    void show_incomplete_test() {
        // This test will run, and determine
        // if all the incomplete items are showing
        // on the todolist, when that option
        // is selected in the filter dropdown.
        // An item is known to be incomplete, when
        // the radio button in the item in the .fxml
        // file is not checked.
    }
}
