import java.util.*;

class Board{

    private int gamedimensions;
    private ArrayList<String> boardgame;
    private int gamemode;
    private String winner;
    private int Xscore = 0;
    private int Oscore = 0;
    private ArrayList<String> num_list = new ArrayList<String>(gamedimensions*gamedimensions);
    //private String winstatus;
    Piece piece; 

    Board(int a){
        boardgame = new ArrayList<String>(a);
   }

    public void set_board(Piece piece){
         
        this.piece = piece;
        
    }

    public void set_gamedimensions(int a){
        this.gamedimensions = a;
    }

    public void set_gamedmode(int a){
        this.gamemode = a;
    }
    public int get_Xscore(){
        return Xscore;
    }
    public int get_Oscore(){
        return Oscore;
    }
    public void clear_list(){
        this.num_list.clear();
    }


    public void Initiation_displayBoard(){

        int b = gamedimensions*gamedimensions;

        for (int i = 0 ; i < b ; i++){
            boardgame.add(String.valueOf(i+1));
        }


        if(gamedimensions == 3){


            System.out.println("| - | - | - |");
            System.out.println("| " + boardgame.get(0) + " | " + boardgame.get(1) + " | " + boardgame.get(2) + " |");
            System.out.println("| - | - | - |");
            System.out.println("| " + boardgame.get(3) + " | " + boardgame.get(4) + " | " + boardgame.get(5) + " |");
            System.out.println("| - | - | - |");
            System.out.println("| " + boardgame.get(6) + " | " + boardgame.get(7) + " | " + boardgame.get(8) + " |");
            System.out.println("| - | - | - |");
        }

        else if(gamedimensions == 4){

            System.out.println("|   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(0) + "   |   " + boardgame.get(1) + "   |   " + boardgame.get(2) + "   |  " + boardgame.get(3) + "    |");
            System.out.println("|   -   |   -   |   -   |   -   |"); 
            System.out.println("|   " + boardgame.get(4) + "   |   " + boardgame.get(5) + "   |   " + boardgame.get(6) + "   |  " + boardgame.get(7) + "    |");
            System.out.println("|   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(8) + "   |   " + boardgame.get(9) + "  |  " + boardgame.get(10) + "   |  " + boardgame.get(11) + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(12) + "  |   " + boardgame.get(13) + "  |  " + boardgame.get(14) + "   |  " + boardgame.get(15) + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |");

        }

        else if (gamedimensions == 5){

            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(0) + "   |   " + boardgame.get(1)  + "   |  " + boardgame.get(2)  + "    |  " + boardgame.get(3)  + "    |  " + boardgame.get(4)  + "    |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(5) + "   |   " + boardgame.get(6)  + "   |  " + boardgame.get(7)  + "    |  " + boardgame.get(8)  + "    |  " + boardgame.get(9)  + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(10) + "  |   " + boardgame.get(11)  + "  |  " + boardgame.get(12)  + "   |  " + boardgame.get(13)  + "   |  " + boardgame.get(14)  + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(15) + "  |   " + boardgame.get(16)  + "  |  " + boardgame.get(17)  + "   |  " + boardgame.get(18)  + "   |  " + boardgame.get(19)  + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(20) + "  |   " + boardgame.get(21)  + "  |  " + boardgame.get(22)  + "   |  " + boardgame.get(23)  + "   |  " + boardgame.get(24)  + "   |");
            
        }
        

    }

    public void displayBoard(){

        if(gamedimensions == 3){


            System.out.println("| - | - | - |");
            System.out.println("| " + boardgame.get(0) + " | " + boardgame.get(1) + " | " + boardgame.get(2) + " |");
            System.out.println("| - | - | - |");
            System.out.println("| " + boardgame.get(3) + " | " + boardgame.get(4) + " | " + boardgame.get(5) + " |");
            System.out.println("| - | - | - |");
            System.out.println("| " + boardgame.get(6) + " | " + boardgame.get(7) + " | " + boardgame.get(8) + " |");
            System.out.println("| - | - | - |");
        }

        else if(gamedimensions == 4){


            System.out.println("|   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(0) + "   |   " + boardgame.get(1) + "   |   " + boardgame.get(2) + "   |  " + boardgame.get(3) + "    |");
            System.out.println("|   -   |   -   |   -   |   -   |"); 
            System.out.println("|   " + boardgame.get(4) + "   |   " + boardgame.get(5) + "   |   " + boardgame.get(6) + "   |  " + boardgame.get(7) + "    |");
            System.out.println("|   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(8) + "   |   " + boardgame.get(9) + "  |  " + boardgame.get(10) + "   |  " + boardgame.get(11) + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(12) + "  |   " + boardgame.get(13) + "  |  " + boardgame.get(14) + "   |  " + boardgame.get(15) + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |");

        }

        else if(gamedimensions == 5){


            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(0) + "   |   " + boardgame.get(1)  + "   |  " + boardgame.get(2)  + "    |  " + boardgame.get(3)  + "    |  " + boardgame.get(4)  + "    |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(5) + "   |   " + boardgame.get(6)  + "   |  " + boardgame.get(7)  + "    |  " + boardgame.get(8)  + "    |  " + boardgame.get(9)  + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(10) + "  |   " + boardgame.get(11)  + "  |  " + boardgame.get(12)  + "   |  " + boardgame.get(13)  + "   |  " + boardgame.get(14)  + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(15) + "  |   " + boardgame.get(16)  + "  |  " + boardgame.get(17)  + "   |  " + boardgame.get(18)  + "   |  " + boardgame.get(19)  + "   |");
            System.out.println("|   -   |   -   |   -   |   -   |   -   |");
            System.out.println("|   " + boardgame.get(20) + "  |   " + boardgame.get(21)  + "  |  " + boardgame.get(22)  + "   |  " + boardgame.get(23)  + "   |  " + boardgame.get(24)  + "   |");
            
        }

    }

    public int makemove(String Turn, int position){

        int parameter = 0;

        if(boardgame.get(position - 1).equals(String.valueOf(position))){

            boardgame.set(position - 1, Turn);

            displayBoard();   
        }
        else{

            System.out.println("\nPosition selected");

            parameter = 1;
        }

          return parameter;              
    }

        

    

    public int isFull(){

        int parameter = 0;
        int b = gamedimensions * gamedimensions;
        int count = 0;

        if(num_list.isEmpty() == true){
            parameter = 0;
        }
        else{
            
            for( int i = 0 ; i < b ; i++ ){

                if(num_list.get(i) == "X" || num_list.get(i) == "O"){

                    count = count + 1;
                }
                else{
                    count = count + 0;
                }
            }

            if(count == b){
                parameter = 1;
            }
            else{
                parameter = 0;
            }
        }

        return parameter;

    }

    public int checkwinner(){

        int parameter = 0;


        switch (gamedimensions) {

            case 3:
                //player 1

                //mendatar
                if((boardgame.get(0) == "X") && (boardgame.get(1) == "X") && (boardgame.get(2) == "X")){//012

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(3) == "X") && (boardgame.get(4) == "X") && (boardgame.get(5) == "X")){//345

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(6) == "X") && (boardgame.get(7) == "X") && (boardgame.get(8) == "X")){//678

                    parameter = 1;
                    winner = "X";

                }

                //menurun

                else if((boardgame.get(0) == "X") && (boardgame.get(3) == "X") && (boardgame.get(6) == "X")){//036

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(1) == "X") && (boardgame.get(4) == "X") && (boardgame.get(7) == "X")){//147

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(2) == "X") && (boardgame.get(5) == "X") && (boardgame.get(8) == "X")){//258

                    parameter = 1;
                    winner = "X";

                }

                //diagonal

                else if((boardgame.get(0) == "X") && (boardgame.get(4) == "X") && (boardgame.get(8) == "X")){//048

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(2) == "X") && (boardgame.get(4) == "X") && (boardgame.get(6) == "X")){//246

                    parameter = 1;
                    winner = "X";

                }

                //player 2

                //mendatar
                else if((boardgame.get(0) == "O") && (boardgame.get(1) == "O") && (boardgame.get(2) == "O")){//012

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(3) == "O") && (boardgame.get(4) == "O") && (boardgame.get(5) == "O")){//345

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(6) == "O") && (boardgame.get(7) == "O") && (boardgame.get(8) == "O")){//678

                    parameter = 1;
                    winner = "O";

                }

                //menurun

                else if((boardgame.get(0) == "O") && (boardgame.get(3) == "O") && (boardgame.get(6) == "O")){//036

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(1) == "O") && (boardgame.get(4) == "O") && (boardgame.get(7) == "O")){//147

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(2) == "O") && (boardgame.get(5) == "O") && (boardgame.get(8) == "O")){//258

                    parameter = 1;
                    winner = "O";

                }

                //diagonal

                else if((boardgame.get(0) == "O") && (boardgame.get(4) == "O") && (boardgame.get(8) == "O")){//048

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(2) == "O") && (boardgame.get(4) == "O") && (boardgame.get(6) == "O")){//246

                    parameter = 1;
                    winner = "O";

                }
                else{
                    parameter = 0;
                }
                
                break;

            case 4:

            //player 1
                
                //mendatar
                if((boardgame.get(0) == "X") && (boardgame.get(1) == "X") && (boardgame.get(2) == "X")){//012

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(1) == "X") && (boardgame.get(2) == "X") && (boardgame.get(3) == "X")){//123

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(4) == "X") && (boardgame.get(5) == "X") && (boardgame.get(6) == "X")){//456

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(5) == "X") && (boardgame.get(6) == "X") && (boardgame.get(7) == "X")){//567

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(8) == "X") && (boardgame.get(9) == "X") && (boardgame.get(10) == "X")){//8910

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(9) == "X") && (boardgame.get(10) == "X") && (boardgame.get(11) == "X")){//91011

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(12) == "X") && (boardgame.get(13) == "X") && (boardgame.get(14) == "X")){//121314

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(13) == "X") && (boardgame.get(14) == "X") && (boardgame.get(15) == "X")){//131415

                    parameter = 1;
                    winner = "X";

                }

                //menurun

                else if((boardgame.get(0) == "X") && (boardgame.get(4) == "X") && (boardgame.get(8) == "X")){//048

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(4) == "X") && (boardgame.get(8) == "X") && (boardgame.get(12) == "X")){//4812

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(1) == "X") && (boardgame.get(5) == "X") && (boardgame.get(9) == "X")){//159

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(5) == "X") && (boardgame.get(9) == "X") && (boardgame.get(13) == "X")){//5913

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(2) == "X") && (boardgame.get(6) == "X") && (boardgame.get(10) == "X")){//2610

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(6) == "X") && (boardgame.get(10) == "X") && (boardgame.get(14) == "X")){//61014

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(3) == "X") && (boardgame.get(7) == "X") && (boardgame.get(11) == "X")){//3711

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(7) == "X") && (boardgame.get(11) == "X") && (boardgame.get(15) == "X")){//71115

                    parameter = 1;
                    winner = "X";

                }

                //diagonal

                else if((boardgame.get(0) == "X") && (boardgame.get(5) == "X") && (boardgame.get(10) == "X")){//0510

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(5) == "X") && (boardgame.get(10) == "X") && (boardgame.get(15) == "X")){//51015

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(3) == "X") && (boardgame.get(6) == "X") && (boardgame.get(9) == "X")){//369

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(6) == "X") && (boardgame.get(9) == "X") && (boardgame.get(12) == "X")){//6912

                    parameter = 1;
                    winner = "X";

                }

            //player 2

                //mendatar

                else if((boardgame.get(0) == "O") && (boardgame.get(1) == "O") && (boardgame.get(2) == "O")){//012

                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(1) == "O") && (boardgame.get(2) == "O") && (boardgame.get(3) == "O")){//123
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(4) == "O") && (boardgame.get(5) == "O") && (boardgame.get(6) == "O")){//456
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(5) == "O") && (boardgame.get(6) == "O") && (boardgame.get(7) == "O")){//567
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(8) == "O") && (boardgame.get(9) == "O") && (boardgame.get(10) == "O")){//8910
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(9) == "O") && (boardgame.get(10) == "O") && (boardgame.get(11) == "O")){//91011
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(12) == "O") && (boardgame.get(13) == "O") && (boardgame.get(14) == "O")){//121314
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(13) == "O") && (boardgame.get(14) == "O") && (boardgame.get(15) == "O")){//131415
            
                    parameter = 1;
                    winner = "O";
            
                }
            
                //menurun
            
                else if((boardgame.get(0) == "O") && (boardgame.get(4) == "O") && (boardgame.get(8) == "O")){//048
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(4) == "O") && (boardgame.get(8) == "O") && (boardgame.get(12) == "O")){//4812
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(1) == "O") && (boardgame.get(5) == "O") && (boardgame.get(9) == "O")){//159
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(5) == "O") && (boardgame.get(9) == "O") && (boardgame.get(13) == "O")){//5913
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(2) == "O") && (boardgame.get(6) == "O") && (boardgame.get(10) == "O")){//2610
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(6) == "O") && (boardgame.get(10) == "O") && (boardgame.get(14) == "O")){//61014
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(3) == "O") && (boardgame.get(7) == "O") && (boardgame.get(11) == "O")){//3711
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(7) == "O") && (boardgame.get(11) == "O") && (boardgame.get(15) == "O")){//71115
            
                    parameter = 1;
                    winner = "O";
            
                }
            
                //diagonal
            
                else if((boardgame.get(0) == "O") && (boardgame.get(5) == "O") && (boardgame.get(10) == "O")){//0510
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(5) == "O") && (boardgame.get(10) == "O") && (boardgame.get(15) == "O")){//51015
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(3) == "O") && (boardgame.get(6) == "O") && (boardgame.get(9) == "O")){//369
            
                    parameter = 1;
                    winner = "O";
            
                }
                else if((boardgame.get(6) == "O") && (boardgame.get(9) == "O") && (boardgame.get(12) == "O")){//6912
            
                    parameter = 1;
                    winner = "O";
            
                }
                else{
                    parameter = 0;
                }

                break;

            case 5:

                //player 1

                //mendatar
                if((boardgame.get(0) == "X") && (boardgame.get(1) == "X") && (boardgame.get(2) == "X") && (boardgame.get(3) == "X")){//[0],[1],[2],[3]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(1) == "X") && (boardgame.get(2) == "X") && (boardgame.get(3) == "X") && (boardgame.get(4) == "X")){//[1],[2],[3],[4]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(5) == "X") && (boardgame.get(6) == "X") && (boardgame.get(7) == "X") && (boardgame.get(8) == "X")){//[5],[6],[7],[8]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(6) == "X") && (boardgame.get(7) == "X") && (boardgame.get(8) == "X") && (boardgame.get(9) == "X")){//[6],[7],[8],[9]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(10) == "X") && (boardgame.get(11) == "X") && (boardgame.get(12) == "X") && (boardgame.get(13) == "X")){//[10],[11],[12],[13]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(11) == "X") && (boardgame.get(12) == "X") && (boardgame.get(13) == "X") && (boardgame.get(14) == "X")){//[11],[12],[13],[14]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(15) == "X") && (boardgame.get(16) == "X") && (boardgame.get(17) == "X") && (boardgame.get(18) == "X")){//[15],[16,[17],[18]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(16) == "X") && (boardgame.get(17) == "X") && (boardgame.get(18) == "X") && (boardgame.get(19) == "X")){//[16],[17],[18],[19]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(20) == "X") && (boardgame.get(21) == "X") && (boardgame.get(22) == "X") && (boardgame.get(23) == "X")){//[20],[21],[22],[23]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(21) == "X") && (boardgame.get(22) == "X") && (boardgame.get(23) == "X") && (boardgame.get(24) == "X")){//[21],[22],[23],[24]

                    parameter = 1;
                    winner = "X";

                }

                //menurun

                else if((boardgame.get(0) == "X") && (boardgame.get(5) == "X") && (boardgame.get(10) == "X") && (boardgame.get(15) == "X")){//[0],[5],[10],[15]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(5) == "X") && (boardgame.get(10) == "X") && (boardgame.get(15) == "X") && (boardgame.get(20) == "X")){//[5],[10],[15],[20]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(1) == "X") && (boardgame.get(6) == "X") && (boardgame.get(11) == "X") && (boardgame.get(16) == "X")){//[1],[6],[11],[16]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(6) == "X") && (boardgame.get(11) == "X") && (boardgame.get(16) == "X") && (boardgame.get(21) == "X")){//[6],[11],[16],[21]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(2) == "X") && (boardgame.get(7) == "X") && (boardgame.get(12) == "X") && (boardgame.get(17) == "X")){//[2],[7],[12],[17]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(7) == "X") && (boardgame.get(12) == "X") && (boardgame.get(17) == "X") && (boardgame.get(22) == "X")){//[7],[12],[17],[22]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(3) == "X") && (boardgame.get(8) == "X") && (boardgame.get(13) == "X") && (boardgame.get(18) == "X")){//[3],[8],[13],[18]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(8) == "X") && (boardgame.get(13) == "X") && (boardgame.get(18) == "X") && (boardgame.get(23) == "X")){//[8],[13],[18],[23]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(4) == "X") && (boardgame.get(9) == "X") && (boardgame.get(14) == "X") && (boardgame.get(19) == "X")){//[4],[9],[14],[19]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(9) == "X") && (boardgame.get(14) == "X") && (boardgame.get(19) == "X") && (boardgame.get(24) == "X")){//[9],[14],[19],[24]

                    parameter = 1;
                    winner = "X";

                }

                //diagonal

                else if((boardgame.get(0) == "X") && (boardgame.get(6) == "X") && (boardgame.get(12) == "X") && (boardgame.get(18) == "X")){//[0],[6],[12],[18]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(6) == "X") && (boardgame.get(12) == "X") && (boardgame.get(18) == "X") && (boardgame.get(24) == "X")){//[6],[12],[18],[24]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(4) == "X") && (boardgame.get(8) == "X") && (boardgame.get(12) == "X") && (boardgame.get(16) == "X")){//[4],[8],[12],[16]

                    parameter = 1;
                    winner = "X";

                }
                else if((boardgame.get(8) == "X") && (boardgame.get(12) == "X") && (boardgame.get(16) == "X") && (boardgame.get(20) == "X")){//[8],[12],[16],[20]

                    parameter = 1;
                    winner = "X";

                }

                //player 2

                //mendatar
                else if((boardgame.get(0) == "O") && (boardgame.get(1) == "O") && (boardgame.get(2) == "O") && (boardgame.get(3) == "O")){//[0],[1],[2],[3]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(1) == "O") && (boardgame.get(2) == "O") && (boardgame.get(3) == "O") && (boardgame.get(4) == "O")){//[1],[2],[3],[4]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(5) == "O") && (boardgame.get(6) == "O") && (boardgame.get(7) == "O") && (boardgame.get(8) == "O")){//[5],[6],[7],[8]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(6) == "O") && (boardgame.get(7) == "O") && (boardgame.get(8) == "O") && (boardgame.get(9) == "O")){//[6],[7],[8],[9]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(10) == "O") && (boardgame.get(11) == "O") && (boardgame.get(12) == "O") && (boardgame.get(13) == "O")){//[10],[11],[12],[13]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(11) == "O") && (boardgame.get(12) == "O") && (boardgame.get(13) == "O") && (boardgame.get(14) == "O")){//[11],[12],[13],[14]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(15) == "O") && (boardgame.get(16) == "O") && (boardgame.get(17) == "O") && (boardgame.get(18) == "O")){//[15],[16,[17],[18]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(16) == "O") && (boardgame.get(17) == "O") && (boardgame.get(18) == "O") && (boardgame.get(19) == "O")){//[16],[17],[18],[19]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(20) == "O") && (boardgame.get(21) == "O") && (boardgame.get(22) == "O") && (boardgame.get(23) == "O")){//[20],[21],[22],[23]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(21) == "O") && (boardgame.get(22) == "O") && (boardgame.get(23) == "O") && (boardgame.get(24) == "O")){//[21],[22],[23],[24]

                    parameter = 1;
                    winner = "O";

                }

                //menurun

                else if((boardgame.get(0) == "O") && (boardgame.get(5) == "O") && (boardgame.get(10) == "O") && (boardgame.get(15) == "O")){//[0],[5],[10],[15]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(5) == "O") && (boardgame.get(10) == "O") && (boardgame.get(15) == "O") && (boardgame.get(20) == "O")){//[5],[10],[15],[20]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(1) == "O") && (boardgame.get(6) == "O") && (boardgame.get(11) == "O") && (boardgame.get(16) == "O")){//[1],[6],[11],[16]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(6) == "O") && (boardgame.get(11) == "O") && (boardgame.get(16) == "O") && (boardgame.get(21) == "O")){//[6],[11],[16],[21]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(2) == "O") && (boardgame.get(7) == "O") && (boardgame.get(12) == "O") && (boardgame.get(17) == "O")){//[2],[7],[12],[17]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(7) == "O") && (boardgame.get(12) == "O") && (boardgame.get(17) == "O") && (boardgame.get(22) == "O")){//[7],[12],[17],[22]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(3) == "O") && (boardgame.get(8) == "O") && (boardgame.get(13) == "O") && (boardgame.get(18) == "O")){//[3],[8],[13],[18]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(8) == "O") && (boardgame.get(13) == "O") && (boardgame.get(18) == "O") && (boardgame.get(23) == "O")){//[8],[13],[18],[23]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(4) == "O") && (boardgame.get(9) == "O") && (boardgame.get(14) == "O") && (boardgame.get(19) == "O")){//[4],[9],[14],[19]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(9) == "O") && (boardgame.get(14) == "O") && (boardgame.get(19) == "O") && (boardgame.get(24) == "O")){//[9],[14],[19],[24]

                    parameter = 1;
                    winner = "O";

                }

                //diagonal

                else if((boardgame.get(0) == "O") && (boardgame.get(6) == "O") && (boardgame.get(12) == "O") && (boardgame.get(18) == "O")){//[0],[6],[12],[18]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(6) == "O") && (boardgame.get(12) == "O") && (boardgame.get(18) == "O") && (boardgame.get(24) == "O")){//[6],[12],[18],[24]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(4) == "O") && (boardgame.get(8) == "O") && (boardgame.get(12) == "O") && (boardgame.get(16) == "O")){//[4],[8],[12],[16]

                    parameter = 1;
                    winner = "O";

                }
                else if((boardgame.get(8) == "O") && (boardgame.get(12) == "O") && (boardgame.get(16) == "O") && (boardgame.get(20) == "O")){//[8],[12],[16],[20]

                    parameter = 1;
                    winner = "O";

                }
                else{
                    parameter = 0;
                }
                break;    
        
            default:
                break;
        }

        return parameter;
    }


    public void clearBoard(int a){
        int b = a*a;

        for (int i = 0 ; i < b ; i++){
            boardgame.set(i, String.valueOf(i+1));
        }

    }

    public void score(String turn){

        if(turn == "X"){
            Xscore ++;
        }
        else if(turn == "O"){
            Oscore ++;
        }

    }
    public void viewXscore() {
        System.out.println(Xscore);
        
    }
    
    public void viewOscore() {
        System.out.println(Oscore);
          
    }
    



    
}
