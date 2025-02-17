package exam2.Service;

import exam2.DTO.Board;

import java.util.Scanner;

public class ClearService {
    static Scanner in = new Scanner(System.in);
    public static void clear() {
        int choice = 0;
        System.out.println("게시물 전체 삭제");
        System.out.println("-----------------------------");
        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.printf("메뉴 선택 : ");
        choice = in.nextInt();
        in.nextLine();
        switch (choice){
            case 1:
                Board.boards.clear();
                System.out.println("모든 게시판이 삭제 되었습니다.");
                break;
            case 2:
                break;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                break;
        }
    }
}
