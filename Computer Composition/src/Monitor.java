public class Monitor {
    private String model;
    private String producer;
    private String dimension;
    private Resolution resolution;


    public Monitor(String model, String producer, String dimension, Resolution resolution) {
        this.model = model;
        this.producer = producer;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public void turnOffTheMonitor(){
        System.out.println("the monitor is turning off");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
