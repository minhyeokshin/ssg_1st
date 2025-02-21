package Ver2.BoardService.service;

import Ver2.BoardService.service.dao.BoardDao;
import Ver2.BoardService.dto.Board;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@Data
public class OutPutService{

    Scanner in = new Scanner(System.in);

    CreateService createService;
    ReadService readService;
    ClearService clearService;
    List<Board> boards;
    BoardDao boardDao;

    public OutPutService(BoardDao boardDao) {
        this.createService = new CreateService(boardDao);
        this.readService = new ReadService(boardDao);
        this.clearService = new ClearService(boardDao);
        this.boardDao = boardDao;
    }

    // 메인메뉴 선택 메서드
    public void mainMenu()  {
        int num = 0;
        System.out.println("메인 메뉴 : 1.Create 2.Read 3.Clear 4.Exit");
        System.out.printf("메뉴 선택 : ");

        try {
            num = in.nextInt();
            in.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요.");
            in.nextLine();
        }

        switch (num){
            case 1:
                createService.create();
                break;
            case 2:
                readService.read();
                break;
            case 3:
                clearService.clear();
                break;
            case 4:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
        }
    }

    // 기본 출력 bno 기준 역순 출력
    public void list(){

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-5s %-15s %-15s %-20s%n","no","writer","date","title");
            System.out.println("-----------------------------------------------------");

            for (int i = boardDao.getBoards().size()-1; i >= 0 ; i--) {
                Board board = boardDao.getBoards().get(i);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
                System.out.printf("%-5s %-15s %-15s %-20s%n", board.getBno(), board.getBwriter(), formatter.format(board.getBdate()),board.getBtitle());
            }


            System.out.println("-----------------------------------------------------");
            mainMenu();
        }
    }
}
