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

    public static void TelaAtualizarProduto(Borderpane mainLayout, Stage stage){
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
    public static void SaleReportPage(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaRelatorioVenda = new FXMLLoader();
        telaRelatorioVenda.setLocation(SistemaAcademia.class.getResource("/view/TelaRelatorioVenda.fxml"));

        try {
            mainLayout = telaRelatorioVenda.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPage(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsulta = new FXMLLoader();
        telaConsulta.setLocation(SistemaAcademia.class.getResource("/view/TelaConsulta.fxml"));

        try {
            mainLayout = telaConsulta.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void PaymentPage(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaPagamento = new FXMLLoader();
        telaPagamento.setLocation(SistemaAcademia.class.getResource("/view/TelaPagamento.fxml"));

        try {
            mainLayout = telaPagamento.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void RegisterPageClient(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaRelatorioVenda = new FXMLLoader();
        telaRelatorioVenda.setLocation(SistemaAcademia.class.getResource("/view/TelaRelatorioVenda.fxml"));

        try {
            mainLayout = telaRelatorioVenda.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void RegisterPageEmployee(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaCadastroFuncionario = new FXMLLoader();
        telaCadastroFuncionario.setLocation(SistemaAcademia.class.getResource("/view/TelaCadastroFuncionario.fxml"));

        try {
            mainLayout = telaCadastroFuncionario.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void RegisterPageSupplier(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaCadastroFornecedor = new FXMLLoader();
        telaCadastroFornecedor.setLocation(SistemaAcademia.class.getResource("/view/TelaCadastroFornecedor.fxml"));

        try {
            mainLayout = telaCadastroFornecedor.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void RegisterPageProduct(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaCadastroProduto = new FXMLLoader();
        telaCadastroProduto.setLocation(SistemaAcademia.class.getResource("/view/TelaCadastroProduto.fxml"));

        try {
            mainLayout = telaCadastroProduto.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void RegisterPageSale(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaCadastroVenda = new FXMLLoader();
        telaCadastroVenda.setLocation(SistemaAcademia.class.getResource("/view/TelaCadastroVenda.fxml"));

        try {
            mainLayout = telaCadastroVenda.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void Purchase(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaPagamentoCompra = new FXMLLoader();
        telaPagamentoCompra.setLocation(SistemaAcademia.class.getResource("/view/TelaPagamentoCompra.fxml"));

        try {
            mainLayout = telaPagamentoCompra.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void RegisterPagePlan(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaCadastroPlano = new FXMLLoader();
        telaCadastroPlano.setLocation(SistemaAcademia.class.getResource("/view/TelaCadastroPlano.fxml"));

        try {
            mainLayout = telaCadastroPlano.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPageClient(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsultaCliente = new FXMLLoader();
        telaConsultaCliente.setLocation(SistemaAcademia.class.getResource("/view/TelaConsultaCliente.fxml"));

        try {
            mainLayout = telaConsultaCliente.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPageEmployee(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsultaFuncionario = new FXMLLoader();
        telaConsultaFuncionario.setLocation(SistemaAcademia.class.getResource("/view/TelaConsultaFuncionario.fxml"));

        try {
            mainLayout = telaConsultaFuncionario.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPageSupplier(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsultaFornecedor = new FXMLLoader();
        telaConsultaFornecedor.setLocation(SistemaAcademia.class.getResource("/view/TelaConsultaFornecedor.fxml"));

        try {
            mainLayout = telaConsultaFornecedor.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPageProduct(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsultaProduto = new FXMLLoader();
        telaConsultaProduto.setLocation(SistemaAcademia.class.getResource("/view/TelaConsultaProduto.fxml"));

        try {
            mainLayout = telaConsultaProduto.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPagePlan(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsultaPlano = new FXMLLoader();
        telaConsultaPlano.setLocation(SistemaAcademia.class.getResource("/view/TelaConsultaPlano.fxml"));

        try {
            mainLayout = telaConsultaPlano.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void ConsultPageSale(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaConsultaVenda = new FXMLLoader();
        telaConsultaVenda.setLocation(SistemaAcademia.class.getResource("/view/TelaConsultaVenda.fxml"));

        try {
            mainLayout = telaConsultaVenda.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

    public static void UpdateClientPage(BorderPane mainLayout, Stage stage) {
        FXMLLoader telaAtualizarCliente = new FXMLLoader();
        telaAtualizarCliente.setLocation(SistemaAcademia.class.getResource("/view/TelaAtualizarCliente.fxml"));

        try {
            mainLayout = telaAtualizarCliente.load();
        } catch (IOException ex) {
            Logger.getLogger(SistemaAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

        stage.getScene().setRoot(mainLayout);
    }

}
