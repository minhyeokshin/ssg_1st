package Ver2.BoardService;


import Ver2.BoardService.controller.ServiceRun;
import Ver2.BoardService.service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        CreateService createService = new CreateService();
        ReadService readService = new ReadService();
        ClearService clearService = new ClearService();
        OutPutService outPutService = new OutPutService();


//       BoardController board = new BoardController(
//               new CreateService(),
//               new ReadService(),
//               new ClearService(),
//               new OutPutService(),
//               new ServiceRun(new OutPutService())
//       );

        ServiceRun service = new ServiceRun(
                    createService,
                    readService,
                    clearService,
                    outPutService,
                    input
        );


        service.startService();

//        board.start();
    }

}