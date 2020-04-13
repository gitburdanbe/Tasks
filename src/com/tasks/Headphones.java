package com.tasks;

public class Headphones extends WireFeatures {

    private String headphoneFrequencyRange;
    private String type;
    private boolean noiseCancelling;
    private boolean microphone;
    private int earSize;


    public String getHeadphoneFrequencyRange() {
        return headphoneFrequencyRange;
    }

    public void setHeadphoneFrequencyRange(String headphoneFrequencyRange) {
        this.headphoneFrequencyRange = headphoneFrequencyRange;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNoiseCancelling(boolean noiseCancelling) {
        this.noiseCancelling = noiseCancelling;
    }

    public void setMicrophone(boolean microphone) {
        this.microphone = microphone;
    }

    public void setEarSize(int earSize) {
        this.earSize = earSize;
    }

    public String getType() {
        return type;
    }

    public boolean getNoiseCancelling() {
        return noiseCancelling;
    }

    public boolean getMicrophone() {
        return microphone;
    }

    public int getEarSize() {
        return earSize;
    }
}