package Ver2.BoardService;


import Ver2.BoardService.controller.*;
import Ver2.BoardService.service.ServiceRun;
import Ver2.BoardService.service.*;
import Ver2.BoardService.service.dao.BoardDao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        BoardDao boardDao = BoardDao.getInstance();
        CreateService createService = new CreateService(boardDao);
        ReadService readService = new ReadService(boardDao);
        ClearService clearService = new ClearService(boardDao);
        OutPutService outPutService = new OutPutService(boardDao);

        Service service = new ServiceRun(createService,readService,clearService,outPutService);

        BoardController boardController = new BoardControllerB(service);
        boardController.startMenu();

    }

}