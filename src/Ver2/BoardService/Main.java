package Ver2.BoardService;

import Ver2.BoardService.BoardController.BoardController;
import Ver2.BoardService.Service.*;

import java.util.Scanner;

import static Ver2.BoardService.BoardController.BoardController.input;


public class Main {

    public static void main(String[] args) {
       BoardController board = new BoardController(
               new CreateService(),
               new ReadService(),
               new ClearService(),
               new OutPutService(),
               input
       );

        board.mainMenu();
    }
}