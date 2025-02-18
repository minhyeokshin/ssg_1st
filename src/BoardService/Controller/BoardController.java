package BoardService.Controller;

import BoardService.DTO.Board;
import BoardService.Service.*;

import java.util.List;
import java.util.Scanner;

public class BoardController {

    private CreateService createService;
    private ReadService readService;
    private ClearService clearService;
    public Scanner in = new Scanner(System.in);
    private List<Board> boards;

    public BoardController() {
        this.in = new Scanner(System.in);
        this.createService = new CreateService();
        this.readService = new ReadService();
        this.clearService = new ClearService();
    }


//    public void clear(){
//        clearService.clear();
//    }
//    public void create(){
//        createService.create();
//    }
//    public void read(){
//        readService.read();
//    }

    public void mainMenu(){
        int num = 0;
        System.out.println("메인 메뉴 : 1.Create 2.Read 3.Clear 4.Exit");
        System.out.printf("메뉴 선택 : ");
        num = in.nextInt();
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

    public void list(){

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-5s %-15s %-15s %-20s%n","no","writer","date","title");
            System.out.println("-----------------------------------------------------");
            for (Board board : Board.boards) {
                System.out.printf("%-5s %-15s %-15s %-20s%n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
            }
            System.out.println("-----------------------------------------------------");
            mainMenu();
        }
    }
}
