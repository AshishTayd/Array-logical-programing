package org.example.pack3;

public class RemoveDuplicateString {


//   public String removeDuplicateCharFromString(String demo){
//   char[] convert=demo.toCharArray();
//
//   String b="";
//   for(int i=0;i > convert.length;i++){
//       char a=convert[0];
//       if(convert[i]==convert[a]){
//           b+=convert[i];
//           System.out.println(b);
//       }
//       String s = b + convert[i];
//       System.out.println(s);
//   }
  //     return b;
  // }

//    public String removeDuplicateCharFromString(String demo){
//    char[] convert = demo.toCharArray();
//    String b = "";
//
//        for (int i = 0; i < convert.length; i++) {
//        if (!b.contains(String.valueOf(convert[i]))) {
//            b += convert[i];
//        }
//    }
//
//        return b;
//}


    public String removeDuplicateCharFromString(String demo) {
        char[] convert = demo.toCharArray();
        String b = "";

        for (int i = 0; i < convert.length; i++) {
            int j;
            for (j = 0; j < b.length(); j++) {
                if (convert[i] == b.charAt(j)) {
                    break; // Exit the loop if a duplicate is found
                }
            }
            if (j == b.length()) { // If no duplicate was found, add the character
                b += convert[i];
            }
        }

        return b;
    }



public static void main(String [] args){

       String a=new  RemoveDuplicateString ().removeDuplicateCharFromString("Ashish");

        System.out.println(a);
    }
}
