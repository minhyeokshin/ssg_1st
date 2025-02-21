package Ver2.BoardService.service.dao;

import Ver2.BoardService.dto.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private static List<Board> boards = new ArrayList<>();

    public static List<Board> getBoards() {
        return boards;
    }

}
