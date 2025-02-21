package Ver2.BoardService;


import Ver2.BoardService.controller.BoardController;
import Ver2.BoardService.service.*;

public class Main {

    public static void main(String[] args) {

//       BoardController board = new BoardController(
//               new CreateService(),
//               new ReadService(),
//               new ClearService(),
//               new OutPutService(),
//               new ServiceRun(new OutPutService())
//       );

        ServiceRun service = new ServiceRun(
                    new CreateService(),
                    new ReadService(),
                    new ClearService(),
                    new OutPutService()
        );


        service.startService();

//        board.start();
    }

}