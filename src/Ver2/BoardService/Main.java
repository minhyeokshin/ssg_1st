package Ver2.BoardService;


import Ver2.BoardService.controller.BoardController;
import Ver2.BoardService.controller.BoardControllerB;
import Ver2.BoardService.service.ServiceRun;
import Ver2.BoardService.service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        CreateService createService = new CreateService();
        ReadService readService = new ReadService();
        ClearService clearService = new ClearService();
        OutPutService outPutService = new OutPutService();
        Service service = new ServiceRun(createService,readService,clearService,outPutService);

        BoardController boardController = new BoardControllerB(service);
        boardController.startMenu();

    }

}