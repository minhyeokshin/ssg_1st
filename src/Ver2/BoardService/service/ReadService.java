package Ver2.BoardService.service;

import Ver2.BoardService.controller.BoardControllerB;
import Ver2.BoardService.service.dao.BoardDao;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ReadService{
    Scanner in = new Scanner(System.in);

    public ReadService() { // 생성자 추가

    }

    //게시물 읽기
    public void read() {
        System.out.println("[게시물 읽기]");
        System.out.printf("bno: ");
        int serachbno = in.nextInt();

        for (int i = 0; i < BoardDao.getBoards().size(); i++) {
            if (serachbno == BoardDao.getBoards().get(i).getBno()){
                System.out.println("#####################");
                System.out.printf("번호 : %s%n", BoardDao.getBoards().get(i).getBno());
                System.out.printf("제목 :%s%n", BoardDao.getBoards().get(i).getBtitle());
                System.out.printf("내용 :%s%n", BoardDao.getBoards().get(i).getBcontent());
                System.out.printf("작성자 :%s%n", BoardDao.getBoards().get(i).getBwriter());

                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
                String printDate = formatter.format(BoardDao.getBoards().get(i).getBdate());

                System.out.printf("출간일 :%s%n",printDate);
                System.out.println("#####################");

                int choice = 0;

                    System.out.println("보조 메뉴 : 1.Update(수정) | 2.Delete(삭제) | 3.List(전체보기)");
                    System.out.printf("메뉴 선택 : ");
                    choice = in.nextInt();
                    in.nextLine();

                switch (choice){
                    case 1: // 게시물 내용 변경
                        System.out.print("제목 : ");
                        BoardDao.getBoards().get(i).setBtitle(in.nextLine());
                        System.out.print("내용 : ");
                        BoardDao.getBoards().get(i).setBcontent(in.nextLine());
                        System.out.print("작성자 : ");
                        BoardDao.getBoards().get(i).setBwriter(in.nextLine());
//                            Board.boards.get(i).setBdate(Board.boards.get(i).getBdate());
                        break;
                    case 2: //게시물 삭제
                        BoardDao.getBoards().remove(i);
                        System.out.println("삭제하였습니다.");

                        // bno 책의 고유 넘버가 아니면 아래 코드 추가
                        // 책 순서 1번부터 다시 넘버링 하는 로직
                        /*
                        for (int j = 0; j < Board.boards.size(); j++) {
                            Board.boards.get(j).setBno(j+1);
                        }
                        */

                        return;
                    case 3:
                        System.out.printf("게시판 목록을 확인합니다.%n");
                        return;
                    default:
                        System.out.println("올바른 숫자를 입력하세요.");
                        break;
                }
            }

        }

    }
}
