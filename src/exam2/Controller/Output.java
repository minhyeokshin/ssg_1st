package exam2.Controller;

import exam2.DTO.Board;
import exam2.Service.*;

import java.util.Scanner;

public class Output {

    private CreateService createService;
    private ReadService readService;
    private ClearService clearService;
    private Scanner in = new Scanner(System.in);

    public Output() {
        this.in = new Scanner(System.in);
        this.createService = new CreateService();
        this.readService = new ReadService();
        this.clearService = new ClearService();
    }


    public void clear(){
        ClearService.clear();
    }
    public void create(){
        CreateService.create();
    }
    public void read(){
        ReadService.read();
    }

    public void mainMenu(){
        int num = 0;
        System.out.println("메인 메뉴 : 1.Create 2.Read 3.Clear 4.Exit");
        System.out.printf("메뉴 선택 : ");
        num = in.nextInt();
        switch (num){
            case 1:
                create();
                break;
            case 2:
                read();
                break;
            case 3:
                clear();
                break;
            case 4:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
        }
    }

    public void list(){

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("no\twriter\tdate\t\t\ttitle");
            for (Board board : Board.boards) {
                System.out.printf("%s\t%s\t%s\t\t\t%s%n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
            }
            System.out.println("-----------------------------------");
            mainMenu();
        }
    }
}
