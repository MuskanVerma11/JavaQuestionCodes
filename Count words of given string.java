import java.util.*;
class word{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String s=sc.nextLine();
        int i,j=1;
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)=' '){
                j++;
            }
        }System.out.println(j);
    }
}
