package class6;

public class WhileLoop_13 {
    public static void main(String[] args) {

        //print below sequence (without 5,10,15) with the help of loop
        //1 2 3 4 6 7 8 9 11 12 13 14 16
      int num=0;
      while (num <= 16){

          if(num% 5 !=0){
              System.out.println(num);
          }
          num++;
      }
        System.out.println("*******************");

      int num2=1;
      while (num2<=16){
          if (num2==5 || num2==10 || num2==15){
          }else {
              System.out.println(num2);
          }
          num2++;
      }
        System.out.println("*******************");

      int num3=1;
      while (num3<=16){

          if (num3%5!=0){
              System.out.println(num3);
          }
          num3++;
      }
    }
}
