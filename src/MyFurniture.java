import java.text.DecimalFormat;

public abstract class MyFurniture {

    private String type;
    final java.util.Date datePurchased;
    private int numOfType;
   // private final Purchaser[] furnitureList;

    /** Construct a default furniture object */

    protected MyFurniture(){
        datePurchased = new java.util.Date();
    //   furnitureList = new Purchaser[5];

    }
   /** Construct a furniture object with the specified type and choice
   * @return
   * @param type
   * @param c
   * @param // numOfType
   */

   protected MyFurniture(String type, String c){
       datePurchased = new java.util.Date();
       this.type = type;
    //   furnitureList = new Purchaser[5];
   }
  /**Return type
   * @return */
  public String getType(){
      return type;
  }

    /** Set a new type of furniture
     * @param type */
    public void setType(String type){
        this.type=type;
    }

    /** Get dateCreated
     * @return */
    public java.util.Date getDatePurchased(){
        return datePurchased;
    }

    /** Return a string representation of this object
     @Override Annotation*/
    public String toString(){
        return "Purchased on "+datePurchased;
    }



}
