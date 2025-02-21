package Ver3.BoardService;


import Ver3.BoardService.View.View;
import Ver3.BoardService.View.viewDemo;
import Ver3.BoardService.controller.BoardController;
import Ver3.BoardService.controller.BoardControllerB;
import Ver3.BoardService.service.*;
import Ver3.BoardService.service.dao.BoardDao;

public class Main {

    public static void main(String[] args) {

        BoardDao boardDao = BoardDao.getInstance();
        View view = new viewDemo();
        CreateService createService = new CreateService(boardDao);
        ReadService readService = new ReadService(boardDao);
        ClearService clearService = new ClearService(boardDao,view);
        OutPutService outPutService = new OutPutService(boardDao);

        Service service = new ServiceRun(createService,readService,clearService,outPutService);

        BoardController boardController = new BoardControllerB(service);
        boardController.startMenu();

    }

}