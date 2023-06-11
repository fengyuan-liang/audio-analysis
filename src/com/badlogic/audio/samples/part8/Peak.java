package com.badlogic.audio.samples.part8;

import com.badlogic.audio.analysis.FFT;
import com.badlogic.audio.io.MP3Decoder;
import com.badlogic.audio.io.WaveDecoder;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 *
 * </p>
 *
 * @author 梁峰源 <fengyuan-liang@foxmail.com>
 * @since 2023/6/11 18:34
 */
public class Peak {
    public static final String FILE_PATH = "samples/Tales of Dragonia - BrunuhVille.mp3";
    public static final int THRESHOLD_WINDOW_SIZE = 20;
    public static final float MULTIPLIER = 1.5f;

    public static void main(String[] args) {
        try {
            MP3Decoder decoder = new MP3Decoder(new FileInputStream(FILE_PATH));
            FFT fft = new FFT(1024, 44100);
            fft.window(FFT.HAMMING);
            float[] samples = new float[1024];
            float[] spectrum = new float[1024 / 2 + 1];
            float[] lastSpectrum = new float[1024 / 2 + 1];
            List<Float> spectralFlux = new ArrayList<>();
            List<Float> threshold = new ArrayList<>();

            while (decoder.readSamples(samples) > 0) {
                fft.forward(samples);
                System.arraycopy(spectrum, 0, lastSpectrum, 0, spectrum.length);
                System.arraycopy(fft.getSpectrum(), 0, spectrum, 0, spectrum.length);

                float flux = 0;
                for (int i = 0; i < spectrum.length; i++) {
                    float value = (spectrum[i] - lastSpectrum[i]);
                    flux += value < 0 ? 0 : value;
                }
                spectralFlux.add(flux);
            }

            List<Float> beatTimestamps = new ArrayList<>();

            float currentBeatTime = 0; // 当前的卡点时间
            float lastBeatTime = 0; // 上一个卡点时间

            for (int i = 0; i < spectralFlux.size(); i++) {
                int start = Math.max(0, i - THRESHOLD_WINDOW_SIZE);
                int end = Math.min(spectralFlux.size() - 1, i + THRESHOLD_WINDOW_SIZE);
                float mean = 0;
                for (int j = start; j <= end; j++)
                    mean += spectralFlux.get(j);
                mean /= (end - start);
                float thresholdValue = mean * MULTIPLIER;
                if (spectralFlux.get(i) > thresholdValue && currentBeatTime - lastBeatTime > 0.2) {
                    // 当前位置是一个卡点
                    beatTimestamps.add(currentBeatTime);
                    lastBeatTime = currentBeatTime;
                }
                currentBeatTime += samples.length / 44100f;
            }

            System.out.println("Beat timestamps:");
            for (float timestamp : beatTimestamps) {
                System.out.printf("%.2f\n", timestamp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}