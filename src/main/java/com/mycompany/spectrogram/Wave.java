/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spectrogram;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author sethp
 */
public class Wave {
    WaveHeader waveHeader;
    byte[] data;

    public Wave(InputStream inputStream) throws FileNotFoundException, IOException {
        waveHeader = new WaveHeader(inputStream);
        
        data = new byte[inputStream.available()];
        inputStream.read(data);
    }

    short[] getSampleAmplitudes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
