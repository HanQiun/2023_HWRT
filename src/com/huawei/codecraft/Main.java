package com.huawei.codecraft;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    private static final BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));

    private static final PrintStream outStream = new PrintStream(new BufferedOutputStream(System.out), true);

    private static ArrayList<WorkStation> workStationArrayList = new ArrayList<>();
    private static ArrayList<Robots> robotsArrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        schedule();

    }

    private static void schedule() throws IOException {
        readMap();
        outStream.print("OK\n");
        // 帧ID
        int frameID;
        String line;

        while ((line = inStream.readLine()) != null) {
            String[] parts = line.split(" ");
            System.err.println();
            System.err.println(line);
            frameID = Integer.parseInt(parts[0]);
            System.err.println(frameID);
            readFrame();
            StringBuilder builder = new StringBuilder();
            builder.append(frameID).append('\n');
            int lineSpeed = 3;
            double angleSpeed = 1.5;
            for (int robotId = 0; robotId < 4; robotId++) {
                builder.append("forward").append(' ').append(robotId).append(' ').append(lineSpeed).append('\n');
                builder.append("rotate").append(' ').append(robotId).append(' ').append(angleSpeed).append('\n');
            }
            builder.append("OK").append('\n');
            outStream.print(builder);
        }
    }
    // 读地图
    private static boolean readMap() throws IOException {
        String line;
        int sum = 0;
        int robotID = 1;
        while ((line = inStream.readLine()) != null) {
            for(int i = 0; i < line.length(); i++){
                //初始化地图同时初始化机器人信息
                if(line.charAt(i) == 'A'){
                    Robots robot = new Robots();
                    robot.setX((i+1) * 0.25);
                    robot.setY(49.75 - sum * 0.5);
                    robot.setId(robotID);
                    robot.setType(0);
                    robot.setTimeValuerate(0);
                    robot.setKnockValuerate(0);
                    robot.setAngularVelocity(0);
                    robot.setLinearVelocity(new float[]{0,0});
                    robot.setDirection(0);
                    robotsArrayList.add(robot);
                    robotID++;
                }
            }
            sum++;
            if ("OK".equals(line)) {
                return true;
            }
        }
        return false;
    }

    private static boolean readFrame() throws IOException {
        System.err.println(1);
        System.err.println(2);

        return  false;
    }

}
