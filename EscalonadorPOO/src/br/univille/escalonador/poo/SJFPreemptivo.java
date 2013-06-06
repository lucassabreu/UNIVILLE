package br.univille.escalonador.poo;

public class SJFPreemptivo {
    public static void main(String[] args) {
        Processo processos[] = new Processo[10];

        processos[0] = new Processo("P0", 0, 10);
        processos[1] = new Processo("P1", 2, 12);
        processos[2] = new Processo("P2", 5, 8);
        processos[3] = new Processo("P3", 12, 10);
        processos[4] = new Processo("P4", 17, 20);
        processos[5] = new Processo("P5", 25, 9);
        processos[6] = new Processo("P6", 32, 4);
        processos[7] = new Processo("P7", 35, 13);
        processos[8] = new Processo("P8", 37, 7);
        processos[9] = new Processo("P9", 40, 17);

        int tempo = 0;
        int tempoTotalExec = 0;

        Processo processoExec = null;

        // eu realizei a acumulação do tempo antes de fazer o while... o sor
        // não.
        for (Processo p : processos)
            tempoTotalExec += p.tempoExecucao;

        while (tempo < tempoTotalExec) { // o professor colocou apenas 1000

            System.out.println(String.format("Tempo: %d", tempo));

            for (int i = 0; i < processos.length; i++) {
                if (tempo == processos[i].tempoChegada) {
                    System.out.println(String
                                    .format("    Chegou: %s", processos[i].nome));
                    processoExec = processos[i];
                }
            }

            processoExec.tempoExecucao--;
            tempo++;
        }
    }
}
