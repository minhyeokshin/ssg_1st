package Ver2.BoardService.BoardController;



import Ver2.BoardService.Service.*;


import java.util.Scanner;
public class BoardController {

//    private final OutPutService outputservice = new OutPutService();
    public static Scanner input = new Scanner(System.in);
    private final Create createService;
    private final Read readService;
    private final Clear clearService;
    private final Output outPutService;

    public BoardController(Create createService, Read readService, Clear clearService, Output outPutService, Scanner scanner) {
        this.createService = createService;
        this.readService = readService;
        this.clearService = clearService;
        this.outPutService = outPutService;
        input = scanner;
    }

    public void mainMenu() {
        while (true) {
            outPutService.list();
            System.out.println("메인 메뉴: 1.Create 2.Read 3.Clear 4.Exit");
            System.out.print("메뉴 선택: ");
            int choice = input.nextInt();
            input.nextLine(); // 개행 문자 처리

            switch (choice) {
                case 1 -> createService.create();  // 게시글 생성
                case 2 -> readService.read();  // 게시글 목록 출력
                case 3 -> clearService.clear();  // 게시글 전체 삭제
                case 4 -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("올바른 숫자를 입력하세요.");
            }
        }
    }



}
