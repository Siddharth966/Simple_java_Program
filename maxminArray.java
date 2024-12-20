public class maxminArray {

    public static void main(String[] args) {
        int[] a={3,5,2,6,8,9,1};

        int max = a[0];
        int min = a[0];

        for(int i=0; i<a.length;i++){
            if(a[i] > max){
               max= a[i];
            }
            if(a[i] < min){
              min = a[i];
            }

        }
        System.out.println("maximum no.of Array is : "+max);
        System.out.println("minimum no.of Array is : "+min);
    }
}
