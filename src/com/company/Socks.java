package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Yeonsung Kim on 17. 5. 7..
 */
public class Socks extends Clothes {

    int[] COLD_DEPENDS = {pajama};
    int[] HOT_DEPENDS = {pajama};
    public String action(String temp){
        if(temp.equals("HOT")){
            System.out.print("fail");
            return "fail";
        }
        else if(temp.equals("COLD")){
            System.out.print("socks");
            return "socks";
        }

        else{
            System.out.print("fail");
            return "fail";
        }
    }

    public boolean checkdependency(ArrayList<Integer> commands, String temp){
        int[]depends ={};
        switch (temp){
            case "HOT":
                depends = HOT_DEPENDS;
                break;
            case "COLD":
                depends = COLD_DEPENDS;
                break;
        }
        for(int i = 0; i < depends.length;i++){
            if(!commands.contains(depends[i])) {

                return false;
            }

        }

        return true;
    }
}
