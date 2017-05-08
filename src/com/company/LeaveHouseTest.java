package com.company;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Yeonsung Kim on 17. 5. 8..
 */
public class LeaveHouseTest {

    @Test
    public void testTryLeave() throws Exception {
        String input = "HOT 8, 6, 4, 2, 1, 7";
        String expected = "Removing PJs, shorts, t-shirt, sun visor, sandals, leaving house";

        // set stdin
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set stdout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);



        String[] tokens = input.split(" ");
        Main.LeaveHouse op = new Main().new LeaveHouse(tokens[0]);

        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        Assert.assertEquals(expected, baos.toString());

    }

    @Test
    public void testTryLeave1() throws Exception {
        String input = "COLD 8, 6, 3, 4, 2, 5, 1, 7";
        String expected = "Removing PJs, pants, socks, shirt, hat, jacket, boots, leaving house";

        // set stdin
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set stdout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);



        String[] tokens = input.split(" ");
        Main.LeaveHouse op = new Main().new LeaveHouse(tokens[0]);

        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        Assert.assertEquals(expected, baos.toString());

    }

    @Test
    public void testTryLeave2() throws Exception {
        String input = "HOT 8, 6, 6";
        String expected = "Removing PJs, shorts, fail";

        // set stdin
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set stdout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);



        String[] tokens = input.split(" ");
        Main.LeaveHouse op = new Main().new LeaveHouse(tokens[0]);

        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        Assert.assertEquals(expected, baos.toString());

    }

    @Test
    public void testTryLeave3() throws Exception {
        String input = "HOT 8, 6, 3";
        String expected = "Removing PJs, shorts, fail";

        // set stdin
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set stdout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);



        String[] tokens = input.split(" ");
        Main.LeaveHouse op = new Main().new LeaveHouse(tokens[0]);

        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        Assert.assertEquals(expected, baos.toString());

    }

    @Test
    public void testTryLeave4() throws Exception {
        String input = "COLD 8, 6, 3, 4, 2, 5, 7";
        String expected = "Removing PJs, pants, socks, shirt, hat, jacket, fail";

        // set stdin
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set stdout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);



        String[] tokens = input.split(" ");
        Main.LeaveHouse op = new Main().new LeaveHouse(tokens[0]);

        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        Assert.assertEquals(expected, baos.toString());

    }

    @Test
    public void testTryLeave5() throws Exception {
        String input = "COLD 6";
        String expected = "fail";

        // set stdin
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // set stdout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);



        String[] tokens = input.split(" ");
        Main.LeaveHouse op = new Main().new LeaveHouse(tokens[0]);

        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        Assert.assertEquals(expected, baos.toString());

    }
}