import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class usuario {

    public static class Usuario {
        private final List<Propriedade> propriedades;

        public Usuario(int id, String nome, String email, String senha) {
            this.propriedades = new ArrayList<>();
        }

        // getters e setters

        public void cadastrarPropriedade(Propriedade propriedade) {
            this.propriedades.add(propriedade);
        }
    }

    public static class Propriedade {
        private final List<Reserva> reservas;
        private final List<Avaliacao> avaliacoes;

        public Propriedade(int id, String nome, String descricao, Endereco endereco,
                           double precoPorNoite, int capacidadeMaxima) {
            this.reservas = new ArrayList<>();
            this.avaliacoes = new ArrayList<>();
        }

        // getters e setters

        public boolean isDisponivel(Periodo periodo) {
            for (Reserva reserva : reservas) {
                if (reserva.getPeriodo().intersects(periodo)) {
                    return false;
                }
            }
            return true;
        }

        public void adicionarReserva(Reserva reserva) {
            this.reservas.add(reserva);
        }

        public void adicionarAvaliacao(Avaliacao avaliacao) {
            this.avaliacoes.add(avaliacao);
        }
    }

    public static class Reserva {

        public Reserva(int id, Propriedade propriedade, Usuario usuario, Periodo periodo) {
        }

        public Periodo getPeriodo() {
            return null;
        }

        // getters e setters
    }

    public static class Avaliacao {

        public Avaliacao(int id, Propriedade propriedade, Usuario usuario, int nota, String comentario) {
        }

        // getters e setters
    }

    public static class Endereco {

        public Endereco(String rua, String numero, String complemento, String bairro, String cidade,
                        String estado, String pais, String cep) {
        }

        // getters e setters
    }
    public static class Periodo {
        private final LocalDate dataInicial;
        private final LocalDate dataFinal;

        public Periodo(LocalDate dataInicial, LocalDate dataFinal) {
            this.dataInicial = dataInicial;
            this.dataFinal = dataFinal;
        }

        // getters e setters

        public boolean intersects(Periodo outroPeriodo) {
            return !(this.dataInicial.isAfter(outroPeriodo.dataFinal) || this.dataFinal.isBefore(outroPeriodo.dataInicial));
        }
    }}
