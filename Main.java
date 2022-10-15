import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        int parameter = 0;
        int gamedimension=0; int choose_board = 0;
        int min = 1;
        int num_of_player;
        String Turn = "X";
        String winner = null;
        int correct = 1;
        int pos = 0;
        int play;
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        
        Random randnum = new Random();
        

        Board board = new Board(gamedimension);


        Scanner inputs = new Scanner(System.in);

        while(parameter == 0){

            winner = null;

            System.out.println("\n\n=========== Welcome to ANGER ISSUES TIC TAC TOE Game ========");
            System.out.println("\nRules: ");
            System.out.println("\n1. Each Player only have 1 chance each turn, so if you are input the wrong/choosen position, your turn will be skipped and you have nothing to put :P\n");
            System.out.println("2. Player who make line first will be the winner\n");

            play = player1.startgame(); //pake method di class player 1 untuk start game dan end game 

            if(play == 1){

                parameter = 0; 
                //System.out.println("\n\nPlease choose your game mode: ");
                //System.out.println("\n1. Solo (vs Computer)    2. 2 Player\n");

                num_of_player = player1.selectgamemode(); //pake method di class player 1 untuk milih jumlah pemain

                if(num_of_player == 1){//kalau cuman 1 maka nama player 2 bakal jadi bot
                    player1.createname();
                    player2.botname();
                }
                else{//kalau 2 orang maka akan masukin 1 1 namanya
                    player1.createname();
                    player2.createname();

                }
               
                System.out.println("\n");

            System.out.println("\n\n||||| ANGER ISSUES TIC TAC TOE LIST PLAYER |||||"); //print list player
            System.out.println("\nPLAYER 1: " + player1.get_name() + "    |   PLAYER 2: " + player2.get_name());
            
            
            choose_board = player1.selectboard();//pake method di class player 1 untuk milih ukuran papan

            if(choose_board == 1){//kalo pilih 1 maka ukutan boardnya 3x3
                gamedimension = 3;
            }
            else if(choose_board == 2){//kalo pilih 2 maka ukutan boardnya 4x4
                gamedimension = 4;
            }
            else{//kalo pilih 3 maka ukutan boardnya 5x5
                gamedimension = 5;
            }
            
            board.set_gamedimensions(gamedimension);//set ukuran board

            int max = gamedimension * gamedimension;//jumlah max petak
            int bot_input = randnum.nextInt(max) + 1;
            board.Initiation_displayBoard();//tampilan board awal

            while (winner == null){
                

                switch (num_of_player) { //switch dari jumlah player

                    case 1://MODE VS BOT

                    while(correct == 1){

                        if(Turn.equals("X")){
                            try{
                            System.out.println(player1.get_name() + "(" + Turn + ")"+ " Turn: ");
                            pos = inputs.nextInt();
                            if(!(pos <= max && pos >= min)){
                                System.out.println("Input invalid, enter another position\n");
                                continue;
                            }

                            }
                            catch (InputMismatchException e){
                            System.out.println("Input invalid, enter another position\n");
                            continue;
                            }
                        }
                        else{

                            try{
                                System.out.println(player2.get_name() + "(" + Turn + ")"+ " Turn: ");
                                bot_input = randnum.nextInt(max) + 1;
                                pos = bot_input;
                                if(!(pos <= max && pos >= min)){
                                    System.out.println("");
                                    continue;
                                }
    
                                }
                                catch (InputMismatchException e){
                                System.out.println("");
                                continue;
                                }

                                System.out.println(bot_input);

                        }
                        
                        board.makemove(Turn, pos);

                        if(board.makemove(Turn, pos) == 1){
                            correct = 1;
                            Turn = Turn;
                        }
                        else{
                            correct = 0;
                        }

                        break;
                    }


                        if(Turn.equals("X")){

                            Turn = "O";
                            
                        }
                        else{
                            Turn = "X";
                        }
                        

                        board.checkwinner();

                        if(board.checkwinner() == 1){
                            winner = Turn;

                            if(Turn.equals("X")){

                                Turn = "O";
                                System.out.println("\n OUR YASS QUEEN IS: \n" + player2.get_name());
                                board.score(Turn);
                                
                            }
                            else{
                                Turn = "X";
                                System.out.println("\n OUR YASS QUEEN IS: \n" + player1.get_name());
                                board.score(Turn);
                            }

                            

                            board.clearBoard(gamedimension);

                        }
                        else{
                            winner = null;
                        }

                        System.out.println("\n");

                        

                        break;
                    
                    case 2: //MODE PVP

                    while(correct == 1){

                        if(Turn.equals("X")){
                            try{
                            System.out.println(player1.get_name() + "(" + Turn + ")"+ " Turn: ");
                            pos = inputs.nextInt();
                            if(!(pos <= max && pos >= min)){
                                System.out.println("Input invalid, enter another position\n");
                                continue;
                            }

                            }
                            catch (InputMismatchException e){
                            System.out.println("Input invalid, enter another position\n");
                            continue;
                            }
                        }
                        else{

                            try{
                                System.out.println(player2.get_name() + "(" + Turn + ")"+ " Turn: ");
                                pos = inputs.nextInt();
                                if(!(pos <= max && pos >= min)){
                                    System.out.println("Input invalid, enter another position\n");
                                    continue;
                                }
    
                            }
                            catch (InputMismatchException e){
                                System.out.println("Input invalid, enter another position\n");
                                continue;
                            }


                        }
                        
                        board.makemove(Turn, pos);

                        if(board.makemove(Turn, pos) == 1){
                            correct = 1;
                            Turn = Turn;
                        }
                        else{
                            correct = 0;
                        }

                        break;
                    }


                        if(Turn.equals("X")){

                            Turn = "O";
                            
                        }
                        else{
                            Turn = "X";
                        }
                        

                        board.checkwinner();

                        if(board.checkwinner() == 1){
                            winner = Turn;

                            if(Turn.equals("X")){

                                Turn = "O";
                                System.out.println("\nOUR YASS QUEEN IS: \n" + player2.get_name());
                                board.score(Turn);
                                
                            }
                            else{
                                Turn = "X";
                                System.out.println("\nOUR YASS QUEEN IS: \n" + player1.get_name());
                                board.score(Turn);
                            }

                            

                            board.clearBoard(gamedimension);

                        }
                        else{
                            winner = null;
                        }

                        System.out.println("\n");

                         
                        break;


                
                    default:
                        break;
                }

            }

            }
            
            
            //check score
            else if(play == 2){
                
                System.out.println("\nScore:");
                System.out.println("\n" + player1.get_name() +":"); 
                board.viewXscore();
                System.out.println("\n" + player2.get_name() +":"); 
                board.viewOscore();
                
        
            }
            //check history

            else if(play == 3){
                try{
                    FileReader fr = new FileReader("history.txt");
                    BufferedReader br = new BufferedReader(fr);

                    String history;
                    if ((history = br.readLine()) == null){
                        System.out.println("no matches found");
                    }
                    while ((history = br.readLine()) != null){
                        System.out.println(history + "/n");
                    }
                    br.close();   
                } catch (IOException e){
                    System.out.println("ERROR!");
                }

            }
            //ketika player tidak mau main lagi
            else{
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                LocalDateTime now = LocalDateTime.now();
                try{
                    FileWriter FW = new FileWriter("history.txt",true);
                    BufferedWriter BW = new BufferedWriter(FW);

                    BW.write("\nHystory Match " + dtf.format(now) + "\n");
                    BW.write(player1.get_name() +":");
                    BW.write(board.get_Xscore() + "\n");
                    BW.write(player2.get_name() +":");
                    BW.write(board.get_Oscore() + "\n");
                    BW.newLine();
                    BW.close();
                } catch (IOException e){
                    System.out.println("ERROR!");
                }
                

                System.out.println("\n======= OK THANKS FOR USING THIS APP WITH ANGER ISSUES =======");
                parameter = 1;
            
                      
            }  

        }
        
    }

}
