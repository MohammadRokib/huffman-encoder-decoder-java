package huffman;

import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanTree {
    public static Node buildTree(Map<Byte, Long> frequencies) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (Map.Entry<Byte, Long> entry : frequencies.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        if (queue.isEmpty()) {
            return null;
        }

        while(queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();

            Node parent = new Node(left, right);
            queue.add(parent);
        }

        return queue.poll();
    }
}
