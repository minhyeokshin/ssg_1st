package Ver2.BoardService.service;

import Ver2.BoardService.controller.BoardControllerB;
import Ver2.BoardService.dto.Board;
import Ver2.BoardService.service.dao.BoardDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;


public class CreateService {

    Scanner in = new Scanner(System.in);

    public CreateService() {} // 생성자 추가}

    //게시판 글 추가
    public void create() {


        int choice = 0;

        Board board = new Board();

        int setBno = BoardDao.getInstance().getBoards().stream()
                        .max(Comparator.comparing(Board::getBno))
                                .map(Board::getBno)
                                        .orElse(0) + 1;
        board.setBno(setBno);

        System.out.printf("제목 입력 : ");
        board.setBtitle(in.nextLine());
        System.out.printf("작가 입력 : ");
        board.setBwriter(in.nextLine());
        System.out.printf("내용 입력 : ");
        board.setBcontent(in.nextLine());
        System.out.println("날짜 입력 양식 : yyyyMMdd");
        System.out.print("날짜 입력 : ");
        String input = in.nextLine();

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
                    choice = Integer.parseInt(in.nextLine());
                }

        switch (choice){
            case 1: // 게시판 글추가
                BoardDao.getInstance().getBoards().add(board);
                break;
            case 2: // 게시판 글추가 취소
                break;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                break;
        }

        }
    }

