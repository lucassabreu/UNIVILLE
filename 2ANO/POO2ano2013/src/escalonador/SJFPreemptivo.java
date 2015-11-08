package escalonador;

public class SJFPreemptivo {

	// MODIFICADOR tiporetorno nomemetodo(parametros){ corpo } 
	// escopo de classe
	Processo[] processos = new Processo[10];
	
	public void algoritmo(){
		

		processos[0] = new Processo("p0", 0, 15);
		processos[1] = new Processo("p1",2,12);
		processos[2] = new Processo("p2", 5, 8);
		processos[3] = new Processo("p3", 12, 10);
		processos[4] = new Processo("p4", 17, 20);
		processos[5] = new Processo("p5", 25, 9);
		processos[6] = new Processo("p6", 32, 4);
		processos[7] = new Processo("p7", 35, 13);
		processos[8] = new Processo("p8", 37, 7);
		processos[9] = new Processo("p9", 40, 17);


		int tempo = 0;
		int numProcChegaram=0;
		Processo processoExec = null;
		while(tempo < 1000){
			System.out.println("Tempo: " + tempo);

			for(int i=0;i<10;i++){
				if(tempo == processos[i].tempoChegada){
					System.out.println("   Chegou:" +
							processos[i].nome);

					numProcChegaram ++;
					
					//aqui na variavel PROCmenortempo
					processoExec = buscaProcMenorTempo(i);
					break;
				}
			}
			
			if(numProcChegaram == 10){
				processoExec = buscaProcMenorTempo(9);
			}
			
			if(processoExec != null){
				if(processoExec.tempoExec > 0)
					processoExec.tempoExec--;

				System.out.println("##"+
						processoExec.nome + 
						" tempo: " +
						processoExec.tempoExec
						);

			}
			tempo++;
		}
	}
	
	
	public Processo buscaProcMenorTempo(int i){
		
		int menorTempo = processos[i].tempoExec;
		Processo procMenorTempo = processos[i];
		for(int j=i;j>=0;j--){
			if(processos[j].tempoExec > 0 &&
					menorTempo >	processos[j].tempoExec){

				menorTempo = processos[j].tempoExec;
				procMenorTempo = processos[j];
			}
		}
		
		return procMenorTempo;
	}

	public static void main(String[] args) {
		//instanciar...
		SJFPreemptivo sjf = new SJFPreemptivo();
		sjf.algoritmo();

	}
}
