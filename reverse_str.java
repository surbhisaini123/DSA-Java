
public class reverse_str {
    public static void main(String[] args) {
        String S="hello";

       char[] ch=S.toCharArray();//System.out.println(ch);
       System.out.println("ORIGINAL STRING:");
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println("---//---//---//---//");
        System.out.println("REVERSE STRING:");
        for(int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
        }
      
            
    }
    
}
