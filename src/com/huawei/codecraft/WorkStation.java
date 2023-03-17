package com.huawei.codecraft;

public class WorkStation {
    private int stationType;
    private float X;
    private float Y;
    // 剩余生产时间
    private int produceTime;
    private int dataStaus;
    private int productStaus;

    public int getStationType() {
        return stationType;
    }

    public void setStationType(int stationType) {
        this.stationType = stationType;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public int getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(int produceTime) {
        this.produceTime = produceTime;
    }

    public int getDataStaus() {
        return dataStaus;
    }

    public void setDataStaus(int dataStaus) {
        this.dataStaus = dataStaus;
    }

    public int getProductStaus() {
        return productStaus;
    }

    public void setProductStaus(int productStaus) {
        this.productStaus = productStaus;
    }
}
