package br.com.projetoIntegrador.util;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

public class GeradorUtil {

    public static String gerarNumero(int tamanhoDoNumero) {
        Random random = new Random();
        int numeroGerado;
        String numero = "";
        for (int i = 0; i < tamanhoDoNumero; i++) {
            numeroGerado = random.nextInt(10);
            numero = numero + numeroGerado;
        }
        return numero;
    }

    //Geradores de dados pessoais
    public static String gerarNome() {
        Random random = new Random();

        String[] nomes = {"Mei", "Yuzu", "Gwen", "Mary", "Lily", "Jenny",
            "Tomori", "Michelly", "Akane", "Ankha", "Zoe", "Italo", "Roberto", "Jhon",
            "Felipe", "Amilton", "Rick", "Katarina"};

        String[] sobrenomes = {"aihara", "cinnabar", "satou", "takanhashi",
            "matsuri", "azuma", "kawasaki", "sasamura", "tadokoro", "satsuki",
            "ulysses", "silver", "inamoto"};

        int numeroNome = random.nextInt(nomes.length);
        int numeroSobrenome = random.nextInt(sobrenomes.length);

        String nome = nomes[numeroNome];
        String sobrenome = sobrenomes[numeroSobrenome];

        String nomeCompleto = nome + " " + sobrenome;

        return nomeCompleto;
    }

    public static String gerarCpf() {
        String cpf = gerarNumero(11);
        MaskFormatter mascara;

        try {
            mascara = new MaskFormatter("###.###.###.##");
            mascara.setValueContainsLiteralCharacters(false);
            cpf = mascara.valueToString(cpf);
        } catch (ParseException ex) {
            System.out.println("Erro ao gerar Cpf: " + ex.getMessage());
        }
        return cpf;
    }

    public static String gerarDataDeNascimento() {
        Random random = new Random();
        int diaInt = random.nextInt(29) + 1;
        int mesInt = random.nextInt(13) + 1;
        int ano = random.nextInt(15) + 1991;

        String dia = String.valueOf(diaInt);
        String mes = String.valueOf(mesInt);
        if (diaInt < 10) {
            dia = "0" + diaInt;
        }
        if (mesInt < 10) {
            mes = "0" + mesInt;
        }

        String dataNascimento = dia + mes + ano;
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter("##/##/####");
            mascara.setValueContainsLiteralCharacters(false);
            dataNascimento = mascara.valueToString(dataNascimento);
        } catch (ParseException ex) {
            System.out.println("Erro ao gerar data de Nascimento " + ex.getMessage());
        }
        return dataNascimento;
    }

    public static int gerarIdade() {
        Random random = new Random();
        int idade = random.nextInt(15) + 16;
        return idade;
    }

    //Geradores de contato
    public static String gerarTelefone() {
        String numeroDeTelefone = gerarNumero(11);
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter("(##)#####-####");
            mascara.setValueContainsLiteralCharacters(false);
            numeroDeTelefone = mascara.valueToString(numeroDeTelefone);
        } catch (ParseException ex) {
            System.out.println("Erro ao gerar Telefone: " + ex.getMessage());
        }
        return numeroDeTelefone;
    }

    public static String gerarTelefoneFixo() {
        String numeroDeTelefoneFixo = gerarNumero(10);
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter("(##)####-####");
            mascara.setValueContainsLiteralCharacters(false);
            numeroDeTelefoneFixo = mascara.valueToString(numeroDeTelefoneFixo);
        } catch (ParseException ex) {
            System.out.println("Erro ao gerar TelefoneFixo: " + ex.getMessage());
        }
        return numeroDeTelefoneFixo;
    }

//    public static String gerarEmail() {
//        Random random = new Random();
//        String numeroDoEmail = gerarNumero(6);
//        String[] estados = {"ac", "al", "ap", "am", "ba", "ce", "es", "go",
//            "ma", "mt", "ms", "mg", "pa", "pb", "pr", "pe", "pi", "rj", "rn",
//            "rs", "ro", "rr", "sc", "sp", "se", "to", "df"};
//
//        String estado = estados[random.nextInt(estados.length)];
//        String email = numeroDoEmail + "@participante." + estado + ".torneio"
//                + "br";
//
//        return email;
//    }
    //Geradores de endere??o
    public static String gerarCep() {
        String cep = gerarNumero(8);
        MaskFormatter mascara;
        try {
            mascara = new MaskFormatter("#####-###");
            mascara.setValueContainsLiteralCharacters(false);
            cep = mascara.valueToString(cep);

        } catch (ParseException ex) {
            System.out.println("Erro ao gerar cep " + ex.getMessage());
        }

        return cep;
    }

    public static String gerarBairro() {
        Random random = new Random();

        String[] bairros = {"Abra??o Alab", "Aeroporto Velho", "Jati??ca",
            "Cruz das Almas", "Laguinho", "Bairol", "Chapada", "Cidade Nova",
            "??guas Claras", "Amaralia", "Pirambu", "Amadeu Furtado", "Serra",
            "Vila Velha", "Cachoeira Dourada", "Rio Prata", "Areinha", "Aurora",
            "Duque de Caxias", "Dom Aquino", "Vila Ipiranga", "Lageado",
            "Pampulha", "Barreiro", "Caruara", "Maracaj??", "Barra de Gramame",
            "Bessa", "Curitiba", "Cascavel", "Afogados", "??gua Fria", "Bela Vista",
            "Brasilar", "Tijuca", "Copacabana", "Candel??ria", "Lagoa Azul",
            "Cristal", "Pedra Redonda", "Castanheira", "Pedrinhas", "S??o Francisco",
            "Alvorada", "Canasvieiras", "Palho??a", "Raposo Tavares", "Vila Mariana",
            "Capucho", "Atalaia", "Santo Amaro", "Lago Norte", "Recanto das Emas",
            "Ceil??ndia"};

        String bairro = bairros[random.nextInt(bairros.length)];
        return bairro;
    }

    public static String gerarLogradouro() {

        Random random = new Random();

        String[] logradouros1 = {"Rua", "Avenida", "Travessa", "Estrada", "Pra??a",
            "Acesso", "Largo", "R??tula", "Esplanada", "Servid??o", "Parque",
            "Espa??o", "Mirante"
        };

        String[] logradouros2 = {"Champagnat", "Lincoln", "Powder", "Laguna",
            "da Aurora", "Portugal", "do Almirante", "das Flores", "do Frances",
            "Timber", "Beruti", "do Espanhol", "Bell", "Zircon", "los Suspiros",
            "Montevid??l", "Norte", "Sul", "Leste", "Oeste", "Central", "Baixa",
            "Alta", "Sacramento", "Pescador", "Garzon", "Rocha", "Boulevard",
            "Cusco", "do Imperador", "Lima", "Coqueiros", "Arequipa", "Trujillo",
            "Picchi", "Wall", "Mont", "Montain", "Jade", "Pinhal", "Pinheiros",
            "Humantay", "Nevada", "Pisac", "das Sereias", "Mairmaid", "do Conde",
            "Guatap??", "do Arista", "do Fil??sofo", "Zipaquir??", "Crisalia",
            "Nazca", "Colina", "Videl", "la Coroa", "da j??ia"};

        String logradouro = logradouros1[random.nextInt(logradouros1.length)]
                + " " + logradouros2[random.nextInt(logradouros2.length)];
        return logradouro;

    }

    public static String gerarCidade() {

        Random random = new Random();

        String[] cidades = {"Rio Branco", "Porto Acre", "Macei??", "Piranhas",
            "Macap??", "Oiapoque", "Manaus", "Autazes", "Salvador", "Porto Seguro",
            "Fortaleza", "Sobral", "Vit??ria", "Guarapari", "Goi??nia", "Formosa",
            "S??o lu??s", "Imperatriz", "Cuiab??", "Rondonop??lis", "Campo Grnade",
            "Ponta Por??", "Belo horizonte", "Uberl??ndia", "Bel??m", "Santar??m",
            "Jo??o Pessoa", "Patos", "Curitiba", "Cascavel", "Caruaru", "Recife",
            "Teresina", "Parna??ba", "Rio de Janeiro", "Petr??polis", "Mossor??",
            "Parnamirim", "Porto Alegre", "Rio Grande", "Ji-Paran??", "Vilhena",
            "Alto Alegre", "Uiramut??", "Florian??polis", "Conc??rdia", "S??o Paulo",
            "Embu das Artes", "Aracaju", "Lagarto", "Palmas", "Para??so do Tocantins",
            "Bras??lia", "Planaltina"};

        String cidade = cidades[random.nextInt(cidades.length)];
        return cidade;
    }

    public static String gerarEstado() {
        Random random = new Random();
        String[] estados = {"Acre", "Alogoas", "Amap??", "Amazonas", "Bahia",
            "Cear??", "Distrito Federal", "Esp??rito Santo", "Goi??s", "Maranh??o",
            "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par??", "Para??ba",
            "Paran??", "Pernambuco", "Piau??", "Rio de Janeiro", "Rio Grande do Norte",
            "Rio Grande do Sul", "Rond??nia", "Roraima", "Santa Catarina",
            "S??o Paulo", "Sergipe", "Tocantins"};

        String estado = estados[random.nextInt(estados.length)];
        return estado;
    }

    public static void main(String[] args) {
//        String nome = gerarNome();
//        String numeroCpf = gerarCpf();
//        String dataNascimento = gerarDataDeNascimento();
//        int idade = gerarIdade();
//
//        String telefone = gerarTelefone();
//        String telefoneFixo = gerarTelefoneFixo();
//        //String email = gerarEmail();
//
//        String cep = gerarCep();
//        String logradouro = gerarLogradouro();
//        String bairro = gerarBairro();
//        String cidade = gerarCidade();
//        String estado = gerarEstado();
//
//        System.out.println("Nome: " + nome);
//        System.out.println("Cpf: " + numeroCpf);
//        System.out.println("Nascimento: " + dataNascimento);
//        System.out.println("idade: " + idade);
//
//        System.out.println("Telefone: " + telefone);
//        System.out.println("Telefone fixo: " + telefoneFixo);
//        //System.out.println("Email: " + email);
//
//        System.out.println("Cep: " + cep);
//        System.out.println("Logradouro: " + logradouro);
//        System.out.println("Bairro: " + bairro);
//        System.out.println("Cidade: " + cidade);
//        System.out.println("Estado: " + estado);


            System.out.println(new Date(999999999));    
        
    }
}
