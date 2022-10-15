import java.util.*;

class Player2 extends Player{
    //private String name;

    public void setplayer_name(String name){
        this.name = name;
    }

    public String get_name(){
        return name;
    }

    public void createname(){

        Scanner inp = new Scanner(System.in);
        String name;

        System.out.println("ENTER YOUR PLAYER 2 NAME: ");
        name = inp.nextLine();

        setplayer_name(name);

    }

    public void botname(){

        String name = "bot";

        setplayer_name(name);

    }
}
