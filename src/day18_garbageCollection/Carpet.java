package day18_garbageCollection;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public static void main(String[] args) {

        Carpet crpt=new Carpet();

        crpt.setInfo(12,43,23,true);
        System.out.println("--------------------------");
        System.out.println(crpt);
        System.out.println("--------------------------");
        System.out.println(crpt.calcCost());


    }

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double total = width * length * unitPrice;
        return isPersian ? total+200 : total;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost=" + calcCost() +
                '}';
    }

}

/*
Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length)*unitprice

		    if the carpet is persian  carpet, add 200$ to the totalPrice
 */