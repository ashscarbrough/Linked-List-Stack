/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Homework 2
 */

interface stack_operation
{
	public void push(int elem);
	public int pop();
}

public class myStack implements stack_operation
{
	LinkedList stackList;
	
	myStack()
	{
		stackList = new LinkedList();
	}
	
	public void push(int elem)
	{
		stackList.add_to_head(elem);
	}

	public int pop()
	{
		return stackList.remove_from_head();
	}

}
