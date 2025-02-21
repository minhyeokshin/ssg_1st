package Ver2.BoardService.service;

import Ver2.BoardService.service.dao.BoardDao;
import Ver2.BoardService.dto.Board;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

@Data
public class OutPutService{
    Scanner in = new Scanner(System.in);

    private CreateService createService;
    private ReadService readService;
    private ClearService clearService;
    private List<Board> boards;

    public OutPutService() {
        this.createService = new CreateService();
        this.readService = new ReadService();
        this.clearService = new ClearService();
    }

    // 메인메뉴 선택 메서드
    public void mainMenu()  {
        System.out.println("메인 메뉴 : 1.Create 2.Read 3.Clear 4.Exit");
        System.out.printf("메뉴 선택 : ");
        int num = in.nextInt();
        switch (num) {
            case 1 -> createService.create();
            case 2 -> readService.read();
            case 3 -> clearService.clear();
            case 4 -> {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            default -> System.out.println("올바른 숫자를 입력하세요.");
        }
    }

    // 기본 출력 bno 기준 역순 출력
    public void list(){

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-5s %-15s %-15s %-20s%n","no","writer","date","title");
            System.out.println("-----------------------------------------------------");

            for (int i = BoardDao.getBoards().size()-1; i >= 0 ; i--) {
                Board board = BoardDao.getBoards().get(i);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
                System.out.printf("%-5s %-15s %-15s %-20s%n", board.getBno(), board.getBwriter(), formatter.format(board.getBdate()),board.getBtitle());
            }


            System.out.println("-----------------------------------------------------");
            mainMenu();
        }
    }

}
