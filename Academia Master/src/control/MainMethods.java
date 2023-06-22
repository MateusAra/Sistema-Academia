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

    public static void TelaRelatorioRecebimento(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaRelatorioRecebimento = new FXMLLoader();
        telaRelatorioRecebimento.setLocation(SistemaAcademia.class.getResource("/view/TelaRelatorioRecebimento.fxml"));

        try {
            mainLayout = telaRelatorioRecebimento.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        stage.getScene().setRoot(mainLayout);
    }

    public static void TelaRelatorioUltimoAcesso(BorderPane mainLayout, Stage stage){
        FXMLLoader telaAtualizarFuncionario = new FXMLLoader();
        telaAtualizarFuncionario.setLocation(SistemaAcademia.class.getResource("/view/TelaAtualizarFuncionario.fxml"));

        try {
            mainLayout = telaAtualizarFuncionario.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        stage.getScene().setRoot(mainLayout);
        break;
    }

    public static void TelaAtualizarFornecedor(BorderPane mainLayout, Stage stage){
        FXMLLoader telaAtualizarFornecedor = new FXMLLoader();
        telaAtualizarFornecedor.setLocation(SistemaAcademia.class.getResource("/view/TelaAtualizarFornecedor.fxml"));

        try {
            mainLayout = telaAtualizarFornecedor.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        stage.getScene().setRoot(mainLayout);
    }

    public static void TelaAtualizarProduto(){
        FXMLLoader telaAtualizarProduto = new FXMLLoader();
        telaAtualizarProduto.setLocation(SistemaAcademia.class.getResource("/view/TelaAtualizarProduto.fxml"));
        try {
            mainLayout = telaAtualizarProduto.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        stage.getScene().setRoot(mainLayout);
    }

    public static void TelaAtualizarPlano(BorderPane mainLayout, Stage stage){
        FXMLLoader telaAtualizarPlano = new FXMLLoader();
        telaAtualizarPlano.setLocation(SistemaAcademia.class.getResource("/view/TelaAtualizarPlano.fxml"));

        try {
            mainLayout = telaAtualizarPlano.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        stage.getScene().setRoot(mainLayout);
    }
    
    public static void TelaRelatorioUltimoAcesso(BorderPane mainLayout, Stage stage){
        FXMLLoader telaRelatorioUltimoAcesso = new FXMLLoader();
                telaRelatorioUltimoAcesso.setLocation(SistemaAcademia.class.getResource("/view/TelaRelatorioUltimoAcesso.fxml"));
        
                try {
                    mainLayout = telaRelatorioUltimoAcesso.load();
                } catch (IOException ex) {
                    Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                stage.getScene().setRoot(mainLayout);
    }

    public static void TelaRelatorio(BorderPane mainLayout, Stage stage){
        FXMLLoader telaRelatorio = new FXMLLoader();
        telaRelatorio.setLocation(SistemaAcademia.class.getResource("/view/TelaRelatorio.fxml"));

        try {
            mainLayout = telaRelatorio.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }
    

}
