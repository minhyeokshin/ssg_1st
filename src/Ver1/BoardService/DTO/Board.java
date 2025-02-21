package Ver1.BoardService.DTO;


import lombok.Data;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;

    public static List<Board> boards = new ArrayList<>();


}
