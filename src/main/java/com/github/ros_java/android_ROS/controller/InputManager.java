package com.github.ros_java.android_ROS.controller;

import android.util.Log;

/**
 * Created by erki on 2/11/16.
 */
public class InputManager {
    //left JoyStick
    public static int leftJSx = 0;
    public static int leftJSy = 0;
    public static float leftJSdistance = 0;
    public static float leftJSangle = 0;
    public static float leftJSxangle = 0;
    public static boolean leftJSup = false;



    //right JoyStick
    public static int rightJSx = 0;
    public static int rightJSy = 0;
    public static float rightJSdistance = 0;
    public static float rightJSangle = 0;
    public static float rightJSxangle = 0;
    public static boolean rightJSup = false;


    public static String enteredText = "";

    public static int slider = 0;

    public static boolean buttonPress = false;

    //From the left joystick
    public static void leftJoystickData(int x, int y) {
        leftJSx = x;
        leftJSy = y;


        if(y >= 8) leftJSup = true;
        else leftJSup = false;

        leftJSdistance = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))/25;

        if(slider > 0) {
            leftJSdistance = leftJSdistance * slider;
        }


        double turnD = -1*x/10.0*Math.PI;
        leftJSxangle = (float) turnD;
        if(x <=2 && x >= -2 && y >= 6) leftJSxangle = 0;

        double angle1 = Math.atan2(10, 0);
        double angle2 = Math.atan2(y, x );

        float degToRad = (float) (-1*(angle1 - angle2));
        leftJSangle = degToRad;


    }

    //From the right joystick
    public static void rightJoystickData(int x, int y) {
        rightJSx = x;
        rightJSy = y;

        if(y >= 8) rightJSup = true;
        else rightJSup = false;

        double turnD = -1*x/10.0*Math.PI;

        rightJSxangle = (float) turnD;
        if(x <=2 && x >= -2 && y >= 6) rightJSxangle = 0;



        rightJSdistance = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))/25;

        if(slider != 0) {
            rightJSdistance = rightJSdistance * slider;
        }

        double angle1 = Math.atan2(10, 0);
        double angle2 = Math.atan2(y, x );

        float degToRad = (float) (-1*(angle1 - angle2));
        rightJSangle = degToRad;

    }

    public static float getFloat(String request) {

        if(request.equals("leftJSx")) {
            return leftJSx;
        } else if(request.equals("leftJSy")) {
            return leftJSy;
        } else if(request.equals("leftJSdistance")) {
            return leftJSdistance;
        } else if(request.equals("leftJSangle")) {
            return leftJSangle;
        } else if(request.equals("rightJSx")) {
            return rightJSx;
        } else if(request.equals("rightJSy")) {
            return rightJSy;
        } else if(request.equals("rightJSdistance")) {
            return rightJSdistance;
        } else if(request.equals("rightJSangle")) {
            return rightJSangle;
        } else if(request.equals("rightJSxangle")) {
            return rightJSxangle;
        } else if(request.equals("enteredText")) {
            return Float.parseFloat(enteredText);
        } else if(request.equals("slider")) {
            return slider;
        }

        return Float.parseFloat(request);
    }

    public static Byte getByte(String request) {

        if(request.equals("leftJSx")) {
            return Byte.parseByte(String.valueOf(leftJSx));
        } else if(request.equals("leftJSy")) {
            return Byte.parseByte(String.valueOf(leftJSy));
        } else if(request.equals("leftJSdistance")) {
            return Byte.parseByte(String.valueOf(leftJSdistance));
        } else if(request.equals("leftJSangle")) {
            return Byte.parseByte(String.valueOf(leftJSangle));
        } else if(request.equals("rightJSx")) {
            return Byte.parseByte(String.valueOf(rightJSx));
        } else if(request.equals("rightJSy")) {
            return Byte.parseByte(String.valueOf(rightJSy));
        } else if(request.equals("rightJSdistance")) {
            return Byte.parseByte(String.valueOf(rightJSdistance));
        } else if(request.equals("rightJSangle")) {
            return Byte.parseByte(String.valueOf(rightJSangle));
        } else if(request.equals("rightJSxangle")) {
            return Byte.parseByte(String.valueOf(rightJSxangle));
        } else if(request.equals("enteredText")) {
            return Byte.parseByte(String.valueOf(enteredText));
        } else if(request.equals("slider")) {
            return Byte.parseByte(String.valueOf(slider));
        }

        return Byte.parseByte(request);
    }




    public static int getInt(String request) {
        if(request.equals("leftJSx")) {
            return leftJSx;
        } else if(request.equals("leftJSy")) {
            return leftJSy;
        } else if(request.equals("leftJSdistance")) {
            return (int) leftJSdistance;
        } else if(request.equals("leftJSangle")) {
            return (int) leftJSangle;
        } else if(request.equals("rightJSx")) {
            return rightJSx;
        } else if(request.equals("rightJSy")) {
            return rightJSy;
        } else if(request.equals("rightJSdistance")) {
            return (int) rightJSdistance;
        } else if(request.equals("rightJSangle")) {
            return (int) rightJSangle;
        } else if(request.equals("rightJSxangle")) {
            return (int) rightJSxangle;
        } else if(request.equals("enteredText")) {
            return Integer.parseInt(enteredText);
        } else if(request.equals("slider")) {
            return slider;
        }
        if(request.equals("")) {
            return 0;

        }
        Log.i("request", request);
        return Integer.parseInt(request);

    }

    public static boolean getBool(String request) {
        if(request.equals("rightJSup")) {
            return rightJSup;
        } else if(request.equals("leftJSup")) {
            return leftJSup;
        } else if(request.equals("enteredText")) {
            return Boolean.parseBoolean(enteredText);
        } else if(request.equals("buttonPress")) {
            return buttonPress;
        }
        return Boolean.parseBoolean(request);
    }

    public static String getText(String request) {
        if(request.equals("leftJSx")) {
            return String.valueOf(leftJSx);
        } else if(request.equals("leftJSy")) {
            return String.valueOf(leftJSy);
        } else if(request.equals("leftJSdistance")) {
            return String.valueOf(leftJSdistance);
        } else if(request.equals("leftJSangle")) {
            return String.valueOf(leftJSangle);
        } else if(request.equals("leftJSup")) {
            return String.valueOf(leftJSup);
        }

        else if(request.equals("rightJSx")) {
            return String.valueOf(rightJSx);
        } else if(request.equals("rightJSy")) {
            return String.valueOf(rightJSy);
        } else if(request.equals("rightJSdistance")) {
            return String.valueOf(rightJSdistance);
        } else if(request.equals("rightJSangle")) {
            return String.valueOf(rightJSangle);
        } else if(request.equals("rightJSxangle")) {
            return String.valueOf(rightJSxangle);
        } else if(request.equals("rightJSup")) {
            return String.valueOf(rightJSup);
        }

        else if(request.equals("enteredText")) {
            return enteredText;
        } else if(request.equals("slider")) {
            return String.valueOf(slider);
        }
        return request;
    }

}
