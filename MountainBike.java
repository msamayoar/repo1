public class MountainBike extends Bicycle {

    public final static String MODE_RACE_XC = "RACE_XC";
    public final static String MODE_MARATHON_XC = "MARATHON_XC";
        
    // the MountainBike subclass has
    // one field
    public int seatHeight;
    private String suspension = "140mm";
    private int headTube = 70; //angle
    private String mode;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    } 

    public int getHeadTube(){
	return headTube;
    }

    public String getSuspension(){
 	return suspension;
    }
    	
    public void setMode(String mode){
	this.mode = mode;
    }

    public String getSpecs(){
	System.out.println("Suspension Travel: " + this.getSuspension() );
	System.out.println("Head Tube angle: " + this.getHeadTube() +"°" );
   	System.out.println("Mode: " + mode );
    }

}
