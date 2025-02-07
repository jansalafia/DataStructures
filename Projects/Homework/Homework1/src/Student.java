
public class Student 
{
	private String name;
	private String status;
	private String major;
	private int sem;
	
	public Student(String name, String status, String major, int sem)
	{
		this.name = name;
		this.status = status;
		this.major = major;
		this.sem = sem;
	}
	
	
	public String toString()
	{
		return this.name + "\n" + status + "\n" + major + "\n" + sem + "\n";	
	}
	

}
