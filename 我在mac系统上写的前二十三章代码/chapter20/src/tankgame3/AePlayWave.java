package tankgame3;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * @author 王凯
 * @version 1.0
 */

    public class AePlayWave extends Thread {
        private String filename;

        public AePlayWave(String wavfile) {
            this.filename = wavfile;
        }

        public void run() {
            File soundFile = new File(this.filename);
            AudioInputStream audioInputStream = null;

            try {
                audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            } catch (Exception var15) {
                var15.printStackTrace();
                return;
            }

            AudioFormat format = audioInputStream.getFormat();
            SourceDataLine auline = null;
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            try {
                auline = (SourceDataLine)AudioSystem.getLine(info);
                auline.open(format);
            } catch (Exception var14) {
                var14.printStackTrace();
                return;
            }

            auline.start();
            int nBytesRead = 0;
            byte[] abData = new byte[512];

            try {
                while(nBytesRead != -1) {
                    nBytesRead = audioInputStream.read(abData, 0, abData.length);
                    if (nBytesRead >= 0) {
                        auline.write(abData, 0, nBytesRead);
                    }
                }

                return;
            } catch (IOException var16) {
                var16.printStackTrace();
            } finally {
                auline.drain();
                auline.close();
            }

        }
    }


