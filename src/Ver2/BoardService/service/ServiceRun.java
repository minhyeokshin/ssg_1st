package Ver2.BoardService.service;

import lombok.Setter;

import java.util.Scanner;

@Setter
public class ServiceRun implements Service {

    CreateService createService;
    ReadService readService;
    ClearService clearService;
    OutPutService outPutService;

    public ServiceRun(CreateService createService,ReadService readService,ClearService clearService,OutPutService outPutService) {
        this.createService = createService;
        this.readService = readService;
        this.clearService = clearService;
        this.outPutService = outPutService;



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
