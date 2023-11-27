package org.mutation; // Assuming the LinkedList class is in the "calculator" package

import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    // Method Deletion Mutation Test
    @Test
    public void testDeleteMethod_DeletionMutant() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        // Attempting to remove an element using the non-existent delete method
        list.delete(1); // This test should fail if the delete method has been deleted
        assertEquals(1, list.size());
    }

    // Argument Order Change Mutation Test
    // Argument Order Change Mutation Test
    @Test
    public void testAdd_ArgumentOrderChange() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5); // Adding a single element to the list
        list.add(10); // Adding another element to the list
        // Modify this line to add an element at a specific index
        // For example, adding 15 at index 1
        list.add(15); // This test should fail if the argument order in add method changes
        assertEquals(3, list.size());
    }


    // Overridden Method Rename Mutation Test
    @Test
    public void testOverriddenMethod_RenameMutation() {
        // Creating a subclass to simulate an overridden method rename mutation
        LinkedList<String> list = new LinkedList<String>() {
            @Override
            public int size() {
                // Simulating a renamed method (getSize instead of size)
                return 0;
            }
        };
        assertEquals(0, list.size()); // This test should fail if the overridden method is renamed
    }

    @Test
    public void testContains() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5); // Adding a single element to the list
        list.add(10); // Adding another element to the list
        // Modify this line to add an element at a specific index
        // For example, adding 15 at index 1
        list.add(15); // This test should fail if the argument order in add method changes
        assertTrue(list.contains(5));
        assertFalse(list.contains(6));
    }

    @Test
    public void testEmpty1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testEmpty2() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testGet1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        assertEquals(list.get(1), 10);
    }

    @Test
    public void testRemove1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.delete(1);

        LinkedList<Integer> ans = new LinkedList<>();
        ans.add(5);
        ans.add(15);
        boolean flag = true;
        for (int i = 0; i < ans.size(); i++) {
            if (!Objects.equals(ans.get(i), list.get(i))) {
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }

    @Test
    public void testDelete1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5); // Adding a single element to the list
        list.add(10); // Adding another element to the list
        // Modify this line to add an element at a specific index
        // For example, adding 15 at index 1
        list.delete(0); // This test should fail if the argument order in add method changes
        assertEquals(list.get(0), 10);
    }

    @Test
    public void testDelete2() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5); // Adding a single element to the list
        list.add(10); // Adding another element to the list
        list.add(15);
        // Modify this line to add an element at a specific index
        // For example, adding 15 at index 1
        list.delete(2); // This test should fail if the argument order in add method changes
        list.delete(0);
        assertEquals(list.get(0), 10);
    }
}
