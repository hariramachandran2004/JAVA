package day2;

public class studentdemo {

	public static void main(String[] args) {
		student e1= new student();
		student e2= new student();
		student e3= new student();
	
		e1.setEid(23);
		e1.setEname("hari");
		e1.setCity("neyveli");
		
		System.out.println("std id:"+e1.getEid()+"\nname:"+e1.getEname()+"\ncity:"+e1.getCity());
		
		
		e2.setEid(23);
		e2.setEname("hari");
		e2.setCity("neyveli");
		
		System.out.println("std id:"+e2.getEid()+"\nname:"+e2.getEname()+"\ncity:"+e2.getCity());
	
		e3.setEid(23);
		e3.setEname("hari");
		e3.setCity("neyveli");
		
		System.out.println("std id:"+e3.getEid()+"\nname:"+e3.getEname()+"\ncity:"+e3.getCity());
	
	
	}

}
