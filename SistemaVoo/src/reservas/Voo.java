package reservas;

import java.util.ArrayList;
import java.util.List;

import clientes.Passagem;

public class Voo {
    private int            numero;
    private String         origem;
    private String         destino;

    private Aeronave       aeronave;
    private Piloto         capitao;
    private Piloto         copiloto;

    private List<Passagem> reservas = new ArrayList<Passagem>();

    /**
     * 
     * @param numero
     * @param destino
     */
    public Voo(int numero, String destino) {
        this.numero = numero;
        this.destino = destino;
    }

    /**
     * 
     * @param numero
     * @param origem
     * @param destino
     */
    public Voo(int numero, String origem, String destino) {
        this(numero, destino);
        this.origem = origem;
    }

    /**
     * b. Implemente a lógica do método checkin, este método deverá receber uma
     * instância de uma passagem e então validar se: o limite de passageiros da
     * aeronave não tenha sido ultrapassado e o número do assento não esteja
     * ocupado por outra reserva de outro passageiro. Caso qualquer uma das
     * validações anteriores falhe, apresente uma mensagem de erro em tela e não
     * realize a reserva, caso contrário armazene a Passagem dentro da classe
     * Voo.
     * 
     * @param passagem
     */
    public void checkin(Passagem passagem) {
        boolean valido = true;

        if (this.getReservas().size() >= this.getAeronave()
                        .getLimitePassageiros()) {
            System.out.println("** Voo locado nao eh possivel alocar mais passageiros!!!");
            return;
        }

        for (Passagem reserva : this.getReservas()) {
            if (reserva.getAssento() == passagem.getAssento()) {
                valido = false;
                break;
            }
        }
        
        if (!valido) {
            System.out.println("** Esse assento já foi oculpado!!!");
            return;
        }
        
        this.getReservas().add(passagem);
    }

    public List<Passagem> getReservas() {
        return reservas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Piloto getCapitao() {
        return capitao;
    }

    public void setCapitao(Piloto capitao) {
        this.capitao = capitao;
    }

    public void setCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }

    public Piloto getCopiloto() {
        return copiloto;
    }
}
