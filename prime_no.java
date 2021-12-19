import java.lang.Math;
public class Main{
   public static void main(String []args){
     int num=17;
     int count=0;
     int temp=num;
     for(int i=2;i<=Math.sqrt(num);i++){
      if(num%i==0){
      count++;
      break;
      }
     }
     if(count==0){
         System.out.println("prime");
     }
      else{
         System.out.println("Not prime");
         
}

}

}


