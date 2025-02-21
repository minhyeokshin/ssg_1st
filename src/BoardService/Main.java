package BoardService;

import BoardService.Controller.BoardController;

public class Main {

    public static void main(String[] args) {
       BoardController board = new BoardController();
        board.list();
    }
}