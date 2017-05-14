package com.company;

import java.util.*;



public class Main {

    public class LeaveHouse{

        private String temp;

        private ArrayList<Integer> commands;

        //command count before leaving houses
        public int HOT_CLOTHES_COUNT = 5;
        public int COLD_CLOTHES_COUNT = 7;

        LeaveHouse(String temp){
            this.temp = temp;

            this.commands = new ArrayList<Integer>();
        }


        public String parseCommand(String command){

            int com = Integer.parseInt(command);
            Clothes clo;
            switch (com){
                case 1:
                    clo = new Footwear();
                    if(clo.checkdependency(this.commands,this.temp) && !this.commands.contains(1)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }
                case 2:
                    clo = new Headwear();
                    if(clo.checkdependency(this.commands,this.temp)  && !this.commands.contains(2)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }
                case 3:
                    clo = new Socks();
                    if(clo.checkdependency(this.commands,this.temp)  && !this.commands.contains(3)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }
                case 4:
                    clo = new Shirt();
                    if(clo.checkdependency(this.commands,this.temp)  && !this.commands.contains(4)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }
                case 5:
                    clo = new Jacket();
                    if(clo.checkdependency(this.commands,this.temp)  && !this.commands.contains(5)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }
                case 6:
                    clo = new Pants();
                    if(clo.checkdependency(this.commands,this.temp)  && !this.commands.contains(6)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }
                case 7:
                   if((this.commands.size()==HOT_CLOTHES_COUNT) || (this.temp.equals("COLD") && this.commands.size()==COLD_CLOTHES_COUNT)){
                       System.out.print("leaving house");
                       return "leaving house";
                   }
                    else{
                       System.out.print("fail");
                       return "fail";
                   }
                case 8:
                    clo = new Pajamas();
                    if(clo.checkdependency(this.commands,this.temp)  && !this.commands.contains(8)){
                        return clo.action(this.temp);
                    }
                    else{
                        System.out.print("fail");
                        return "fail";
                    }


            }

            return "fail";
        }


        public void tryLeave(String[] commands){
            for(int i = 0; i < commands.length;i++){
               String result =  parseCommand(commands[i].substring(0,1));

                if(!result.equals("fail") && i < commands.length-1){
                    System.out.print(", ");
                    this.commands.add(Integer.parseInt(commands[i].substring(0,1)));
                }
                else{
                    break;
                }

            }
        }





    }

    public static void main(String[] args) {

        String line;
        Scanner stdin = new Scanner(System.in);
        line = stdin.nextLine();
        String[] tokens = line.split(" ");
        LeaveHouse op = new Main().new LeaveHouse(tokens[0]);



        op.tryLeave(Arrays.copyOfRange(tokens, 1, tokens.length));

        stdin.close();


    }
}
