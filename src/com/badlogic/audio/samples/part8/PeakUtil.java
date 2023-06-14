/**
 * Copyright © 2023 七牛信息技术有限公司. All rights reserved.
 *
 * @Title: PeakUtil.java
 * @Prject: audio-analysis
 * @Package: com.badlogic.audio.samples.part8
 * @Description: TODO
 * @author: liangfengyuan@qiniu.com
 * @date: 2023/06/12 15:52
 * @version: V1.0
 */
package com.badlogic.audio.samples.part8;

import com.badlogic.audio.entity.dto.PeakDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PeakUtil {
    private PeakUtil() {
        throw new UnsupportedOperationException();
    }

    private static final Map<Integer, String> directionMap = new HashMap<>(4);
    private static final Random r = new Random();

    static {
        directionMap.put(0, "left");
        directionMap.put(1, "right");
        directionMap.put(2, "up");
        directionMap.put(3, "down");
    }

    public static PeakDTO getPeakDTO(float currentBeatTime) {
        PeakDTO peakDTO = getPeakDTO();
        peakDTO.setTime((int) (currentBeatTime * 1000));
        return peakDTO;
    }

    public static PeakDTO getPeakDTO() {
        return new PeakDTO(getRandomDirection(), getRandomCoordinate(), getRandomColor());
    }

    public static String getRandomDirection() {
        return directionMap.get(getRandomNumberInRange(0, 3));
    }

    public static int[] getRandomCoordinate() {
        return new int[]{getRandomNumberInRange(-100, 100), getRandomNumberInRange(-100, 100)};
    }

    public static String getRandomColor() {
        return getRandomNumberInRange(0, 1) == 0 ? "red" : "blue";
    }

    public static int getRandomNumberInRange(int min, int max) {
        return r.nextInt((max - min) + 1) + min;
    }
}
