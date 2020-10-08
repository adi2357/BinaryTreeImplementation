package com.bridgelabz.binarytreeimplementation;

import org.junit.Test;
import com.bridgelabz.binarytreeimplementation.MyBinaryTree;
import junit.framework.Assert;

public class MyBinaryTreeTest {

	@Test
	public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		
		Assert.assertEquals(3, myBinaryTree.size());
	}

}
