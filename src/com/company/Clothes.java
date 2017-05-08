package com.company;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;


/**
 * Created by Yeonsung Kim on 17. 5. 7..
 */
public abstract class Clothes {

    String temp;

    static int footwear = 1;
    static int headwear = 2;
    static int socks = 3;
    static int shirt = 4;
    static int jacket = 5;
    static int pants = 6;
    static int pajama = 8;

    abstract String action(String temp);

    abstract boolean checkdependency(ArrayList<Integer> commands, String temp);

}
