package collection;

//用于Map中建新对象
//先有数据Bean（private属性）
//然后alt+shift+s generate快速生成Getter和Setter、构造函数、无参构造函数、toSting
public class Student {

	private String name;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


	
}