package exam2.Service;

import exam2.DTO.Board;
import java.util.Scanner;


public class CreateService {

    static Scanner in = new Scanner(System.in);
    public static void create() {



        int choice = 0;

        Board board = new Board();
        board.setBno(Board.boards.size()+1);
        System.out.printf("제목 입력 : ");
        board.setBtitle(in.nextLine());
        System.out.printf("작가 입력 : ");
        board.setBwriter(in.nextLine());
        System.out.printf("내용 입력 : ");
        board.setBcontent(in.nextLine());
        System.out.printf("날짜 입력 : ");
        board.setBdate(in.nextLine());

        System.out.println("보조 메뉴 : 1. OK 2. Cancel");
        System.out.printf("메뉴 선택 : ");
        choice = in.nextInt();
        in.nextLine();
        switch (choice){
            case 1:
                Board.boards.add(board);
                break;
            case 2:
                break;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                break;
        }

        }
    }

