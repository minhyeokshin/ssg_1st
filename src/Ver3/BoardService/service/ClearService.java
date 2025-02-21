package Ver3.BoardService.service;

import Ver3.BoardService.View.View;
import Ver3.BoardService.service.dao.BoardDao;
import lombok.Data;


import java.util.InputMismatchException;
import java.util.Scanner;

@Data
public class ClearService{
    BoardDao boardDao;
    View view;
    Scanner in = new Scanner(System.in);

    public ClearService(BoardDao boardDao,View view) {
        this.boardDao = boardDao;
        this.view = view;
    }

    // 게시판 내용 초기화
    public void clear() {
        int choice = 0;
        view.clearshow();
        try {
            choice = in.nextInt();
            in.nextLine();
        } catch (InputMismatchException e) {
            view.numinputshow();
            in.nextLine();
        }

        switch (choice){
            case 1: //게시판 전체삭제
                view.clearall();
                break;
            case 2: //게시판 전체삭제 취소
                break;
            default:
                view.numinputshow();
                break;
        }
    }
}
