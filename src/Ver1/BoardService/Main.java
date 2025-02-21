package Ver1.BoardService;

import Ver1.BoardService.Controller.BoardController;

public class Main {

    public static void main(String[] args) {
       BoardController board = new BoardController();
        board.list();
    }
}