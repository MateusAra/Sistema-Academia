package control;

import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import model.Cliente;
import model.ClienteDAO;
import model.ContentEmail;
import utils.utilitis;

public class Email {
    private static Session session;
    
    public static void abrirConexao() {
        session = Session.getInstance(configurarPropriedades(), new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("comunicado.academia@gmail.com","ftlimeira");
            }
        });
    }
    
    private static Properties configurarPropriedades() {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        return properties;
    }
    
    public static void comunicarAniversariantes() {
        
        ContentEmail contentEmail = utilitis.GetContent(true);
        ClienteDAO cliente = ClienteDAO.getInstance();
        List<Cliente> listaClientes = cliente.retrieveGeneric("SELECT * FROM consultarClientes WHERE dt_nasc like '%-" + contentEmail.data + "'");
        
        String[] to = new String[listaClientes.size()];        
        for (int i=0; i<listaClientes.size(); i++) {
            to[i] = listaClientes.get(i).getEmail();
        }
        
        if (to.length > 0) {
            enviarEmail(contentEmail.from, to, contentEmail.assunto, contentEmail.conteudo, session);
            System.out.println("Emails de aniversários enviados");
        } else
            System.out.println("Nenhum email de aniversário enviado");
    }
    
    public static void comunicarDevedores() {
        
        Date date = new Date();        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 2);
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        String proxData = ano+"-"+mes+"-"+dia;

        calendar.add(Calendar.DATE, -4);
        ano = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DAY_OF_MONTH);

        String passData = ano+"-"+mes+"-"+dia;
        
        String from = "comunicado.academia@gmail.com";
        String assunto = "Lembrete de vencimento de pagamento";
        String conteudo = "Prezado(a) Cliente,\n" +
                          "Vimos por meio desta apenas lembrar-lhe a data de vencimento do seu plano da academia.\n\n" +
                          "Vencimento em: " + dia + "/" + mes + "/" + ano + "\n\n" +
                          "Atenciosamente,\n" +
                          "Academia do Plínio\n" +
                          "Departamento de Cobrança";
        
        ClienteDAO cliente = ClienteDAO.getInstance();
        List<Cliente> listaClientes = cliente.retrieveGeneric("SELECT * FROM consultarClientes WHERE dt_vencimento = '" + proxData + "' OR dt_vencimento = '" + passData + "'");
        
        String[] to = new String[listaClientes.size()];        
        for (int i=0; i<listaClientes.size(); i++) {
            to[i] = listaClientes.get(i).getEmail();
        }
        
        if (to.length > 0) {
            enviarEmail(from, to, assunto, conteudo, session);
            System.out.println("Emails de cobrança enviados");
        } else
            System.out.println("Nenhum email de cobrança enviado");
            
    }
    
    private static void enviarEmail(String from, String[] to, String assunto, String conteudo, Session session) {        
        for (String cliente : to) {
            try {
                MimeMessage message = new MimeMessage(session);
                try { message.setFrom(new InternetAddress(from, "Academia do Plínio"));
                } catch (UnsupportedEncodingException ex) {message.setFrom(new InternetAddress(from));}
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(cliente));
                message.setSubject(assunto);
                message.setText(conteudo);
                Transport.send(message);
            }catch(MessagingException mex) {
            }
        }
    }
}
