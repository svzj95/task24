import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int c = 0, j = 0, l = 0;
        Scanner scanner = new Scanner(System.in);
        //Input number of sweets
        System.out.println("Enter number of candys:");
        c = scanner.nextInt();

        System.out.println("Enter number of jellybeans:");
        j = scanner.nextInt();

        System.out.println("Enter number of lollipops:");
        l = scanner.nextInt();

        //Adding sweets to present
        List<Sweet> present = new ArrayList<Sweet>();
        for(int i=0;i<c;i++){
            present.add(new Candy());
        }
        for(int i=0;i<l;i++){
            present.add(new Lollipop());
        }
        for(int i=0;i<j;i++){
            present.add(new Jellybean());
        }

        //Evaluating total price and weight
        Iterator iterator = present.iterator();
        int sumPrice = 0, sumWeight = 0;
        Sweet buf;
        System.out.print("Present: ");
        while(iterator.hasNext()){
            buf = (Sweet) iterator.next();
            sumPrice += buf.getPrice();
            sumWeight += buf.getWeight();
            if(buf.getParameter().equals("Red")){
                System.out.print("Candy ");
            }
            if(buf.getParameter().equals("Jelly")){
                System.out.print("Jellybean ");
            }
            if(buf.getParameter().equals("Round")){
                System.out.print("Lollipop ");
            }
        }

        System.out.println("");
        //Output total price and weight
        System.out.printf("Total price: %d Total weight: %d",sumPrice,sumWeight);
    }
}
