package cn.heypai.util.api.bean;

/**
 * @author by licheng on 2018/8/1.
 */

public class Point {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "{" +
                "\"x\":" + x +
                ", \"y\":" + y +
                '}';
    }
}
