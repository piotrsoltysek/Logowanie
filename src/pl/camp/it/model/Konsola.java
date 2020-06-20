package pl.camp.it.model;

public enum Konsola {
    PS(4000, "GU100", "SonyPlaystation", "4"),
    XBOX(3800, "GU100", "Microsoft", "One"),
    NINTENDO(2000, "GU100", "Nintendo", "Switch");

    private int processorClock;
    private String gpuName;
    private String brand;
    private String model;

    Konsola(int processorClock, String gpuName, String brand, String model) {
        this.processorClock = processorClock;
        this.gpuName = gpuName;
        this.brand = brand;
        this.model = model;
    }
}
