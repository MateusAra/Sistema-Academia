package control;

import com.sun.javafx.application.LauncherImpl;
import com.sun.tools.javac.Main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class SistemaAcademia extends Application {
    
    private static Stage stage;
    
    private static BorderPane mainLayout;
    
    //private static final Catraca CATRACA = new Catraca("COM3",9600);
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        
        stage.setTitle("SGA");
        stage.getIcons().add(new Image("/view/icones/favicon.png"));

        Parent fxmlTelaPrincipal = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
        Scene scenePrincipal = new Scene(fxmlTelaPrincipal);
   
        stage.setScene(scenePrincipal);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setMaxWidth(750);
        stage.setMaxHeight(500);
        stage.show();
    }
    
    @Override
    public void init() throws Exception {
        try { Thread.sleep(4000); } catch (InterruptedException ex) {}
        Email.abrirConexao();
        Email.comunicarDevedores();
        Email.comunicarAniversariantes();
    }
    
    public static void changeScreen(String fxml) {
        switch(fxml) {
            case "InicializarSistema" :           
                MainMethods.InitPage(mainLayout, stage);
                break;
                
            case "TelaPrincipal" :           
                MainMethods.MainPage(mainLayout, stage);
                break;
            
            case "TelaCadastro" :
                MainMethods.RegisterPage(mainLayout, stage);
                break;
                
            case "TelaConsulta" :
                MainMethods.ConsultPage(mainLayout, stage);
                break;
              
            case "TelaPagamento" :
                MainMethods.PaymentPage(mainLayout, stage);
                break;
                
            case "TelaCadastroCliente" :
                MainMethods.RegisterPageClient(mainLayout, stage);
                break;
                
            case "TelaCadastroFuncionario" :
                MainMethods.RegisterPageEmployee(mainLayout, stage);
                break;
                
            case "TelaCadastroFornecedor" :
                MainMethods.RegisterPageEmployee(mainLayout, stage);
                break;
                
            case "TelaCadastroProduto" :
                MainMethods.RegisterPageProduct(mainLayout, stage);
                break;
                
            case "TelaCadastroVenda" :
                MainMethods.RegisterPageSale(mainLayout, stage);
                break;
                
            case "TelaPagamentoCompra" :
                MainMethods.Purchase(mainLayout, stage);
                break;
                
            case "TelaCadastroPlano" :
                MainMethods.RegisterPagePlan(mainLayout, stage);
                break;
                
            case "TelaConsultaCliente" :
                MainMethods.ConsultPageClient(mainLayout, stage);
                break;
                
            case "TelaConsultaFuncionario" :
                MainMethods.ConsultPageEmployee(mainLayout, stage);
                break;
                
            case "TelaConsultaFornecedor" :
                MainMethods.ConsultPageSupplier(mainLayout, stage);
                break;
                
            case "TelaConsultaProduto" :
                MainMethods.ConsultPageProduct(mainLayout, stage);
                break;
            
            case "TelaConsultaPlano" :
                MainMethods.ConsultPagePlan(mainLayout, stage);
                break;
            
            case "TelaConsultaVenda" :
                MainMethods.ConsultPageSale(mainLayout, stage);
                break;
                
            case "TelaAtualizarCliente" :
                MainMethods.UpdateClientPage(mainLayout, stage);
                break;
                
            case "TelaAtualizarFuncionario" :
                MainMethods.TelaAtualizarFuncionario(mainLayout, stage);
                break;
                
            case "TelaAtualizarFornecedor" :
                MainMethods.TelaAtualizarFornecedor(mainLayout, stage);
                break;
                
            case "TelaAtualizarProduto" :
                MainMethods.TelaAtualizarProduto(mainLayout, stage);
                break;
                
            case "TelaAtualizarPlano" :
                MainMethods.TelaAtualizarPlano(mainLayout, stage);
                break;
                
            case "TelaRelatorio" :
                MainMethods.TelaRelatorio(mainLayout, stage);
                break;
                
            case "TelaRelatorioUltimoAcesso" :
                MainMethods.TelaRelatorioUltimoAcesso(mainLayout, stage);
                break;
            
            case "TelaRelatorioRecebimento" :
                MainMethods.TelaRelatorioRecebimento(mainLayout, stage);
                break;
            
            case "TelaRelatorioVenda" :
                MainMethods.SaleReport(mainLayout, stage);
                break;
                
            case "TelaFormaPagamento" :
                MainMethods.PaymentPage(mainLayout, stage);
                break;
        }
    }
      
    public static void main(String[] args) {
        /*Thread threadCatraca = new Thread() {     
            @Override
            public void run() {
                String retorno;
                while(true) {
                    /* Catraca main method */
                    /*retorno = CATRACA.verificaCatraca();
                    if ("ex".equals(retorno)) {
                        JOptionPane.showMessageDialog(null, "CATRACA INDISPONÍVEL\nSolução do problema:\n\n1. Verifique a conexão da Catraca\n2. Verifique a conexão do Banco de Dados\n3. Reinicie o sistema\n\n", "", JOptionPane.PLAIN_MESSAGE);
                        break;
                    
                    /* Access denied */
                   /* } else if (!"".equals(retorno)) {                     
                        int resposta = JOptionPane.showConfirmDialog(null, "CARTÃO NÃO CADASTRADO\n\nDeseja copiar o código do cartão para cadastrá-lo?\n\n", "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                        
                        if (resposta == JOptionPane.YES_OPTION) {
                            StringSelection stringSelection = new StringSelection(retorno);
                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                            clipboard.setContents(stringSelection, null);
                            Robot r;
                            try {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_CONTROL);
                                r.keyPress(KeyEvent.VK_V);
                                r.keyRelease(KeyEvent.VK_CONTROL);
                                r.keyRelease(KeyEvent.VK_V);
                            } catch (AWTException ex) {
                            }
                        }
                    }
                    /* Thread pause moment */
                    /*try { Thread.sleep(300); } catch (InterruptedException ex) {}
                }
            }
        };
        
        threadCatraca.start();*/
        
        //launch(args);     
        
        LauncherImpl.launchApplication(SistemaAcademia.class, PreCarregamento.class, args);

        /*CATRACA.close();
        threadCatraca.destroy();*/
    }
}
