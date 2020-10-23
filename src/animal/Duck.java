package animal;
public class Duck extends Bird{
	/*Duck is a Bird*/
	/*Duck형은 Bird형이다*/
	/*오리는 새다*/
	String name = "난 오리";

	public void quack(){
		System.out.println("꽥꽥");
	}

	public static void main(String[] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		int x = 6;
		byte c =3;
		c =(byte)x;//큰 자료형은 작은 자료형을 받을 수 있다. O

		b = d1;// d1을 b에 대입 가능??? 오리는 새이다??? O
		b = new Duck();//가능

		d1 =(Duck)b; //down casting, demotion
		b = (Bird)d1; //작은 자료형에서 큰 자료형으로 올라감
							//up casting

		//결론: 객체 자료형도 자료형이므로, 기본 자료형의 원칙이
		//상당부분 그대로 적용되고 있다.

	}
}
