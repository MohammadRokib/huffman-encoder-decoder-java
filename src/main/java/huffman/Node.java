package huffman;

public class Node implements Comparable<Node> {
    private final byte value;
    private final long frequency;

    private Node left;
    private Node right;

    public Node(byte value, long frequency) {
        this.value = value;
        this.frequency = frequency;

        left = null;
        right = null;
    }
    
    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
        
        this.frequency = left.frequency + right.frequency;
        this.value = 0;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    @Override
    public int compareTo(Node other) {
        return Long.compare(this.value, other.value);
    }

    public byte getValue() {
        return value;
    }

    public long getFrequency() {
        return frequency;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
