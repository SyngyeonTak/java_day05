package animal;
public class Duck extends Bird{
	/*Duck is a Bird*/
	/*Duck���� Bird���̴�*/
	/*������ ����*/
	String name = "�� ����";

	public void quack(){
		System.out.println("�в�");
	}

	public static void main(String[] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		int x = 6;
		byte c =3;
		c =(byte)x;//ū �ڷ����� ���� �ڷ����� ���� �� �ִ�. O

		b = d1;// d1�� b�� ���� ����??? ������ ���̴�??? O
		b = new Duck();//����

		d1 =(Duck)b; //down casting, demotion
		b = (Bird)d1; //���� �ڷ������� ū �ڷ������� �ö�
							//up casting

		//���: ��ü �ڷ����� �ڷ����̹Ƿ�, �⺻ �ڷ����� ��Ģ��
		//���κ� �״�� ����ǰ� �ִ�.

	}
}
