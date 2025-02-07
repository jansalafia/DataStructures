package Student;

public class Student2
{
	private String name;
	private String status;
	private String major;
	private int sem;
	
	public Student2(String name, String status, String major, int sem)
	{
		this.name = name;
		this.status = status;
		this.major = major;
		this.sem = sem;
	}
	
	public String getName()
	{
		return name;
	}


	public int getSem()
	{
		return sem;
	}


	
	public String toString()
	{
		return name + "\n" + status + "\n" + major + "\n" + sem;	
	}
	

}
