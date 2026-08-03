package huffman;

public class Main {
    public static void main(String[] args) {
        int argsLength = args.length;

        if (argsLength < 2) {
            System.out.println("Usage: java -jar huffman.jar [-c|-d] <input-file> [-o <output-file>]");
            System.exit(1);
        } else {
            for (int i = 0; i < 2; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
