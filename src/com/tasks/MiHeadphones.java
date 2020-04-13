package com.tasks;

public class MiHeadphones extends Headphones{

    private String headphoneName;
    private String headphoneColor;
    private int price;


    public MiHeadphones(String headphoneName, String headphoneColor){
        this.headphoneName = headphoneName;
        this.headphoneColor = headphoneColor;
        this.setEarSize(3);
        this.setHeadphoneFrequencyRange("13-40000");
        this.setMicrophone(true);
        this.setNoiseCancelling(true);
        this.setRemovableness(true);
        this.setWireImpedance(32);
        this.setType("Closed-Back");
        System.out.println("New headphone has been created.");
    }


    public String getHeadphoneColor() {
        return headphoneColor;
    }

    public void setHeadphoneColor(String headphoneColor) {
        this.headphoneColor = headphoneColor;
    }

    public String getHeadphoneName() {
        return headphoneName;
    }

    public void setHeadphoneName(String headphoneName) {
        this.headphoneName = headphoneName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
