package ru.javaprojects.thinkinginjava.chapter10.exercise23;

public class Main {
    private static final boolean FLAG = true;

    public static void main(String[] args) {
        GreenHouseControlsMoisteningControlling greenHouseControls = new GreenHouseControlsMoisteningControlling();
        greenHouseControls.addEvent(greenHouseControls.new Bell(900));
        Event[] eventList = {
                greenHouseControls.new LightOn(200),
                greenHouseControls.new LightOff(400),
                greenHouseControls.new WaterOn(600),
                greenHouseControls.new WaterOff(800),
                greenHouseControls.new WindOn(1000),
                greenHouseControls.new WindOff(1200),
                greenHouseControls.new MoisteningSupport(1400, true),
                greenHouseControls.new MoisteningSupport(1600, false),
        };
        greenHouseControls.addEvent(greenHouseControls.new Restart(2000, eventList));
        if (FLAG) {
            greenHouseControls.addEvent(new GreenHouseControls.Terminate(5000));
        }
        greenHouseControls.run();
    }
}
