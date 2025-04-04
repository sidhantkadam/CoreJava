package DesignPatterns.Behevioural;

    /*
     The Command Design Pattern is a behavioral design pattern that
     turns a request into a stand-alone object called a command.
     With the help of this pattern, you can capture each component of a request,
     including the object that owns the method, the parameters for the method,
     and the method itself.
     */

//Command Interface
interface Command {
    void execute();
}

//Concrete Command classes
//Concrete command for turning a device on
class TurnOnCommand implements Command {

    Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}

// Concrete command for turning a device off
class TurnOffCommand implements Command {

    Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}

// Concrete command for changing the channel of a TV
class ChangeChannelCommand implements Command {

    private final TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}

// Concrete command for adjusting the volume of a Speaker
class AdjustVolumeCommand implements Command {

    private final Speaker speaker;

    public AdjustVolumeCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.adjustVolume();
    }
}

//Create Receiver
interface Device {
    void turnOn();

    void turnOff();
}

//Concrete Receiver for a TV
class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turn off");
    }

    public void changeChannel() {
        System.out.println("Channel Changed !");
    }
}

//Concrete Receiver for a Speaker
class Speaker implements Device {

    @Override
    public void turnOn() {
        System.out.println("Speaker turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker turn off");
    }

    public void adjustVolume() {
        System.out.println("Volume Adjusted !");
    }
}

//Create Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {

        TV tv = new TV();
        Speaker speaker = new Speaker();

        Command command = new TurnOnCommand(tv);
        Command command1 = new TurnOnCommand(speaker);

        Command command2 = new ChangeChannelCommand(tv);
        Command command3 = new AdjustVolumeCommand(speaker);

        Command command4 = new TurnOffCommand(speaker);
        Command command5 = new TurnOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(command);
        remote.pressButton();

        remote.setCommand(command1);
        remote.pressButton();

        remote.setCommand(command2);
        remote.pressButton();

        remote.setCommand(command3);
        remote.pressButton();

        remote.setCommand(command4);
        remote.pressButton();

        remote.setCommand(command5);
        remote.pressButton();
    }
}
