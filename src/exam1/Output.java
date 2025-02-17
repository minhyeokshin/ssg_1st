package exam1;

import java.util.Scanner;

public class Output {


    public static void list(){

        if (DTO.datalength != 0){
            DTO.crud[1][0] = "1";
            DTO.crud[1][1] = "winter";
            DTO.crud[1][2] = "2024.01.02";
            DTO.crud[1][3] = "게시판에 오신 것을 환영합니다.";
            DTO.crud[2][0] = "2";
            DTO.crud[2][1] = "winter";
            DTO.crud[2][2] = "2024.01.01";
            DTO.crud[2][3] = "올 겨울은 많이 춥습니다.";
        }

        System.out.println("[게시글 목록]");
        System.out.println("------------------------------------------");
        System.out.println("no\twriter\tdate\t\ttitle");
        if (DTO.datalength != 0){
        for (int i = 1; i < DTO.crud.length; i++) {
            System.out.printf("%s\t%s\t%s\t\t%s%n",DTO.crud[i][0],DTO.crud[i][1],DTO.crud[i][2],DTO.crud[i][3]);
        }}
        System.out.println("");
        System.out.println("------------------------------------------");
        mainMenu();
    }

    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.printf("메뉴 선택 : ");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                create.create();
                break;
            case 2:
                read.read();
                break;
            case 3:
                clear.clear();
                break;
            case 4:
                break;
            default:
                System.out.println("올바른 번호를 입력하세요.");
                break;

        }
    }
}
