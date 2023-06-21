package control;

public class Visualizador {
    public static final int INDEX_0 = 0;
    public static final int INDEX_1 = 1;
    public static final int INDEX_2 = 2;
    public static final int INDEX_3 = 3;
    public static final int INDEX_4 = 4;
    public static final int INDEX_5 = 5;
    public static final int INDEX_6 = 6;
    public static final int INDEX_7 = 7;
    public static final int INDEX_8 = 8;
    public static final int INDEX_9 = 9;
    public static final int INDEX_10 = 10;
    public static final int INDEX_11 = 11;
    public static final int INDEX_12 = 12;
    public static final int INDEX_13 = 13;

    public static String visualizarPreco(float preco) {
        String string = Float.toString(preco);
        string = string.replaceAll("\\.", ",");
        string = "R$ " + string;
        return string;
    }

    public static String visualizarRg(String rg) {
        String rgPadrao = "";

        if (rg.length() == 9) {
            rgPadrao += rg.charAt(INDEX_0);
            rgPadrao += rg.charAt(INDEX_1);
            rgPadrao += ".";
            rgPadrao += rg.charAt(INDEX_2);
            rgPadrao += rg.charAt(INDEX_3);
            rgPadrao += rg.charAt(INDEX_4);
            rgPadrao += ".";
            rgPadrao += rg.charAt(INDEX_5);
            rgPadrao += rg.charAt(INDEX_6);
            rgPadrao += rg.charAt(INDEX_7);
            rgPadrao += "-";
            rgPadrao += rg.charAt(INDEX_8);
        } else {
            rgPadrao += rg.charAt(INDEX_0);
            rgPadrao += rg.charAt(INDEX_1);
            rgPadrao += ".";
            rgPadrao += rg.charAt(INDEX_2);
            rgPadrao += rg.charAt(INDEX_3);
            rgPadrao += rg.charAt(INDEX_4);
            rgPadrao += ".";
            rgPadrao += rg.charAt(INDEX_5);
            rgPadrao += rg.charAt(INDEX_6);
            rgPadrao += rg.charAt(INDEX_7);
        }
        return rgPadrao;
    }

    public static String visualizarCpf(String cpf) {
        String cpfPadrao = "";

        cpfPadrao += cpf.charAt(INDEX_0);
        cpfPadrao += cpf.charAt(INDEX_1);
        cpfPadrao += cpf.charAt(INDEX_2);
        cpfPadrao += ".";
        cpfPadrao += cpf.charAt(INDEX_3);
        cpfPadrao += cpf.charAt(INDEX_4);
        cpfPadrao += cpf.charAt(INDEX_5);
        cpfPadrao += ".";
        cpfPadrao += cpf.charAt(INDEX_6);
        cpfPadrao += cpf.charAt(INDEX_7);
        cpfPadrao += cpf.charAt(INDEX_8);
        cpfPadrao += "-";
        cpfPadrao += cpf.charAt(INDEX_9);
        cpfPadrao += cpf.charAt(INDEX_10);

        return cpfPadrao;
    }

    public static String visualizarCnpj(String cnpj) {
        String cnpjPadrao = "";

        cnpjPadrao += cnpj.charAt(0);
        cnpjPadrao += cnpj.charAt(1);
        cnpjPadrao += ".";
        cnpjPadrao += cnpj.charAt(2);
        cnpjPadrao += cnpj.charAt(3);
        cnpjPadrao += cnpj.charAt(4);
        cnpjPadrao += ".";
        cnpjPadrao += cnpj.charAt(5);
        cnpjPadrao += cnpj.charAt(6);
        cnpjPadrao += cnpj.charAt(7);
        cnpjPadrao += "/";
        cnpjPadrao += cnpj.charAt(8);
        cnpjPadrao += cnpj.charAt(9);
        cnpjPadrao += cnpj.charAt(10);
        cnpjPadrao += cnpj.charAt(11);
        cnpjPadrao += "-";
        cnpjPadrao += cnpj.charAt(12);
        cnpjPadrao += cnpj.charAt(13);

        return cnpjPadrao;
    }

    public static String visualizarData(String data) {
        String dataPadrao = "";

        dataPadrao += data.charAt(8);
        dataPadrao += data.charAt(9);
        dataPadrao += "/";
        dataPadrao += data.charAt(5);
        dataPadrao += data.charAt(6);
        dataPadrao += "/";
        dataPadrao += data.charAt(0);
        dataPadrao += data.charAt(1);
        dataPadrao += data.charAt(2);
        dataPadrao += data.charAt(3);

        return dataPadrao;
    }

    public static String visualizarPeso(float peso) {
        String string = Float.toString(peso);
        string = string.replaceAll("\\.", ",");
        string = string + " Kg";
        return string;
    }

    public static String visualizarImc(float imc) {
        String string = Float.toString(imc);
        string = string.replaceAll("\\.", ",");
        return string;
    }

    public static String visualizarGorduraCorporalSemPercent(int gordura) {
        String string = Integer.toString(gordura);
        string = string.replaceAll("\\.0", "");
        return string;
    }

    public static String visualizarGorduraCorporal(int gordura) {
        String string = Integer.toString(gordura);
        string = string + "%";
        return string;
    }

    public static String visualizarAltura(float altura) {
        String string = Float.toString(altura);
        string = string.replaceAll("\\.", ",");
        string = string + "m";
        return string;
    }

    public static String visualizarPhone(String telefone) {
        String telefonePadrao = "";

        telefonePadrao += "(";
        telefonePadrao += telefone.charAt(0);
        telefonePadrao += telefone.charAt(1);
        telefonePadrao += ") ";
        telefonePadrao += telefone.charAt(2);
        telefonePadrao += telefone.charAt(3);
        telefonePadrao += telefone.charAt(4);
        telefonePadrao += telefone.charAt(5);
        telefonePadrao += "-";
        telefonePadrao += telefone.charAt(6);
        telefonePadrao += telefone.charAt(7);
        telefonePadrao += telefone.charAt(8);
        telefonePadrao += telefone.charAt(9);

        return telefonePadrao;
    }

    public static String visualizarCell(String celular) {
        String celularPadrao = "";

        celularPadrao += "(";
        celularPadrao += celular.charAt(0);
        celularPadrao += celular.charAt(1);
        celularPadrao += ") ";
        celularPadrao += celular.charAt(2);
        celularPadrao += celular.charAt(3);
        celularPadrao += celular.charAt(4);
        celularPadrao += celular.charAt(5);
        celularPadrao += celular.charAt(6);
        celularPadrao += "-";
        celularPadrao += celular.charAt(7);
        celularPadrao += celular.charAt(8);
        celularPadrao += celular.charAt(9);
        celularPadrao += celular.charAt(10);

        return celularPadrao;
    }

    public static String visualizarCep(String cep) {
        String cepPadrao = "";

        cepPadrao += cep.charAt(0);
        cepPadrao += cep.charAt(1);
        cepPadrao += cep.charAt(2);
        cepPadrao += cep.charAt(3);
        cepPadrao += cep.charAt(4);
        cepPadrao += "-";
        cepPadrao += cep.charAt(5);
        cepPadrao += cep.charAt(6);
        cepPadrao += cep.charAt(7);

        return cepPadrao;
    }

    public static String visualizarSexo(String sexo) {
        String string;
        if (sexo.equals("f") || sexo.equals("F")) {
            string = "Feminino";
        } else {
            string = "Masculino";
        }
        return string;
    }

    public static String visualizarGerente(boolean gerente) {
        String string;

        if (gerente) {
            string = "SIM";
        } else {
            string = "NÃO";
        }
        return string;
    }
}
