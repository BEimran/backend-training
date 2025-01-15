package Day12;

import java.nio.ByteBuffer;

public class NioBufferExample {
    public static void main(String[] args) {
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);

        String sampleData = "Hello, this is a sample NIO Buffer example.";
        readBuffer.put(sampleData.getBytes());

        readBuffer.flip();

        while (readBuffer.hasRemaining()) {
            byte data = readBuffer.get();
            writeBuffer.put(data);
        }
        writeBuffer.flip();
        System.out.print("Data written to the destination: ");
        while (writeBuffer.hasRemaining()) {
            System.out.print((char) writeBuffer.get());
        }
        readBuffer.clear();
        writeBuffer.clear();
    }
}
