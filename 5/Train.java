class TrainJourney{
    final int distance;
    static String transportName = "train";
    String startingFrom, terminating;
    int journeyTime;
    public void setStart(String s){
        startingFrom = s;
    }
    public String getStart(){
        return startingFrom;
    }
    public int getJourneyTime(){
        return journeyTime;
    }
    TrainJourney(String start, String end, int time){
        this.startingFrom = start;
        this.terminating = end;
        this.journeyTime = time;
        distance = time * 12;
        System.out.println("Initialising Train journey from " + start + " to " + end);
    }
}

class Freight extends TrainJourney{
    int capacity, carriages;
    boolean hazardous;
    public void setHazardous(){
        hazardous = true;
    }
    public int getCapacity(){
        return capacity;
    }
    Freight(String start, String end, int time, int cap, int car, boolean haz){
        super(start, end, time);
        capacity = cap;
        carriages = car;
        hazardous = haz;
        System.out.println("Freight of capacity " + capacity + "tonnes and carriages: " + carriages);
    }
}

class Passenger extends TrainJourney{
    int firstClass, carriages;
    boolean catering;
    public int getFirstClass(){
        return firstClass;
    }
    public void addCarriages(int cr){
        carriages += cr;
    }
    public void inService(boolean srv){
        catering = srv;
    }
    Passenger(String start, String end, int time, int fc, int car, boolean cat){
        super(start, end, time);
        firstClass = fc;
        carriages = car;
        catering = cat;
        System.out.println("Passenger with first class " + fc + " and carriages: " + carriages);
    }
}

public class Train {
    public static void main(String[] args){
        Freight f = new Freight("Pune", "Dublin", 123, 500, 20, false);
        Passenger p = new Passenger("Bengaluru", "Chennai", 300, 20, 23, false);
    }
}
