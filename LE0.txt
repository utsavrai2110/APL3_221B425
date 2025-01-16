public class Main
{
    String name; int age;
    
    void  setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
	public static void main(String[] args) {
		Main person = new Main();
		person.setName("Utsav Rai");
		person.setAge(21);
		
		System.out.println("Name is "+ person.getName());
		System.out.println("Age is "+ person.getAge());
		
	}
}