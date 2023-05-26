/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject1;

import java.io.Serializable;

/**
 *
 * @author maial
 */
public class Info2 implements Serializable{
    private String campChoice;
    private String amount;
    private String feature1;
    private String feature2;
    private String feature3;
    private String feature4;
    private String addLabel;
    private int pnum;

    public Info2(String campChoice, String amount, String feature1, String feature2, String feature3, String feature4, String addLabel, int pnum) {
        this.campChoice = campChoice;
        this.amount = amount;
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
        this.feature4 = feature4;
        this.addLabel = addLabel;
        this.pnum = pnum;
    }

    public String getCampChoice() {
        return campChoice;
    }

    public String getAmount() {
        return amount;
    }

    public String getFeature1() {
        return feature1;
    }

    public String getFeature2() {
        return feature2;
    }

    public String getFeature3() {
        return feature3;
    }

    public String getFeature4() {
        return feature4;
    }

    public String getAddLabel() {
        return addLabel;
    }

    public int getPnum() {
        return pnum;
    }

    public void setCampChoice(String campChoice) {
        this.campChoice = campChoice;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setFeature1(String feature1) {
        this.feature1 = feature1;
    }

    public void setFeature2(String feature2) {
        this.feature2 = feature2;
    }

    public void setFeature3(String feature3) {
        this.feature3 = feature3;
    }

    public void setFeature4(String feature4) {
        this.feature4 = feature4;
    }

    public void setAddLabel(String addLabel) {
        this.addLabel = addLabel;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

}