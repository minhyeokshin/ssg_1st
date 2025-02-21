package Ver3.BoardService.View;

import Ver3.BoardService.service.ClearService;
import Ver3.BoardService.service.dao.BoardDao;

import java.util.Scanner;

public class viewDemo implements View {
    BoardDao boardDao;
    ClearService clearService;
    Scanner in = new Scanner(System.in);
    @Override
    public void clearshow() {
        System.out.println("게시물 전체 삭제");
        System.out.println("-----------------------------");
        System.out.println("보조 메뉴 : 1. Ok(전체삭제) | 2. Cancel(취소)");
        System.out.printf("메뉴 선택 : ");
        int choice = in.nextInt();
        in.nextLine();
        clearService.clear();
    }

    @Override
    public void numinputshow() {
        System.out.println("숫자를 입력하세요.");
    }

    @Override
    public void clearall() {
        boardDao.getBoards().clear();
        System.out.println("모든 게시판이 삭제되었습니다.");
    }


}
