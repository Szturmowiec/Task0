package Employees;

public interface IEmployee{
    public String getName();
    public String getSurname();
    public String getOccupation();
    public String getRole();
    public String assign(Task task);
    public Report reportWork();
}