package Ver3.BoardService.controller;

import Ver3.BoardService.service.Service;

public class BoardControllerB implements BoardController {


    Service service;

    public BoardControllerB(Service service) {
            this.service = service;
    }
    @Override
    public void startMenu() {
        service.startService();
    }
}
