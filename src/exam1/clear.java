package exam1;

public class clear {
    public static void clear(){
        DTO.crud = new String[DTO.datalength][0];
        DTO.datalength = 0;
        Output.list();
    }
}
