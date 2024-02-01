
public class Main {
    public static void main(String[] args) {

Resolution resolution = new Resolution(1920,1080);

Monitor monitor = new Monitor("VS197DE", "Asus","18.5",resolution);

ComputerCase computerCase = new ComputerCase("Shadow Blade", "Shadow","glass");

MotherBoard motherBoard = new MotherBoard("B250-PRO","Asus",10,"Windows 11");

Computer computer = new Computer(monitor,computerCase,motherBoard);

computer.getComputerCase().openTheComputer();
System.out.println(computer.getMonitor().getResolution().getHeight());
computer.getMotherBoard().loadOpSystem("Windows 10");


    }
}