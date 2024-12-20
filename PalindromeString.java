public class PalindromeString {
    public static void main(String[] args) {

        String str ="kasaak";
        String str1 ="";

        for(int i=str.length()-1; i>=0; i--){
            str1 = str1+str.charAt(i);

        }
        if(str.equals(str1)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("it is not Palindrome");
        }
    }
}
