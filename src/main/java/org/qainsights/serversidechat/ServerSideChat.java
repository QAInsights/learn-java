package org.qainsights.serversidechat;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSideChat {

    public static void main(String[] args) throws IOException {

        try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open()) {
            serverSocketChannel.bind(new InetSocketAddress(5555));

            while (serverSocketChannel.isOpen()) {

                SocketChannel clientSocketChannel = serverSocketChannel.accept();

                // PrintWriter printWriter = new PrintWriter(Channels.newOutputStream(clientSocketChannel));

                // printWriter.write("Hello");
                // printWriter.close();
                // System.out.println("Hello");

                // Using BufferedWriter

                BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(Channels.newOutputStream(clientSocketChannel))
                );
                bw.write("Hello again");
                bw.newLine();
                bw.write("Second line");
                bw.flush();
                bw.close();

                System.out.println("All three lines");


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
