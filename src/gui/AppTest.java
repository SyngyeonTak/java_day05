/*���ݱ����� �ֿܼ����� �ڹٸ� �����������
�ڹٵ� �׷��� API�� �����Ѵ�..
������ ���� ����.. �ڹ��� ������� ��ư�� �����غ���
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
class AppTest{
	public static void main(String[] args){
		//�ڹٿ����� �������� ������ ���ִ� Ŭ������ Frame�� �����Ѵ�.
		Frame frame;//sun���� ������ Ŭ������, ������ ����.
							//���� sun���� �����ϴ� ���Ĺ����� ���� ��ġ�� �˾Ƴ���!!
		frame = new Frame();//������ ����
		frame.setSize(300, 400);//������ �����쿡 �ʺ�, ���� �ֱ�
		frame.setVisible(true);//�������� �Ӽ��� ���̰�
		Button bt = new Button("�չ�ư");//��ư �����Ͽ�, �����ӿ� ���̱�!!
		frame.add(bt);

	}
}
