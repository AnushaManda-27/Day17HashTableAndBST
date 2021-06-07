package com.btree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBinaryTreeTest {

    
    @Test
    public void added3Numbers_IntoBST() {
        MyBinaryTree<Integer> bst = new MyBinaryTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        int size = bst.getSize();
        Assertions.assertEquals(3, size);
    }
}
