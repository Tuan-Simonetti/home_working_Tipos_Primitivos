import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DadosCadastrais {
    private static final Locale LOCALE_PT_BR = new Locale("en", "USA");

    public static void main(String[] args) throws ParseException {

        String userID = "123456";
        String celular = "(27) 99999-9999";
        String nascimento = String.format("%d/%d/%d", 26, 9, 1994);
        String dataCadastro = String.format("%d/%d/%d", 14, 1, 2020);
        String email = "brasil@gmail.com";
        String mgm = "VALOAB1";
        String versao = "10.18.2";
        Date ultimaVezOnline = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", LOCALE_PT_BR);
        Date novoDate = formatter.parse(dataCadastro);
        System.out.println(novoDate);

//        Integer idUser = Integer.parseInt(userID);
//        System.out.println(idUser);

        Long idUser = Long.parseLong(userID);
        System.out.println(idUser);

    }


}
