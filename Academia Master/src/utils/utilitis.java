package utils;


import java.util.Calendar;
import java.util.Date;

import model.ContentEmail;

public class utilitis {
    public static ContentEmail GetContent(Boolean Birth)
    {
        ContentEmail contentEmail = new ContentEmail();
        if(Birth)
        {
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();

            calendar.setTime(date);
            int mes = calendar.get(Calendar.MONTH) + 1;
            int dia = calendar.get(Calendar.DAY_OF_MONTH);
            String data = mes + "-" + dia;
            
            contentEmail = new ContentEmail(
                                "comunicado.academia@gmail.com", 
                                "Parabens ao nosso cliente e parceiro", 
                                "Prezado(a) Cliente,\n" +
                                "Fazer aniversário é um daqueles momentos da vida em que podemos repensar e agradecer pelo passado e planejar o futuro.\n\n" +
                                "Neste dia especial na sua vida, ficamos extremamente satisfeitos em saber que estivemos presentes neste último ano fazendo uma parceria que acreditamos ter sido feliz e produtiva.\n\n" +
                                "Esperamos que no próximo ano possamos juntos celebrar mais e mais conquistas. Desejamos que este novo ano de vida que se inicia abra belos caminhos para percorrer, e seja repleto de realizações, vitórias e muito sucesso.\n\n" +
                                "Conte conosco para tudo aquilo em que pudermos colaborar, pois antes de tudo somos parceiros. Que a nova idade venha também acompanhada de muita saúde, paz e felicidades. Parabéns!\n\n" +
                                "Atenciosamente,\n" +
                                "Academia do Plínio", 
                                data);
        }
        else
        {
            
        }
        return contentEmail;
    }
}
