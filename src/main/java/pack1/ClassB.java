package pack1;

public class ClassB {
      public   int meth1(int [] arr){
          int a=arr[0];
          for(int i=0;i< arr.length;i++){

              if(a<arr[i]){
                  a=arr[i];

              }
          }

        return a;
      }


      public static void main(String[] args){
          int a=new ClassB().meth1(new int[]{2,5,38,4,69});
          System.out.println(a);
      }
}
