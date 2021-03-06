package org.gyt.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class WebPageSaver {
    public static void main(String args[]) throws Exception {
        OutputStream out = new FileOutputStream("c:/temp/test.html");

        URL url = new URL("http://www.oracle.com/technetwork/java/index.html");
        URLConnection conn = url.openConnection();
        conn.connect();
        InputStream is = conn.getInputStream();

        copy(is, out);
        is.close();
        out.close();
    }

    private static void copy(InputStream from, OutputStream to) throws IOException {
        byte[] buffer = new byte[4096];
        while (true) {
            int numBytes = from.read(buffer);
            if (numBytes == -1) {
                break;
            }
            to.write(buffer, 0, numBytes);
        }
    }
}