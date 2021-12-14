/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spectrogram;

/**
 *
 * @author sethp
 */
public class Spectrogram {
    
    private Wave wave;

    public Spectrogram(Wave wave) {
        this.wave = wave;
    }
    
    private void buildSpectrogram(){
         short[] amplitudes = wave.getSampleAmplitudes();
         int numSamples = amplitudes.length;
         
         int pointer = 0;
    }
}
