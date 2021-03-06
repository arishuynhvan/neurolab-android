package io.neurolab;

public class ServerSettings {

    private boolean loadFromPhone = false;
    private boolean advancedMode = false;
    private boolean bit24 = false;
    private boolean simulation = true;
    private boolean audioFeedback = true;

    private String serialAddress = "/dev/rfcomm0";

    private double p2p = 15.0;

    private int pp = 18;
    private int fir = 0;
    private int avg = 100;
    private int tf = 10;

    public boolean isLoadFromPhone() {
        return loadFromPhone;
    }

    public boolean isAdvancedMode() {
        return advancedMode;
    }

    public boolean isBit24() {
        return bit24;
    }

    public boolean isSimulation() {
        return simulation;
    }

    public boolean isAudioFeedback() {
        return audioFeedback;
    }

    public String getSerialAddress() {
        return serialAddress;
    }

    public double getP2P() {
        return p2p;
    }

    public int getPP() {
        return pp;
    }

    public int getFir() {
        return fir;
    }

    public int getAvg() {
        return avg;
    }

    public int getTf() {
        return tf;
    }

    // Converts to the string representation and can be used for debugging purposes.
    @Override
    public String toString() {
        return "loadFromPhone = " + loadFromPhone + " | " + "advancedMode = " + advancedMode + " | "
                + "bit24 = " + bit24 + " | " + "simulation = " + simulation + " | " + "audioFeedback = "
                + audioFeedback + " | " + "serialAddress = " + serialAddress + " | " + "p2p = " +
                p2p + " | " + "pp = " + pp + " | " + "fir = " + fir + " | " + "avg = " + avg + " | "
                + "tf = " + tf;
    }

}
