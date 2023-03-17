package com.huawei.codecraft;

public class Robots {

    private int id;
    private int type;
    // 时间价值系数
    private float timeValuerate;
    // 碰撞价值系数
    private float knockValuerate;
    private float angularVelocity;
    private float[] linearVelocity = new float[2];
    private float direction;
    private double X;
    private double Y;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getTimeValuerate() {
        return timeValuerate;
    }

    public void setTimeValuerate(float timeValuerate) {
        this.timeValuerate = timeValuerate;
    }

    public float getKnockValuerate() {
        return knockValuerate;
    }

    public void setKnockValuerate(float knockValuerate) {
        this.knockValuerate = knockValuerate;
    }

    public float getAngularVelocity() {
        return angularVelocity;
    }

    public void setAngularVelocity(float angularVelocity) {
        this.angularVelocity = angularVelocity;
    }

    public float[] getLinearVelocity() {
        return linearVelocity;
    }

    public void setLinearVelocity(float[] linearVelocity) {
        this.linearVelocity = linearVelocity;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }




}
