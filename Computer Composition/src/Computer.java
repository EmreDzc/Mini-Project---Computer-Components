public class Computer {
    private Monitor monitor;
    private ComputerCase computerCase;
    private MotherBoard motherBoard;

    public Computer(Monitor monitor, ComputerCase computerCase, MotherBoard motherBoard) {
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
