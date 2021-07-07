import java.util.Scanner;

public class ComparableKidsSet extends MyKidsSet implements Comparable{

    private String kidsId, furName;
    private double price;

    public ComparableKidsSet(){
    }

    public ComparableKidsSet( ComparableKidsSet o1){

    }


    @Override
    public int compareTo(ComparableKidsSet o) {
        if(getPrice() > ( (ComparableKidsSet)o).getPrice() ){
            return 1;
        }else if (getPrice() < (( ComparableKidsSet)o).getPrice() ){
            return -1;
        }else
            return 0;
    }

    public String showPrice()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter the kid's set Id : ");
        kidsId = input.nextLine();
        System.out.print("Pease enter the kid's furniture name :");
        furName = input.nextLine();


        switch(kidsId)
        {
            case("IK001"):
                price = 45.00;
                System.out.print("Price is RM :" + price);
                break;
            case("IK002"):
                price = 100.00;
                System.out.print("Price is RM :" + price);
                break;
            case("IK003"):
                price = 250.00;
                System.out.print("Price is RM :" + price);
                break;
            case("IK004"):
                price = 150.00;
                System.out.print("Price is RM :" + price);
                break;
            case("IK005"):
                price = 450.00;
                System.out.print("Price is RM :" + price);
                break;
            default:
                System.out.println("Invalid choice!!");
                System.exit(0);
        }
        return kidsId;
    }




}
