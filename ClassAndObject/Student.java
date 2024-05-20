package ClassAndObject;

public class Student {
	//field
	private int studentId;
	private String studentName;

	//constructor
	public Student() 
	
	{
		studentId=101;
		studentName="Rahul";
		
		
	}
	//parameterized constructor
	public Student(int studentId,String studentName ) {
		this.studentId=studentId;
		this.studentName=studentName;
		
	}
	public  void getStudent()
	{
		System.out.println("studentId");
		System.out.println("studentName");
	}

	

	
	}


	


	


