package reservas;

import java.util.ArrayList;
import java.util.List;

import clientes.Bagagem;
import clientes.Passageiro;
import clientes.Passagem;
import static br.edu.univille.util.TextUtil.fillSpacesRight;

public class Companhia {
    private List<Piloto>   funcionarios = new ArrayList<Piloto>();
    private List<Voo>      linhas       = new ArrayList<Voo>();
    private List<Aeronave> frota        = new ArrayList<Aeronave>();

    public List<Piloto> getFuncionarios() {
        return funcionarios;
    }

    public List<Aeronave> getFrota() {
        return frota;
    }

    public List<Voo> getLinhas() {
        return linhas;
    }
    

    /**
     * c. Implemente o método chamado listagemDeLinhas() na classe Companhia,
     * esse método deverá listar TODOS os dados dos Voos e de suas classe
     * associadas, e por consequência, TODOS os dados das passagens e de suas
     * classes associadas, por Voo.
     */
    public void listagemDeLinhas() {
        Passageiro comprador = null;

        System.out.println("                                             |              Capitao             |              Copiloto            |              Aeronave           |");
        System.out.println("| N. Voo | Origem          | Destino         | Breve   | Nome                   | Breve   | Nome                   | Numero | Modelo    | Lim. Pass. |");
        System.out.println("+--------+-----------------+-----------------+---------+------------------------+---------+------------------------+--------+-----------+------------+");
        
        for (Voo linha : this.getLinhas()) {
            // imprimir dados do voo, aeronave, piloto e copiloto

            System.out.println(String
                            .format("| %6d | %s | %s | %s | %s | %s | %s | %6d | %s | %10d |", 
                                            linha.getNumero(), 
                                            fillSpacesRight(linha.getOrigem(), 15),
                                            fillSpacesRight(linha.getDestino(), 15),
                                            // capitao
                                            fillSpacesRight(linha.getCapitao().getBreve(), 7),
                                            fillSpacesRight(linha.getCapitao().getNome(), 22),
                                            // copiloto
                                            fillSpacesRight(linha.getCopiloto().getBreve(), 7),
                                            fillSpacesRight(linha.getCopiloto().getNome(), 22),
                                            
                                            // aeronave
                                            linha.getAeronave().getNumeracao(),
                                            fillSpacesRight(linha.getAeronave().getModelo(), 9),
                                            linha.getAeronave().getLimitePassageiros()                                            
                                            ));
            
            for (Passagem reserva : linha.getReservas()) {
                comprador = reserva.getComprador();

                
                
                // imprimir dados reserva e comprador

                for (Bagagem bagagem : comprador.getColBagagens()) {
                    bagagem.getPassageiro();
                    // imprimir dados da bagagem
                }
            }
        }
        
        System.out.println("+--------+-----------------+-----------------+---------+------------------------+---------+------------------------+--------+-----------+------------+");
    }
}
