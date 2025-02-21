package BoardService.Service;

import BoardService.Controller.BoardController;
import BoardService.DTO.Board;

import java.util.Scanner;

public class ClearService {
    private BoardController boardController;
    private Scanner in;

    public ClearService() { // 생성자 추가
        this.in = new Scanner(System.in);
    }

    // 게시판 내용 초기화
    public void clear() {
        int choice = 0;
        System.out.println("게시물 전체 삭제");
        System.out.println("-----------------------------");
        System.out.println("보조 메뉴 : 1. Ok(전체삭제) | 2. Cancel(취소)");
        System.out.printf("메뉴 선택 : ");
        choice = in.nextInt();
        in.nextLine();
        switch (choice){
            case 1: //게시판 전체삭제
                Board.boards.clear();
                System.out.println("모든 게시판이 삭제 되었습니다.");
                break;
            case 2: //게시판 전체삭제 취소
                break;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                break;
        }
    }
}
