
													Collections Part-15 || queue
												 =================================

=======================================================
  Queue  1.5v version Inhancements (Queue Interface )												 
=======================================================


					Collection(I)
						 |
						 |
	------------------------------------------------------					 
	|						|						     |
   List(I)				  Set(I)					  Queue(I)
    |													 |	
	|->ArrayList							------------------------------
	|										|					|		 |....
	|->LinkedList						PriorityQueue		BlockingQueue	
	|	 |->Queue(I)1.5v										| 	
	|->Vector													|->PriorityBlockingQueue
		 |														|
		 |->Stack												|->LinkedBlockingQueue	
														
															1.5v version 
															
 

 -> It is the child interface of Collection.
	
 -> If we want to reprasent a group of individual objects Prior to processing then we should go for Queue.

 -> For example Before sending SMS message all mobile numbers we have to store in some data Structore in which order we 
	added mobile numbers in the same order only message should be deliverd for this First-In-First-Out requirement queue
	is the best choice.
	
 -> Useally Queue follows First-In-First-Out order but based on our requirement we can implement our own priority order 
	also (PriorityQueue).
	
 -> From 1.5v version onwords LinkedList class also implements Queue interface.
 
 -> LinkedList based implementation of queue always follows First-In-First-Out order.
 
 
 -----------------------------------
  Queue interface specific methods 
 -----------------------------------

  1. offer(Object o)
  
		- To add an object into the queue.
	
  2. Object poll()
  
		- To remove and return head element of the queue. If queue is empty then this method return null.

  3. Object remove()
		
		- To remove and return head element of the queue. IF queue is empty then this method raises RE: 
		  NoSuchElementException
  
  4. Object peek()	

		To return head element of the queue. If queue is empty then this method return null.

  5. element()  
  
	  - To return head element of the queue. If queue is empty then this method raises RE: NoSuchElementException.
	  
 ---------------
  PriorityQueue
 ---------------

  -> If we want to reprasent a group of individual objects prior to processing according to some priority then we should 
	 go for Priority Queue.
	 
  -> The priority can be either default natural sorting order or Customized Sorting order defined by comparator.
  
  -> Insertion order is not preserved and it is based on some priority.
  
  -> Duplicate objects are not allowed.
  
  -> If we are depending on default Natural sorting order Compulsory Object should be homogenous and comparable otherwise 
	 we will Runtime Exception saying ClassCastException.
	 
  -> If we are defining Our own sorting by Comparator then objects need not be homogenous and comparable.
  
  -> null is not allowed even as the first element also.
  
 --------------- 
  Constructors  
 ---------------
 
  1. PriorityQueue q = new PriorityQueue();

		- Creates an empty PriorityQueue with default initialCapacity 11 and all objects will inserted according to 
		  default Natural Sorting Order.

  2. PriorityQueue q = new PriorityQueue(int initialCapacity);

  3. PriorityQueue q = new PriorityQueue(int initialCapacity, Comparator c);
  
  4. PriorityQueue q = new PriorityQueue(SortedSet s);
  
  5. PriorityQueue q = new PriorityQueue(Collection c);
  


		import java.util.*;
		class PriorityQueueDemo
		{
			public static void main(String arga[])
			{
				PriorityQueue q = new PriorityQueue();
				System.out.println(q.peek());// null
				//System.out.println(q.element());// RE: NoSuchElementException
				for(int i =0;i<=10;i++)
				{
					q.offer(i);
				}
				System.out.println(q);// [0,1,2,3,4,5,6,7,8,9,10]
				System.out.println(q.poll());// 0
				System.out.println(q);// [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]
			}
		}

 Note: 
 
	- Some platform won't provide proper support for Thread Priorities and PriorityQueues.


		import java.util.*;
		class PriorityQueueDemo1
		{
			public static void main(String arga[])
			{
				PriorityQueue q = new PriorityQueue(15, new MyComparator());
				q.offer("A");
				q.offer("Z");
				q.offer("L");
				q.offer("B");
				System.out.println(q); // [Z,L,B,A]
				
			}
		}
		class MyComparator implements Comparator
		{
			public int compare(Object obj1,Object obj2)
			{
				String s1 = (String)obj1;
				String s2 = obj2.toString();
				return s2.compareTo(s1);
			}
		}


		































 