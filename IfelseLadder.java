
public class IfelseLadder {

    public static void main(String[] args) {

        int Salary = 30000;


        if(Salary > 25000 ) {
            Salary = Salary + 3000;
        }

        else if (Salary > 30000){
            Salary += 4000;
        }

        else {
            Salary += 1000;
        }
        System.out.print("Your Salary + Bonous is : " + Salary );
    }
}