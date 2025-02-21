package BoardService.Service;

import BoardService.Controller.BoardController;
import BoardService.DTO.Board;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formattable;
import java.util.Scanner;


public class CreateService {
    private Scanner in;
    private BoardController boardController;

    public CreateService() { // 생성자 추가
        this.in = new Scanner(System.in);
    }

    //게시판 글 추가
    public void create() {

        int choice = 0;

        Board board = new Board();
        board.setBno(Board.boards.size()+1);
        System.out.printf("제목 입력 : ");
        board.setBtitle(in.nextLine());
        System.out.printf("작가 입력 : ");
        board.setBwriter(in.nextLine());
        System.out.printf("내용 입력 : ");
        board.setBcontent(in.nextLine());
        System.out.println("날짜 입력 양식 : yyyyMMdd");
        System.out.printf("날짜 입력 : ");
        String input = in.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        try {
            Date parsedDate = formatter.parse(input);
            board.setBdate(parsedDate);
        } catch (ParseException e) {
            System.out.println("날짜 형식이 맞지 않습니다.");
        }

        System.out.println("보조 메뉴 : 1. OK 2. Cancel");
        System.out.printf("메뉴 선택 : ");
        choice = in.nextInt();
        in.nextLine();
        switch (choice){
            case 1: // 게시판 글추가
                Board.boards.add(board);
                break;
            case 2: // 게시판 글추가 취소
                break;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                break;
        }

        }
    }

