package Ver2.BoardService.controller;

import Ver2.BoardService.service.ClearService;
import Ver2.BoardService.service.CreateService;
import Ver2.BoardService.service.OutPutService;
import Ver2.BoardService.service.ReadService;
import lombok.Setter;

import java.util.Scanner;

@Setter
public class ServiceRun implements Service {

    private CreateService createService;
    private ReadService readService;
    private ClearService clearService;
    private OutPutService outPutService;
    private Scanner input;

    public ServiceRun(CreateService createService,ReadService readService,ClearService clearService,OutPutService outPutService,Scanner input) {
        this.createService = createService;
        this.readService = readService;
        this.clearService = clearService;
        this.outPutService = outPutService;
        this.input = input;

        this.createService.setScanner(input);
        this.readService.setScanner(input);
        this.clearService.setScanner(input);
        this.outPutService.setScanner(input);

    }


    @Override
    public void CreateBoard() {
                createService.create();
    }

    @Override
    public void ReadBoard() {
                readService.read();
    }

    @Override
    public void ClearBoard() {
                clearService.clear();
    }

    @Override
    public void startService() {
                outPutService.list();
                outPutService.mainMenu();
    }
}
