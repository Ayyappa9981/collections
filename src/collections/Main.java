package collections;

//ArrayList:-Used for traversal

/*
public class Main {
	 public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(88);
		list.add(9);
		list.add(22);
		list.add(95);
//		System.out.println("Getting:"+list.get(3));
		list.set(4,50);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("value is:"+itr.next());
		}
		Collections.sort(list);
		System.out.println(list);
//		for(Integer i:list) {
//			System.out.println(i);
//		}
//		Collections.sort(list);
//		System.out.println(list);
	}
}
*/

//Linked list
/*
class Main {
	public static void main(String[] args) {
		 LinkedList<String> list1 = new LinkedList<String>();
		 list1.add("Ayyappa");
		 list1.add("Kumar");
		 list1.add("Moida");
		 list1.add("Hassi");
		 System.out.println(list1.get(2));
		 list1.set(3,"Champ");
		 Iterator itr = list1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 Collections.sort(list1);
		 System.out.println(list1);
	}
}
*/

//Array to list
/*
class Main {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Array:"+Arrays.toString(arr));
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer i:arr) {
			list1.add(i);
		}
		System.out.println("List:"+list1);
		
	}
}
*/

//List to Array
/*
class Main {
	public static void main(String[] args) {
		List<String> s= new ArrayList<String>();
		s.add("Ayyappa");
		s.add("Kumar");
		s.add("Hassi");                                  
		s.add("Champ");
		System.out.println("List:"+s);
		String arr[] =new String[s.size()];
		s.toArray(arr);
		System.out.println("Array:"+Arrays.toString(arr));	
		
	}
}
*/
//Hash set
/*
class Main {
	public static void main(String[] args) {
		HashSet<Integer> i =new HashSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		for(Integer num:i) {
			System.out.println(num);
		}
		i.remove(2);
		System.out.println("Set:"+i);
		HashSet<Integer> i1 =new HashSet<Integer>();
		i1.add(50);
		i1.add(98);
		i1.addAll(i);
		System.out.println(i1);
	}
}
*/
//Linked hash set

/*
class Main {
	public static void main(String[] args) {
		LinkedHashSet<Integer> i =new LinkedHashSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		for(Integer num:i) {
			System.out.println(num);
		}
		i.remove(2);
		System.out.println("Set:"+i);
		LinkedHashSet<Integer> i1 =new LinkedHashSet<Integer>();
		i1.add(50);
		i1.add(98);
		i1.addAll(i);
		System.out.println(i1);
	}
}
*/
//Tree set
/*
class Main {
	public static void main(String[] args) {
		TreeSet<Integer> i =new TreeSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		for(Integer num:i) {
			System.out.println(num);
		}
		i.remove(2);
		System.out.println("Set:"+i);
		TreeSet<Integer> i1 =new TreeSet<Integer>();
		i1.add(50);
		i1.add(98);
		i1.addAll(i);
		System.out.println(i1.descendingSet());
	}
}
*/

//Hash map
/*
class Main {
	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "Ayyappa");
		map1.put(2, "kumar");
		map1.put(3, "moida");
		map1.put(4, "hassi");
		map1.put(5, "champ");
		System.out.println(map1);
		for(Map.Entry <Integer,String>m:map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
*/
//Linked Hash map
/*
class Main {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> m = new LinkedHashMap<Integer,String>();
		m.put(1,"Ayyappa");
		m.put(8,"Kumar");
		m.put(9, "Moida");
		m.put(2, "Hassi");
		for(Map.Entry<Integer,String> name : m.entrySet()) {
			System.out.println(name.getKey()+" "+name.getValue());
		}
		m.remove(1,"Ayyappa");
		System.out.println(m);
	}
}
*/
//Tree Map
/*
class Main {
	public static void main(String[] args) {
		TreeMap<Integer,String> m = new TreeMap<Integer,String>();
		m.put(1,"Ayyappa");
		m.put(8,"Kumar");
		m.put(9, "Moida");
		m.put(2, "Hassi");
		for(Map.Entry<Integer,String> name : m.entrySet()) {
			System.out.println(name.getKey()+" "+name.getValue());
		}
		System.out.println(m.descendingMap());
		
	}
}
*/

//Comparable interface
/*
class Student2 implements Comparable <Student2> {
	int id;
	String name;
	String gender;
	
	Student2(int id,String name,String gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
}
	public int compareTo(Student2 st){
		if(id==st.id)  
			return 0;  
		else if(id>st.id)  
			return 1;  
		else  
			return -1;  
	}
}

class Main {
	public static void main(String[] args) {
		ArrayList<Student2> al = new ArrayList<Student2>();
		
		Student2 s1 =new Student2(123,"Ayyappa","Male");
		Student2 s2 =new Student2(456,"ppa","Male");
		Student2 s3 =new Student2(789,"Ayy","Male");
		Student2 s4 =new Student2(321,"Aappa","Male");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		
		for(Student2 st:al){  
			System.out.println(st.id+" "+st.name+" "+st.gender);
		
		
	}
}
}
*/

/*
class Student2 {
	int rollno;
	String name;
	int age;

	Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student2> {
	public int compare(Student2 s1, Student2 s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student2> {
	public int compare(Student2 s1, Student2 s2) {
		return s1.name.compareTo(s2.name);
	}
}

class Main {
	public static void main(String args[]) {

		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(101, "Vijay", 23));
		al.add(new Student2(106, "Ajay", 27));
		al.add(new Student2(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		for (Student2 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		for (Student2 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
*/

//Stack

/*
class Main {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		if(s.empty()) {
			s.push(2);
			s.push(8);
			s.push(5);
			s.push(6);
		}
		for(int i=1;i<s.size();i++) {
			System.out.println(s.elementAt(i));
		}
		s.pop();
		System.out.println(s.size());
	}
}
*/

//Queue

/*
class Main {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}
}
*/

//Thread using class
/*
class Main extends Thread {
		
		public void run() {
			System.out.println("Running");
		}
		public static void main(String[] args) {
			Main m = new Main();
			m.start();
	}
}
*/

//Thread using interface

/*
class Main implements Runnable {
	public void run() {
		System.out.println("Running safely.....");
	}
	public static void main(String[] args) {
		Main m = new Main();
		Thread t = new Thread(m);
		t.start();
	}
}
*/

//Synchornisation 
class Table {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(250);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class Main {
	public static void main(String args[]) {
		final Table obj = new Table();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}
}

