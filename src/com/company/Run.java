package com.company;

public class Run {

    Truck truck = new Truck();
    Builder builder = new Builder();

    public Chassis runChassis() {
        Chassis chassis = new Chassis();
        builder.buildChassis();
        truck.setYourChassis(chassis);

        return chassis;
    }
    public void runAcc() {
        builder.buildAcc();
        truck.setYourAccessories(builder.buildAcc());
    }
    public void runPower() {
        Power power = new Power();
        builder.buildPower();
        truck.setYourEngine(power);
    }
    public void runSeat() {
        Seat seat = new Seat();
        builder.buildSeat();
        truck.setSeat(seat);
    }
    public void runTran() {
        Transmission tran = new Transmission();
        builder.buildTransmission();
        truck.setTran(tran);
    }
    public void runStyle() {
        Style style = new Style();
        builder.buildStyle();
        truck.setStyle(style);
    }
}
