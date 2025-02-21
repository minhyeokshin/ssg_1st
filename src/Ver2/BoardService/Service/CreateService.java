package Ver2.BoardService.Service;

import Ver2.BoardService.BoardController.BoardController;
import Ver2.BoardService.DTO.Board;
import Ver2.BoardService.BoardDAO.BoardDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static Ver2.BoardService.DTO.Board.*;


public class CreateService implements Create {
//    private Scanner in;
    private BoardController boardController;

    public CreateService() { // 생성자 추가
        BoardController.input = new Scanner(System.in);
    }

    //게시판 글 추가
    @Override
    public void create() {

        int choice = 0;

        Board board = new Board();
        board.setBno(BoardDao.getBoards().size()+1);
        System.out.printf("제목 입력 : ");
        board.setBtitle(BoardController.input.nextLine());
        System.out.printf("작가 입력 : ");
        board.setBwriter(BoardController.input.nextLine());
        System.out.printf("내용 입력 : ");
        board.setBcontent(BoardController.input.nextLine());
        System.out.println("날짜 입력 양식 : yyyyMMdd");
        System.out.printf("날짜 입력 : ");
        String input = BoardController.input.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        try {
            Date parsedDate = formatter.parse(input);
            board.setBdate(parsedDate);
        } catch (ParseException e) {
            System.out.printf("날짜 형식이 맞지 않습니다.%n메인메뉴로 돌아갑니다%n");
            }

                // 날짜 잘못입력하면 저장안하고, 메인메뉴 반환
                if (board.getBdate() == null){
                    choice = 2;
                } else {
                    System.out.println("보조 메뉴 : 1. OK(저장) 2. Cancel(저장취소)");
                    System.out.printf("메뉴 선택 : ");
                    choice = Integer.parseInt(BoardController.input.nextLine());
                }

        switch (choice){
            case 1: // 게시판 글추가
                BoardDao.getBoards().add(board);
                break;
            case 2: // 게시판 글추가 취소
                break;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                break;
        }

        }
    }

