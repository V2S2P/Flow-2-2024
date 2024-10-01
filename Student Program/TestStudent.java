public class TestStudent{
	public static void main(String[] args){
		Student student0 = new Student("Valdemar",'B');
		Student student1 = new Student("Big Hank",'A');


		student0.setGroup('F');
		System.out.println(student0.toString());
		System.out.println(student1.toString());
	}
}