public class nullException {
    public static void main(String[] args) {

        String str= null;

        try{
            System.out.println("the length of String is :"+str.length());
        }
        catch (NullPointerException e){
            System.out.println("the given string is null ...please provide the value ! ");
        }
        finally {
            System.out.println("the program is stop.....");
        }

    }
}
