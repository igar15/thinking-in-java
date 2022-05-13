package ru.javaprojects.thinkinginjava.chapter8.exercise17;

import static ru.javaprojects.thinkinginjava.chapter8.exercise17.AlertStatus.DANGER;
import static ru.javaprojects.thinkinginjava.chapter8.exercise17.AlertStatus.OK;

public class StarShip {
    private AlertStatus alertStatus = OK;

    public void showStatus() {
        System.out.println("Status is " + alertStatus);
    }

    public void changeStatus(AlertStatus alertStatus) {
        this.alertStatus = alertStatus;
    }

    public static void main(String[] args) {
        StarShip starShip = new StarShip();
        starShip.showStatus();
        starShip.changeStatus(DANGER);
        starShip.showStatus();
    }
}
