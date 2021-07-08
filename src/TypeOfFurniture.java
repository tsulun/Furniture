public class TypeOfFurniture {
    private final String name;
    private final int memberId;
    private final Purchaser[] furnitureList;
    private int numOfFurniture;

    public TypeOfFurniture(int m,String n, String j){
        name = n;
        memberId = m;
        furnitureList = new Purchaser[10];
    }
    public String getName(){
        return name;
    }
    public int getMemberId(){
        return memberId;
    }
    public void addFurniture(Purchaser p1){
        furnitureList[numOfFurniture]=p1;
        numOfFurniture++;
    }
    public int getNumOfFurniture(){
        return numOfFurniture;
    }
    public void printAllInfo(){
        System.out.println("\nThis furniture set was taken by : " + name);
        System.out.println(name + " was taken " + numOfFurniture + " set (s).");
        System.out.println("List of furniture(s) taken : ");

        for(int i = 0;i<numOfFurniture; i++){
            Purchaser s = (Purchaser)furnitureList[i];
            System.out.println((i+1) + ". " + s.getName());
        }
    }

    public TypeOfFurniture(int m,String n, String j){
        name = n;
        memberId = m;
        furnitureList = new Purchaser[10];
    }
    public String getName(){
        return name;
    }
    public int getMemberId(){
        return memberId;
    }
    public void addFurniture(Purchaser p1){
        furnitureList[numOfFurniture]=p1;
        numOfFurniture++;
    }
    public int getNumOfFurniture(){
        return numOfFurniture;
    }
    public void printAllInfo(){
        System.out.println("\nThis furniture set was taken by : " + name);
        System.out.println(name + " was taken " + numOfFurniture + " set (s).");
        System.out.println("List of furniture(s) taken : ");

        for(int i = 0;i<numOfFurniture; i++){
            Purchaser s = (Purchaser)furnitureList[i];
            System.out.println((i+1) + ". " + s.getName());
        }
    }
}
