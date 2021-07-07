public class Max{

    //**return the maxim between two object*/
    public static ComparableKidsSet max( ComparableKidsSet o1, ComparableKidsSet o2){
        if ( ( (ComparableKidsSet)o1).compareTo(o2) > 0 ){
            System.out.println("\nYour 1st item is more expensive then 2nd item");
            return  o1;
        }else{
            System.out.println("\nYour 2nd item is more cheaper.Enjoy!!");
            return o2;
        }
    }
    

}
