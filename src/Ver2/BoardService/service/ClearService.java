package Ver2.BoardService.service;

import Ver2.BoardService.controller.BoardControllerB;
import Ver2.BoardService.service.dao.BoardDao;
import lombok.Data;

import java.util.Scanner;

@Data
public class ClearService{
    Scanner in = new Scanner(System.in);

    private BoardControllerB boardController;

    public ClearService() {}// 생성자 추가

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
                BoardDao.getBoards().clear();
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
