package com.company;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Yeonsung Kim on 17. 5. 7..
 */
public class Footwear extends Clothes {

    /*
    •	Socks must be put on before shoes
    •	Pants must be put on before shoes

     */
    int[] COLD_DEPENDS = {pajama ,socks, pants};
    int[] HOT_DEPENDS = {pajama, pants};

    public String action(String temp){

        if(temp.equals("HOT")){
            System.out.print("sandals");
            return "sandals";
        }
        else if(temp.equals("COLD")){
            System.out.print("boots");
            return "boots";
        }

        else{
            System.out.print("fail");
            return "fail";
        }

    }

    public boolean checkdependency(ArrayList<Integer> commands , String temp){
        int[]depends = {};
        switch (temp){
            case "HOT":
                depends = HOT_DEPENDS;
                break;
            case "COLD":
                depends = COLD_DEPENDS;
                break;
        }

        for(int i = 0; i < depends.length;i++){
            if(!(commands.contains(depends[i]))) {

                return false;
            }

        }

        return true;
    }
}
