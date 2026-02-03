package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {

    @Test
    public void basicTest1() {

        int[] arr = {1,2,3};
        int[] result = {1,2,3};
        int[] actual = InventoryManager.inventoryDuplicates(arr);
        assertArrayEquals(result,actual);
    }

    @Test
    public void basicTest2() {

        int[] arr = {1,0,3};
        int[] result = {1,0,0};
        int[] actual = InventoryManager.inventoryDuplicates(arr);
        assertArrayEquals(result,actual);
    }

    @Test
    public void basicTest3() {

        int[] arr =    {1,0,3,0,2,3,4,3};
        int[] result = {1,0,0,3,0,0,2,3};
        int[] actual = InventoryManager.inventoryDuplicates(arr);
        assertArrayEquals(result,actual);
    }
    @Test
    public void edgeTest1() {

        int[] arr =    {1,0,3,0,2,0,4,3};
        int[] result = {1,0,0,3,0,0,2,0};
        int[] actual = InventoryManager.inventoryDuplicates(arr);
        assertArrayEquals(result,actual);
    }
    @Test
    public void nullArr() {

        int[] arr = null;
        int[] result = null;
        int[] actual = InventoryManager.inventoryDuplicates(arr);
        assertArrayEquals(result,actual);
    }
}
