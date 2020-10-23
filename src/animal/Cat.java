package animal;
public class Cat{
	String name;
	int age;
	
	public Cat(String name, int age){
		this.name = name;
		this.age = age;

	}

		/**고양이를 울게하는 생성자입니다.*/
	public void cry(){
		System.out.println("고양이가 울어요");
	}
}
