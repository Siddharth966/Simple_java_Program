class RbiBank {
    void checkBook(){
        System.out.println(" RBI Provide check Book");
    }
}
class BankOfBaroda extends RbiBank {
    void checkBook(){
        System.out.println(" BankOfBaroda also Provide check Book");
    }
}
class SBI extends RbiBank{
    void checkBook(){
        System.out.println(" SBI Provide check Book");
    }
}


public class inheritanceTest{
    public static void main(String[] args) {
        SBI sb = new SBI();
        sb.checkBook();

        BankOfBaroda bob = new BankOfBaroda();
        bob.checkBook();

    }
}


