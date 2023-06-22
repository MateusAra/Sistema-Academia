package control;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMethods {
    public void InitPage(BorderPane mainLayout, Stage stage){
        FXMLLoader telaInicial = new FXMLLoader();
        telaInicial.setLocation(SistemaAcademia.class.getResource("/view/TelaPrincipal.fxml"));
        
        try {
            mainLayout = telaInicial.load();
        } 
        catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.setMaxWidth(3840);
        stage.setMaxHeight(2160);
        stage.getScene().setRoot(mainLayout);
        stage.setMaximized(true);
    }

    public void MainPage(BorderPane mainLayout, Stage stage){
        FXMLLoader telaPrincipal = new FXMLLoader();
        telaPrincipal.setLocation(SistemaAcademia.class.getResource("/view/TelaPrincipal.fxml"));

        try {
            mainLayout = telaPrincipal.load();
        } 
        catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public void RegisterPage(BorderPane mainLayout, Stage stage){
        FXMLLoader telaCadastro = new FXMLLoader();
        telaCadastro.setLocation(SistemaAcademia.class.getResource("/view/TelaCadastro.fxml"));

        try {
            mainLayout = telaCadastro.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void PaymentPage(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaFormaPagamento = new FXMLLoader();
        telaFormaPagamento.setLocation(SistemaAcademia.class.getResource("/view/TelaFormaPagamento.fxml"));
      
        try {
            mainLayout = telaFormaPagamento.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        stage.getScene().setRoot(mainLayout);
    }

    public static void SaleReport(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaRelatorioVenda = new FXMLLoader();
        telaRelatorioVenda.setLocation(SistemaAcademia.class.getResource("/view/TelaRelatorioVenda.fxml"));
      
        try {
            mainLayout = telaRelatorioVenda.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        stage.getScene().setRoot(mainLayout);
    }
}
