package com.company;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = true;
        this.altitude = 0;
    }

    @Override
    public void takeOff(){
        if (this.altitude == 0 && this.flying) {
            this.flying = true;
            System.out.printf("%s take off into the air.%n", this.getName());
        }
    };

    @Override
    public int ascend (int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 20);
            System.out.printf("%s ascend upward, altitude: %d%n",  this.getName(), this.altitude );
        }
        return this.altitude;
    }

    @Override
    public int descend (int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 300);
            System.out.printf("%s flys downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude < 9) {
            System.out.printf("%s is landing ! %n", this.getName());
        }
        else {
            System.out.printf("%s is preparing himself to land! %n", this.getName());
        }
    }

    @Override
    public void glide () {
        System.out.printf("My name is %s and i talk !%n", this.getName());
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}















