package arrays;

public class program03 {
    public static void main(String[] args) {
        int x = 20;
        Integer obj1 = x;
        System.out.println(obj1);

        int y = obj1;
        System.out.println(y);

        String[] vect = new String[]{"Ana", "Bruno", "Lucas"};
        for(String obj : vect){
            System.out.println(obj);
        }
    }
}
