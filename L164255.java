import java.util.HashSet;
import java.util.*; 
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NavigableMap; 
import java.util.TreeMap; 
import java.util.NavigableSet; 
import java.util.TreeSet; 

public class test2
{ 
    public static void main(String[] args) 
    { 
	
	//NavigableMap
        NavigableMap<String, Integer> nm = 
                          new TreeMap<String, Integer>(); 
        nm.put("C", 888); 
        nm.put("Y", 999); 
        nm.put("A", 444); 
        nm.put("T", 555); 
        nm.put("B", 666); 
        nm.put("A", 555); 
  
        System.out.printf("Descending Set  : %s%n", 
                                nm.descendingKeySet()); 
        System.out.printf("Floor Entry  : %s%n", 
                                nm.floorEntry("L")); 
        System.out.printf("First Entry  : %s%n", 
                                nm.firstEntry()); 
        System.out.printf("Last Key : %s%n", 
                                nm.lastKey()); 
        System.out.printf("First Key : %s%n", 
                                nm.firstKey()); 
        System.out.printf("Original Map : %s%n", nm); 
        System.out.printf("Reverse Map : %s%n", 
                                 nm.descendingMap()); 
    
        NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(0); 
        ns.add(1); 
        ns.add(2); 
        ns.add(3); 
        ns.add(4); 
        ns.add(5); 
        ns.add(6); 
  
        // Get a reverse view of the navigable set 
        NavigableSet<Integer> reverseNs = ns.descendingSet(); 
  
        // Print the normal and reverse views 
        System.out.println("Normal order: " + ns); 
        System.out.println("Reverse order: " + reverseNs); 
  
        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true); 
        System.out.println("3 or  more:  " + threeOrMore); 
        System.out.println("lower(3): " + ns.lower(3)); 
        System.out.println("floor(3): " + ns.floor(3)); 
        System.out.println("higher(3): " + ns.higher(3)); 
        System.out.println("ceiling(3): " + ns.ceiling(3)); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollLast(): " + ns.pollLast()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("pollLast(): " + ns.pollLast()); 
 

 
 

        //  ArrayList 
        ArrayList<String> al = new ArrayList<String>(); 
  
        // adding object to arraylist 
        al.add("Practice.GeeksforGeeks.org"); 
        al.add("quiz.GeeksforGeeks.org"); 
        al.add("code.GeeksforGeeks.org"); 
        al.add("contribute.GeeksforGeeks.org"); 
  
        // traversing elements using Iterator' 
        System.out.println("ArrayList elements are:"); 
        Iterator it = al.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next()); 
  
  
  
        // Vector 
        Vector<String> v = new Vector<String>(); 
        v.addElement("Practice"); 
        v.addElement("quiz"); 
        v.addElement("code"); 
  
        // traversing elements using Enumeration 
        System.out.println("\nVector elements are:"); 
        Enumeration e = v.elements(); 
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement()); 


      //  Sorted set
      SortedSet set = new TreeSet(); 

      // Add elements to the set
      set.add("b");
      set.add("c");
      set.add("a");

    

  

        TreeSet<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 

        
       //ARRAY
      // declares an Array of integers. 
      int[] arr; 
          
      // allocating memory for 5 integers. 
      arr = new int[5]; 
          
      // initialize the first elements of the array 
      arr[0] = 10; 
          
      // initialize the second elements of the array 
      arr[1] = 20; 
          
      //so on... 
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
      // accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i +  
                                      " : "+ arr[i]);           
   
//LIST 
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  // adds 1 at 0 index 
        l1.add(1, 2);  // adds 2 at 1 index 
        System.out.println(l1);  // [1, 2] 
  
        // Creating another list 
        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
  
        // Will add list l2 from 1 index 
        l1.addAll(1, l2); 
        System.out.println(l1); 
  
        // Removes element from index 1 
        l1.remove(1);      
        System.out.println(l1); // [1, 2, 3, 2] 
  
        // Prints element at index 3 
        System.out.println(l1.get(3)); 
  
        // Replace 0th element with 5 
        l1.set(0, 5);    
        System.out.println(l1);  
 
    }
}













