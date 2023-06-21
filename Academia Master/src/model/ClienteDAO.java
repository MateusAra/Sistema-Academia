package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO extends DAO {

    private static ClienteDAO instance;
    private static Connection myCONN;

    private ClienteDAO() {
    }

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
            try {
                myCONN = instance.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            if(myCONN == null) {
                try {
                myCONN = instance.getConnection();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return instance;
    }
    
    private Cliente buildObject(ResultSet rs) {
        Cliente cliente = null;
        try { 
            cliente = new Cliente(rs.getInt("id_pessoa"), rs.getString("rg"), rs.getString("cpf"), rs.getString("nome"),
                rs.getString("sexo"), rs.getString("dt_nasc"), rs.getString("telefone"), rs.getString("celular"),
                rs.getString("email"), rs.getString("endereco"), rs.getString("cep"), rs.getString("estado"),
                rs.getString("cidade"), rs.getString("bairro"), rs.getString("cartao"), rs.getInt("plano"), 
                rs.getString("dt_vencimento"), rs.getFloat("altura"), rs.getFloat("peso"), rs.getFloat("imc"), 
                rs.getInt("porcentagem_gordura_corporal"), rs.getString("ultimoAcesso"));
        } catch (SQLException e) {
            
        }
        return cliente;
    }
    
    
    //CRUD
    //CADASTRO
    public boolean cadastrar(Cliente cliente) {
        PreparedStatement stmt;        
        try {
            stmt = myCONN.prepareStatement("exec cadastrarClientes ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            stmt.setString(1, cliente.getRg());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getNome());
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getDtNasc());
            stmt.setString(6, cliente.getTelefone());
            stmt.setString(7, cliente.getCelular());
            stmt.setString(8, cliente.getEmail());
            stmt.setString(9, cliente.getEndereco());
            stmt.setString(10, cliente.getCep());
            stmt.setString(11, cliente.getEstado());
            stmt.setString(12, cliente.getCidade());
            stmt.setString(13, cliente.getBairro());
            stmt.setString(14, cliente.getCartao());
            stmt.setString(15, cliente.getCartao());
            stmt.setFloat(16, cliente.getAltura());
            stmt.setFloat(17, cliente.getPeso());
            stmt.setFloat(18, cliente.getImc());
            stmt.setInt(19, cliente.getPorcentagemGorduraCorporal());
            int rowCount = this.executarQuery(stmt);
            stmt.close();
            if(rowCount == 1) {
                return true;
            }
        } catch (SQLException ex) {
        }
        return false;
    }
    
    //RESTAURAR
    public List<Cliente> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Cliente> clientes = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while(rs.next()) {
                clientes.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            
        }
        return clientes;
    }

    public List<Cliente> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM consultarClientes");
    }

    public List<Cliente> retrieveLike(String nome) {
        return this.retrieveGeneric("exec buscarClientes '" + nome + "'");
    }
    
    //ATUALIZAR
    public boolean atualizar(Cliente cliente) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("exec atualizarClientes  ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getNome());
            stmt.setString(5, cliente.getSexo());
            stmt.setString(6, cliente.getDtNasc());
            stmt.setString(7, cliente.getTelefone());
            stmt.setString(8, cliente.getCelular());
            stmt.setString(9, cliente.getEmail());
            stmt.setString(10, cliente.getEndereco());
            stmt.setString(11, cliente.getCep());
            stmt.setString(12, cliente.getEstado());
            stmt.setString(13, cliente.getCidade());
            stmt.setString(14, cliente.getBairro());
            stmt.setString(15, cliente.getCartao());
            stmt.setInt(16, cliente.getPlano());
            stmt.setString(17, cliente.getDtVencimento());
            stmt.setFloat(18, cliente.getAltura());
            stmt.setFloat(19, cliente.getPeso());
            stmt.setFloat(20, cliente.getImc());
            stmt.setInt(21, cliente.getPorcentagemGorduraCorporal());
            stmt.setString(22, cliente.getUltimoAcesso());
            int rowCount = this.executarQuery(stmt);
            stmt.close();
            if (rowCount == 1) {
                return true;
            }     
        } catch (SQLException ex) {
            
        }
        return false;
    }
    
    //REMOVER
    public boolean remover(int idCliente) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("exec deletarClientes ?");
            stmt.setInt(1, idCliente);
            int rowCount = this.executarQuery(stmt);
            stmt.close();
            if(rowCount == 1)
                return true;
            } catch (SQLException ex) {
            
            }
        return false;
    }
    
    public boolean pagar(int idCliente) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("exec atualizarDataVencimentoCliente ?");
            stmt.setInt(1, idCliente);
            int rowCount = this.executarQuery(stmt);
            stmt.close();
            if(rowCount == 1)
                return true;
            } catch (SQLException ex) {
            
            }
        return false;
    }
}
