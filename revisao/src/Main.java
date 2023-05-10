import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        usuario.Usuario usuario1 = new usuario.Usuario(1, "Joao", "joao@gmail.com", "123456");
        usuario.Usuario usuario2 = new usuario.Usuario(2, "Maria", "maria@gmail.com", "abcdef");

        usuario.Endereco endereco1 = new usuario.Endereco("Rua A", "123", "Apto 101", "Bairro X", "Cidade Y", "Estado Z", "Brasil", "12345-678");
        usuario.Endereco endereco2 = new usuario.Endereco("Rua B", "456", "", "Bairro X", "Cidade Y", "Estado Z", "Brasil", "12345-678");

        usuario.Propriedade propriedade1 = new usuario.Propriedade(1, "Casa de Praia", "Casa com piscina na praia", endereco1, 500.0, 8);
        usuario.Propriedade propriedade2 = new usuario.Propriedade(2, "Apartamento", "Apartamento no centro da cidade", endereco2, 200.0, 4);

        usuario1.cadastrarPropriedade(propriedade1);
        usuario2.cadastrarPropriedade(propriedade2);

        LocalDate dataInicial = LocalDate.of(2023, 5, 10);
        LocalDate dataFinal = LocalDate.of(2023, 5, 15);
        usuario.Periodo periodo = new usuario.Periodo(dataInicial, dataFinal);

        usuario.Reserva reserva1 = new usuario.Reserva(1, propriedade1, usuario2, periodo);

        propriedade1.adicionarReserva(reserva1);

        usuario.Avaliacao avaliacao1 = new usuario.Avaliacao(1, propriedade1, usuario2, 4, "Ótima casa, mas faltou internet");

        propriedade1.adicionarAvaliacao(avaliacao1);
    }
}
