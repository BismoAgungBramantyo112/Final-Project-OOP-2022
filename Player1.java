import java.util.*;

class Player1 extends Player{
    //private String name;

    public void setplayer_name (String name){
        this.name = name;
    }

    public String get_name(){
        return name;
    }

    public void createname(){

        Scanner inp = new Scanner(System.in);
        String name;

        System.out.println("ENTER YOUR PLAYER 1 NAME: ");
        name = inp.nextLine();

        setplayer_name(name);

    }

    public int selectgamemode(){

        Scanner inp = new Scanner(System.in);

        int input;
         
        System.out.println("\n\nPlease choose your game mode: ");
        System.out.println("\n1. Solo (vs Computer)    2. 2 Player\n");

        do{
            System.out.println("Enter Your Choice: ");
            input = inp.nextInt();
        }while(input<1 && input>2);
       

        return input;


    }

    public int selectboard(){

        Scanner inp = new Scanner(System.in);
        int input;

        System.out.println("\nPlease Select Board: ");
        System.out.println("\n\n1. 3x3  2. 4x4   3. 5x5: \n");

        do{
            System.out.println("Enter your Choice:");
            input = inp.nextInt();

        }while(input < 1 && input > 3);

        return input;

    }

    public int startgame(){ //ini start sama end jadi satu

        int play;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.println("\nWanna Play ? 1. YASS    2. CHEECK SOME SCORE    3. CHEECK SLAYY BEfore    4. UMH NAURR\n");
            System.out.println("\nEnter your choices: ");
            play = inp.nextInt();
        }while(play < 1 && play > 4);

        return play;

    }

     //cleanboard udah ada di board nya, habis permainan langsung otomatis hapus.
}