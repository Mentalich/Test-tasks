package main.java;

import java.util.ArrayList;

public class Methods {
    public static int Fibonachi_singular(int steps) {
        int result = 0;
        int q = 0;
        int w = 1;
        for (int start = 0; start < steps - 2; start++) {
            result = q + w;
            q = w;
            w = result;
        }
        return result;
    }

    public static ArrayList Fibonachi_array(int length) {
        ArrayList output = new ArrayList<>(length);
        int result = 0;
        int q = 0;
        int w = 1;
        output.add(q);
        output.add(w);
        for (int start = 0; start < length - 2; start++) {
            result = q + w;
            q = w;
            w = result;
            output.add(result);
        }
        return output;
    }
}
