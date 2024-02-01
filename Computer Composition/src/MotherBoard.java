public class MotherBoard {
    private String producer;
    private String model;
    private int numberOfSlots;
    private String operatingSystem;

    public MotherBoard(String producer, String model, int numberOfSlots, String operatingSystem) {
        this.producer = producer;
        this.model = model;
        this.numberOfSlots = numberOfSlots;
        this.operatingSystem = operatingSystem;
    }

    public void loadOpSystem(String system){
        operatingSystem = system;
        System.out.println("Current operation system is: " + operatingSystem);
    }



    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
