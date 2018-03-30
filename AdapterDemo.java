public class AdapterDemo
{
    public static void main(String[] args)
    {
     	myStack S = new myStack();
     	
     	S.push(5);
     	S.push(4);
     	S.push(3);
     	S.push(2);
     	
     	System.out.print(" " + S.pop() + " ");
     	System.out.print(" " + S.pop() + " ");
     	System.out.print(" " + S.pop() + " ");
     	System.out.print(" " + S.pop() + " ");
     	System.out.print(" " + S.pop() + " ");

    	return;
    }
}