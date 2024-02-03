public class Main {
    public static void main(String[] args) {

        double springCost = 150.32;
        double summerCost = 450.32;
        double winterCost = 895.50;
        double fallCost = 3.50;
        double yearlyCost = 0;

        System.out.println("Spring cost is " + springCost);
        System.out.println("Summer cost is " + summerCost);
        System.out.println("Winter cost is " + winterCost);
        System.out.println("Fall cost is " + fallCost);

        yearlyCost = springCost + summerCost + winterCost + fallCost;

        System.out.println("The yearly cost is " + yearlyCost);


    }


}