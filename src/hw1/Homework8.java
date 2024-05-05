package hw1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class Homework8 {
	public static void main(String[] args) {
		//1.
		List data = new ArrayList();
		data.add(new Integer(100));
		data.add(new Double(3.14));
		data.add(new Long(21L));
		data.add(new Short("100"));
		data.add(new Double(5.1));
		data.add("Kitty");
		data.add(new Integer(100));
		data.add(new Object());
		data.add("Snoopy");
		data.add(new BigInteger("1000"));
		
		
		Iterator objs = data.iterator();		
		while(objs.hasNext()) {
			if(!(objs.next() instanceof Number)) {
				objs.remove();			
			}		
		}	
		
		System.out.println("=Iterator=");
		objs = data.iterator();
		while(objs.hasNext()) 
			System.out.print(objs.next()+", ");
				
		System.out.println("\n=for=");
		for(int i = 0; i<data.size(); i++) 
			System.out.print(data.get(i)+", ");
				
		System.out.println("\n=foreach=");
		for(Object d : data)
			System.out.print(d+", ");
		
		//2.
		System.out.println("\n\n不重複\n=foreach=");
//		List<Train> train =new ArrayList();
		Set<Train> trainList =new HashSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
				
		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t5);
		trainList.add(t6);
		trainList.add(t7);		
		
		for(Train tl : trainList)
			System.out.println(tl.getNumber()+" "+tl.getType()+" "
					+tl.getStart()+" "+tl.getDest()+" "+tl.getPrice());
		
		System.out.println("\n=Iterator=");
		
		Iterator<Train> tlIter = trainList.iterator();
		while(tlIter.hasNext()) 
			System.out.println(tlIter.next());
			
		
		System.out.println("\n班次編號由大到小\n=foreach=");
		
		Set<Train> trainList2 =new TreeSet<Train>(trainList);
		
		for(Train tl2 : trainList2)
			System.out.println(tl2.getNumber()+" "+tl2.getType()+" "
					+tl2.getStart()+" "+tl2.getDest()+" "+tl2.getPrice());
		
		System.out.println("\n=Iterator=");
		
		Iterator<Train> tlIter2 = trainList2.iterator();
		while(tlIter2.hasNext()) 
			System.out.println(tlIter2.next());	
			
	}
}
 class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	Train(int number, String type, String start, String dest, double price){
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}

	@Override
	public int compareTo(Train o) {
		if (this.number > o.number) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public String toString() {
        return number +" "+ type +" "+ start +" "+ dest +" "+ price;
    }
}
