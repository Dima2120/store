package store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Store {

    public static void main(String[] args) throws IOException {
        // hello Dima
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        String name = reader.readLine();

    }
}
