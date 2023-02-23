package week3day1.assignment;

public class Students {

	public void studentInfo() {
		
		System.out.println("student information");
		
	}
	public void studentInfo(int id) {
		 
		System.out.println("Student Id:" +id);
	}
     public void studentInfo(int id,String name) {
    	 System.out.println("Student Id:" +id);
 	
    	 System.out.println("student name:" +name);
	}
     public void studentInfo(String email,long phonenum) {
    	 System.out.println("Email:"+email);
    	 System.out.println("phonenum:"+phonenum);
 		
 	}
	public static void main(String[] args) {
		Students info = new Students();
		info.studentInfo();
		info.studentInfo(2400);
		info.studentInfo(3890,"Raji");
		
		info.studentInfo("raji@gmail", 9008389800l);
		

	}

}
