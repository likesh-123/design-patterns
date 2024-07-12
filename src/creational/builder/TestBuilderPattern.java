package creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {

        ComputerBuilder computerBuilder = new ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        Computer computer = new Computer(computerBuilder);

        computer.display();
    }
}
