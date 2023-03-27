public class passenger {

    private String firstName ;
    private String secondName;
    private int vehicleNo;
    private int numOfLitres;


    //Constructor method
    public passenger(String firstName,String secondName,int vehicleNo, int numOfLitres ){

            this.firstName = firstName;
            this.secondName = secondName;
            this.vehicleNo = vehicleNo;
            this.numOfLitres = numOfLitres;

    }

    //Getters
    public String getInformation() {
        return this.firstName + " " + this.secondName + " " + this.vehicleNo;
    }

    public int getNumOfLitres(){
        return this.numOfLitres;
    }
}
