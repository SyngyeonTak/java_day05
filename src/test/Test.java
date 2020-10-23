package plant;
class Plant{
   String name="난 식물";

   public void grow(){
      System.out.println("식물이 자랍니다.");
   }
}

class Flower extends Plant{
   String name="난 꽃";

   public void grow(){
      System.out.println("꽃이 자랍니다.");
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
