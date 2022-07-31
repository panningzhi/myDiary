package com.example.administrator.myapplication.extended_func;


import java.io.Serializable;


public class Intent_flag implements Serializable {

    private static final long serialVersionUID = 1;

    private String intentFlag;

    public Intent_flag(String intentFlag) {
        this.intentFlag = intentFlag;
    }

    public Intent_flag() {
    }

    public String getIntentFlag() {
        return intentFlag;
    }

    public void setIntentFlag(String intentFlag) {
        this.intentFlag = intentFlag;
    }
}
