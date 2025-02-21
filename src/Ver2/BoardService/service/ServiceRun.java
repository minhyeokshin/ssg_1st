package Ver2.BoardService.service;

import Ver2.BoardService.service.Service;

public class ServiceRun implements Service {

    private CreateService createService;
    private ReadService readService;
    private ClearService clearService;
    private OutPutService outPutService;

    public ServiceRun(OutPutService outPutService) {
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
    public void OutputBoard() {
                outPutService.list();
                outPutService.mainMenu();
    }
}
