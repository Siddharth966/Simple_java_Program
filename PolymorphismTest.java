
class Addition {
    double result;

    int sum(int a, int b) {
        result = a + b;
        return (int) result;
    }

    int sum(int a, int b, int c) {
        result = a + b + c;
        return (int) result;
    }

    int sum(int a, double b, double c){
        result = a+ b+ c;
        return (int) result;
    }
}

    public class PolymorphismTest {
        public static void main(String[] args) {

            Addition ad = new Addition();

            System.out.println("the total sum is : "+ad.sum(2,3));

            System.out.println("the total sum is : "+ad.sum(2,3,4));

            System.out.println("the total sum is : "+ad.sum(2,3.9,4.7));
        }
        }


