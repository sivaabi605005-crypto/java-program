class Employee
{
private int salary;
public void setSalary(int salary)
{
this.salary = salary;
}
public int getSalary()
{
return salary;
}
public static void main(String[]args)
{
Employee e = new Employee();
e.setSalary(502000);
System.out.println(e.getSalary());
}
}