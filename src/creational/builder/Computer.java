package creational.builder;

import javax.sound.midi.SysexMessage;

public class Computer {
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder) {
        this.HDD=builder.getHDD();
        this.RAM=builder.getRAM();
        this.isGraphicsCardEnabled=builder.getIsGraphicsCardEnabled();
        this.isBluetoothEnabled=builder.getIsBluetoothEnabled();
    }

    public void display(){
        System.out.println(this.HDD);
        System.out.println(this.RAM);
        System.out.println(this.isGraphicsCardEnabled);
        System.out.println(this.isBluetoothEnabled);
    }
}
