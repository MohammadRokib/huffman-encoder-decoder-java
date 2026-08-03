package huffman;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyTable {
    public static Map<Byte, Long> buildFrequencyTable(String filePath) throws IOException {
        Map<Byte, Long> frequencies = new HashMap<>();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream((filePath)))) {
            int currentByte;
            while((currentByte = bis.read()) != -1) {
                byte b = (byte) currentByte;
                frequencies.put(b, frequencies.getOrDefault(b, 0L) + 1L);
            }
        }
        return frequencies;
    }
}
