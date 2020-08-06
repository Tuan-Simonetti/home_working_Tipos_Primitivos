package conversaoStringDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorStringParaDate {

    public static void main(String[] args) throws ParseException {
        String birthday = "19/07/1991";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date dataFormatada = formato.parse(birthday);

        System.out.println(birthday);       // String
        System.out.println(dataFormatada);  // Date
    }
}
