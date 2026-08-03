package huffman;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int argsLength = args.length;

        if (argsLength < 2) {
            System.out.println("Usage: java -jar huffman.jar [-c|-d] <input-file> [-o <output-file>]");
            System.exit(1);
        } else {
            String mode = args[0];
            String filePath = args[1];

            if (mode.equals("-c")) {
                try {
                    Map<Byte, Long> frequencies = FrequencyTable.buildFrequencyTable(filePath);
                    System.out.println(frequencies);
                } catch (Exception e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
            }
        }
    }
}
