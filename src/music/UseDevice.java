package music;

class UseDevice{
	public static void main(String[] args){
		/*추상 클래스는 불환전한 클래스이므로, 인스턴스 생성이 불가능하다..
			즉, 불완전하기 때문에 미완성이라서...
			결국 자식에 의해 인스턴스화 될 수 있다.
		*/
		AudioDevice ad = new Speaker();
		riding.Wing wing = new Speaker();

		wing.fly();

		//extends건 implements 건 둘다 is a 다!!
		//따라서 서로간 같은 종류의 자료형으로 간주되며, 형변환도 지원!!
		//자식이 오버라이딩을 하면, 자식의 메서드를 최우선 호출!!
	}
}
