public class Comparison {
    public static void main(String[] args){
        String a = "apple";
        String b = "apple";
        // ==
    //     System.out.println(a == b);  // string pool
        
        String name1 = new String("lucifer");
        String name2 = new String("lucifer");
        System.out.println(name1 == name2);    // its gives false
        System.out.println(name1.equals(name2));  // its an method so its only taking the values
    }
}    