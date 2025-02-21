package Ver2.BoardService.service.dao;

import Ver2.BoardService.dto.Board;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BoardDao {
    private static final BoardDao instance = new BoardDao();
    private final List<Board> boards = new ArrayList<>();
    private BoardDao() {}
    public static BoardDao getInstance() {
        return instance;
    }

    public  List<Board> getBoards() {
        return boards;
    }
}
