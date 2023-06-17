package model;

public class ContentEmail {
    public String from;
    public String assunto;
    public String conteudo;
    public String data;

    public ContentEmail(String from, String assunto, String conteudo, String data){
        this.from = from;
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.data = data;
    }

    public ContentEmail(){ }
}
