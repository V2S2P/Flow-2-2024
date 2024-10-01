import java.util.*;
public class Student{
	private String name;
	private char group;
	private static char[] teams = {'A','B','C','F'};

	public Student(String name, char group){
		this.name = name;
		this.group = group;
	}
	public String getName(){
		return this.name;
	}
	public char getGroup(){
		return this.group;
	}
	
	public void setName(String name){
    if(name.length() > 20){
        System.out.println("The name is too long");
        this.name = name.substring(0, 20); // Assigns only the first 20 characters
    } else {
        this.name = name; // Assigns the full name if it's valid
    }

    // Capitalize the first letter and make the rest lowercase
    this.name = this.name.substring(0, 1).toUpperCase() + this.name.substring(1).toLowerCase();
}
	
	public void setGroup(char group){
		boolean isValidGroup = false;

		for (char team :teams) {
			if(team == group){
			isValidGroup = true;
			break;
		}
	}
	if(isValidGroup){
		this.group = group;
	}else{
		this.group = 'X';
	}
}
	public String toString(){
		return "Student: " + name + ", group: " + group;
	}
}