/**
 * Copyright © 2023 七牛信息技术有限公司. All rights reserved.
 *
 * @Title: PeakDTO.java
 * @Prject: audio-analysis
 * @Package: com.badlogic.audio.entity
 * @Description: TODO
 * @author: liangfengyuan@qiniu.com
 * @date: 2023/06/12 10:01
 * @version: V1.0
 */
package com.badlogic.audio.entity.dto;


import java.util.Arrays;

public class PeakDTO {
    private Integer time;
    private String direction;
    private int[] coordinate;
    private String color;

    public PeakDTO(String direction, int[] coordinate, String colour) {
        this.direction = direction;
        this.coordinate = coordinate;
        this.color = colour;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int[] getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int[] coordinate) {
        this.coordinate = coordinate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PeakDTO{" +
                "time=" + time +
                ", direction='" + direction + '\'' +
                ", coordinate=" + Arrays.toString(coordinate) +
                ", color='" + color + '\'' +
                '}';
    }
}
