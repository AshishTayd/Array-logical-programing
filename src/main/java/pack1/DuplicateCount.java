package pack1;

public class DuplicateCount {
    public int meth1(){
        String a="mamama";
        int count=0;
        int d=0;
        String c;
        for(int i=0;i < a.length();i++){
            for(int j=i;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;

                }


            }


        }
        return d;
    }

    public static void main(String[] args) {
        DuplicateCount aobj=new DuplicateCount();
        int a=aobj.meth1();
        System.out.println(a);
    }
}
