/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Hodge
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void testReadNames() {
        NameSorter sorter = new NameSorter();

        sorter.readNames("data/testInput.txt");

        assertEquals("George Washington", sorter.names.get(0));
    }

    @Test
    void testReadNames2() {
        NameSorter sorter = new NameSorter();

        sorter.readNames("data/testInput.txt");

        assertEquals("John Adams", sorter.names.get(1));
    }

    @Test
    void testSortNames() {
        NameSorter sorter = new NameSorter();

        sorter.readNames("data/testInput.txt");

        sorter.sortNames();

        assertEquals("Abraham Lincoln", sorter.names.get(0));
    }

    @Test
    void testSortNames2() {
        NameSorter sorter = new NameSorter();

        sorter.readNames("data/testInput.txt");

        sorter.sortNames();

        assertEquals("John Adams", sorter.names.get(2));
    }

    @Test
    void testWriteNames() {
        NameSorter sorter = new NameSorter();

        sorter.readNames("data/testInput.txt");

        sorter.writeNames("data/testOutput.txt");

        NameSorter sorter2 = new NameSorter();

        sorter2.readNames("data/testOutput.txt");

        assertEquals("George Washington", sorter2.names.get(0));
    }

}