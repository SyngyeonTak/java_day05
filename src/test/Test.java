package plant;
class Plant{
   String name="�� �Ĺ�";

   public void grow(){
      System.out.println("�Ĺ��� �ڶ��ϴ�.");
   }
}

class Flower extends Plant{
   String name="�� ��";

   public void grow(){
      System.out.println("���� �ڶ��ϴ�.");
   }

}

class Test{
   public static void main(String[] args){
        Plant p1=new Plant();          
        System.out.println(p1.name); 
        
        Plant p2=new Flower(); 
        System.out.println(p2.name); 
     
        p2.grow();
   }
}
