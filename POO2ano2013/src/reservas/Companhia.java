package reservas;

import java.util.ArrayList;

import clientes.Passagem;

public class Companhia {
	private ArrayList<Piloto> funcionarios
	= new ArrayList<Piloto>();

	private ArrayList<Voo> linhas
	= new ArrayList<Voo>();

	private ArrayList<Aeronave> frota 
	= new ArrayList<Aeronave>();


	public static void main(String[] args) {
		Companhia bol = new Companhia();
		Voo v1 = new Voo();
		v1.setNumero(755);
		v1.setOrigem("Joinville-SC");
		v1.setDestino("Congonhas-SP");

		bol.getLinhas().add(v1);



		Piloto p1 = new Piloto();
		p1.setNome("Capitão Caverna");
		p1.setBreve("45rtyu89");

		Piloto p2 = new Piloto();
		p2.setNome("Capitão Nascimento");
		p2.setBreve("989898908");

		v1.setCapitao(p1);
		v1.setCopiloto(p2);

		Passagem pass1 = new Passagem(101);
		Passagem pass2 = new Passagem(102);
		Passagem pass3 = new Passagem(103);
		
		v1.getReservas().add(pass1);
		v1.getReservas().add(pass2);
		v1.getReservas().add(pass3);

		bol.listagemDeLinhas();


	}


	public void listagemDeLinhas(){

		for(Voo umVoo:linhas){
			System.out.println("Numero: " + umVoo.getNumero());
			System.out.println("Origem: " + umVoo.getOrigem());
			//			System.out.println(umVoo.getAeronave().getModelo());

			if(umVoo.getCapitao() != null){
				System.out.println("Capitão: " + 
						umVoo.getCapitao().getNome());
				System.out.println("Breve: " + 
						umVoo.getCapitao().getBreve());
			}
			//IMPLEMENTAR O CODIGO PARA MOSTRAR O COPILOTO
			
			for(Passagem umaPassagem:umVoo.getReservas()){
				System.out.println("Passagem Num: " +
						umaPassagem.getAssento());
			}
			
		}

	}



	public ArrayList<Piloto> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Piloto> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Voo> getLinhas() {
		return linhas;
	}

	public void setLinhas(ArrayList<Voo> linhas) {
		this.linhas = linhas;
	}

	public ArrayList<Aeronave> getFrota() {
		return frota;
	}

	public void setFrota(ArrayList<Aeronave> frota) {
		this.frota = frota;
	}


}
