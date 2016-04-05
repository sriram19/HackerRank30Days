
public class Node {
Node next;
int data;


public Node (int newData)
{
	this.data= newData;
	next=null;
}

public Node(int newData,Node newNext)
{
	this.data= newData;
	this.next= newNext;
}


public int getData()
{
	return data;
}
public Node getNext()
{
	return next;
}

public void setData(int newData)
{
	data= newData;
}
public void setNext(Node newNext)
{
	next = newNext;
}
}
