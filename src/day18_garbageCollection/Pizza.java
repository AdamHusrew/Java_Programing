package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public static void main(String[] args) {

        Pizza piz=new Pizza();

        piz.setInfo('m',2,2);
        System.out.println(piz);
        System.out.println("------------------------------");
        System.out.println("Total cost: " + piz.calcCost());


    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalPrice=0;

        switch (size){
            case 's':
            case 'S':
                totalPrice=10+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            case 'm':
            case 'M':
                totalPrice=12+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            case 'l':
            case 'L':
                totalPrice=14+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
                break;
            default:
                System.err.println("Invalid size!!!");

        }
        return totalPrice;

    }


    @Override
    public String toString() {
        return "------------------------------------\n" +
                "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }


}
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */