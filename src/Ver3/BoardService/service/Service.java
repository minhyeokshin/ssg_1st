package Ver3.BoardService.service;

public interface Service {


    // 게시판 글 추가
    void CreateBoard();

    //게시판 글 읽기
    void ReadBoard();

    // 전체 게시판 삭제
    void ClearBoard();

    //출력
    void startService();

}
