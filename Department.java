
public class Department {
	private String deptName;
	private int id;
	private String location;
	
	Department(String deptName,int id,String location)
	{
		this.deptName=deptName;
		this.id=id;
		this.location=location;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Department dep=new Department("Accounting",1334,"234 riley st");
System.out.println("no argument");
System.out.println(dep.deptName +" "+  dep.id);
System.out.println(dep.deptName +" "+ dep.id +" "+ dep.location);
	}

}
