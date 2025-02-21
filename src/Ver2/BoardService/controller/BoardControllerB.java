package Ver2.BoardService.controller;



import Ver2.BoardService.service.*;


import java.util.Scanner;
public class BoardControllerB implements BoardController{

    Service service;
    public BoardControllerB(Service service) {
            this.service = service;
    }
    @Override
    public void startMenu() {
        service.startService();
    }
}
