import java.util.*;

class Player{

    protected String name;

    public void setplayer_name(String name){
        this.name = name;
    }

    public String get_name(){
        return name;
    }
    
    public void createname(){

        Scanner inp = new Scanner(System.in);
        String name;

        System.out.println("ENTER YOUR FCKIN NAME: ");
        name = inp.nextLine();

        setplayer_name(name);

    }

    public void viewscore(){

    }

    public void viewhistory(){

    }
}