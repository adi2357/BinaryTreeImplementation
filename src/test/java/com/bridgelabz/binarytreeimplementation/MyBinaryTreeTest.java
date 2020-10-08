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
	
	@Test
	public void givenAllNumbers_WhenAddedToBinaryTree_ShouldReturnSizeAsTotalCountOfNumbers() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		Assert.assertEquals(13, myBinaryTree.size());
	}
	
	@Test
	public void givenANumber_WhenSearchedInBinaryTree_AndPresent_ShouldReturnTheNumber() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		Integer number=myBinaryTree.search(63);	
		Assert.assertEquals((Integer)63, number);
	}
	
	@Test
	public void givenANumber_WhenSearchedInBinaryTree_AndNotPresent_ShouldReturnNull() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		Integer number=myBinaryTree.search(88);	
		Assert.assertEquals(null, number);
	}

}
