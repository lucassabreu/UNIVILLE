package exer.b2.n3;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Arranjo {
    public static int MAX_SIZE = 20;

    private Usuario[] values;
    private int       index;

    public Arranjo() {
        this.index = 0;
        this.values = new Usuario[MAX_SIZE];
    }

    /** Adiciona um usuário no final do Arranjo */
    public void add(Usuario usuario) {
        if (usuario == null)
            throw new IllegalArgumentException("É necessário informar um usuário como parâmetro !");

        if (usuario.getCodigo() <= 0 || usuario.getNascimento() == null || usuario
                        .getNome() == null || usuario.getNome().isEmpty() || usuario
                        .getSobrenome() == null || usuario.getSobrenome()
                        .isEmpty())
            throw new IllegalArgumentException("É necessário informar todos os dados do usuário !");

        if (this.index >= this.values.length)
            throw new IndexOutOfBoundsException(String
                            .format("O número máximo de objetos (%d) foi atingido! Não é possível incluir mais.", this.values.length));

        this.values[this.index++] = usuario;
    }

    /**
     * Adiciona um usuário na posição indicada, deslocando todos os outros
     * objetos em uma posição para o final do Arranjo
     */
    public void add(Usuario usuario, int posicao) {

        if (usuario == null)
            throw new IllegalArgumentException("É necessário informar um usuário como parâmetro !");

        if (usuario.getCodigo() <= 0 || usuario.getNascimento() == null || usuario
                        .getNome() == null || usuario.getNome().isEmpty() || usuario
                        .getSobrenome() == null || usuario.getSobrenome()
                        .isEmpty())
            throw new IllegalArgumentException("É necessário informar todos os dados do usuário !");

        if (this.index >= this.values.length)
            throw new IndexOutOfBoundsException("O número máximo de objetos (%d) foi atingido! Não é possível incluir mais.");

        if (posicao < 0 || posicao > this.index)
            throw new IndexOutOfBoundsException(String
                            .format("Posição deve estar entre 0 e %d !", this.index));

        for (int i = this.index; i > posicao; i--)
            this.values[i] = this.values[i - 1];

        this.index++;
        this.values[posicao] = usuario;
    }

    /** Remove do Arranjo o último usuário e o retorna */
    public Usuario remove() {
        if (this.index <= 0)
            throw new IndexOutOfBoundsException("Não existem elementos para serem removidos !");

        return this.values[--this.index];
    }

    /**
     * Remove do Arranjo o usuário da posição indicada, deslocando todos os
     * outros objetos após a posição indica em uma posição em direção ao inicio
     * do Arranjo e retorna o usuário
     */
    public Usuario remove(int posicao) {
        if (posicao < 0 || posicao >= this.index)
            throw new IndexOutOfBoundsException(String
                            .format("Item na posição %d, não existe !", posicao));

        this.index--;
        Usuario elem = this.values[posicao];
        for (int i = posicao; i < this.index; i++)
            this.values[i] = this.values[i + 1];

        return elem;
    }

    /** Retorna um array com todos os usuários do Arranjo */
    public Usuario[] lista() {
        Usuario[] lista = new Usuario[this.index];

        for (int i = 0; i < this.index; i++)
            lista[i] = this.values[i];

        return lista;
    }

    /**
     * Retorna um array com todos os usuários do Arranjo, ordenados pelo
     * atributo código
     */
    public Usuario[] listaPorCodigo() {

        Usuario lista[] = new Usuario[this.index];

        for (int j = 0, i = 0; i < this.index; i++) {
            for (j = 0; j < i; j++) {
                if (this.values[i].getCodigo() < lista[j].getCodigo())
                    break;
            }

            for (int k = i; k > j; k--) {
                lista[k] = lista[k - 1];
            }

            lista[j] = this.values[i];
        }

        return lista;
    }

    /**
     * Retorna um array com todos os usuários do Arranjo, ordenados pelo
     * atributo nome
     */
    public Usuario[] listaPorNome() {
        Usuario lista[] = new Usuario[this.index];

        for (int j = 0, i = 0; i < this.index; i++) {
            for (j = 0; j < i; j++) {
                if (this.values[i].getNome().compareTo(lista[j].getNome()) < 0)
                    break;
            }

            for (int k = i; k > j; k--) {
                lista[k] = lista[k - 1];
            }

            lista[j] = this.values[i];
        }

        return lista;
    }

    /**
     * Retorna um array com todos os usuários do Arranjo, ordenados pelo
     * atributo sobrenome
     */
    public Usuario[] listaPorSobrenome() {
        Usuario lista[] = new Usuario[this.index];

        for (int j = 0, i = 0; i < this.index; i++) {
            for (j = 0; j < i; j++) {
                if (this.values[i].getSobrenome().compareTo(lista[j]
                                .getSobrenome()) < 0)
                    break;
            }

            for (int k = i; k > j; k--) {
                lista[k] = lista[k - 1];
            }

            lista[j] = this.values[i];
        }

        return lista;
    }

    /**
     * Retorna um array com todos os usuários do Arranjo, ordenados pelo
     * atributo nascimento
     */
    public Usuario[] listaPorNascimento() {

        Usuario lista[] = new Usuario[this.index];

        for (int j = 0, i = 0; i < this.index; i++) {
            for (j = 0; j < i; j++) {
                if (this.values[i].getNascimento().compareTo(lista[j]
                                .getNascimento()) < 0)
                    break;
            }

            for (int k = i; k > j; k--) {
                lista[k] = lista[k - 1];
            }

            lista[j] = this.values[i];
        }

        return lista;
    }

    /**
     * Remove todos os objetos do Arranjo, retornando um array com os objetos
     * removidos
     */
    public Usuario[] limpa() {
        Usuario removidos[] = this.lista();
        this.values = new Usuario[MAX_SIZE];
        this.index = 0;
        return removidos;
    }

    public int getTamanho() {
        return this.index;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.lista());
    }

    public static void main(String[] args) {
        Arranjo arr = new Arranjo();
        Usuario u = null;
        GregorianCalendar gc = new GregorianCalendar();
        Usuario us[] = null;

        gc.set(1994, 1, 7);
        u = new Usuario(1, "Lucas", "Abreu", gc.getTime());
        arr.add(u);
        System.out.printf("Adicionado: %s, Arranjo:\n\n", u);

        us = arr.lista();
        System.out.println("Listagem:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        try {
            arr.add(null);
        } catch (Exception e) {
            System.out.printf("\nAdicionado null, retorno: %s\n", e
                            .getMessage());
        }

        gc.set(1996, 2, 13);
        u = new Usuario(2, "Ana", "Abreu", gc.getTime());
        arr.add(u);
        System.out.printf("\nAdicionado: %s, Arranjo:\n\n", u);

        us = arr.lista();
        System.out.println("Listagem:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        System.out.printf("\nRemover ultimo, retorno do metodo: %s\n", arr
                        .remove());

        for (int i = 0; i < 18; i++) {
            gc.set(1996, 3, 18 - i);
            u = new Usuario(i + 3, Character.toString((char) ('A' + (Math
                            .random() * 100 % 26))), Integer.toString(i), gc
                            .getTime());
            arr.add(u);
        }

        System.out.printf("\nAdicionados 18 novos elementos, estado Arranjo:\n\n", arr);

        us = arr.lista();
        System.out.println("Listagem:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        gc.set(1996, 2, 13);
        u = new Usuario(2, "Ana", "Abreu", gc.getTime());
        arr.add(u, 6);
        System.out.printf("\nAdicionado %s na posição 6, Arranjo:\n", u);
        
        us = arr.lista();
        System.out.println("\nListagem:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        try {
            arr.add(new Usuario(21, "Excesso", "Demais", gc.getTime()));
        } catch (Exception e) {
            System.out.printf("\nAdicionar elemento 21, retorno: %s\n", e
                            .getMessage());
        }

        System.out.printf("\nRemover elemento 3, retorno do metodo: %s\n\n", arr
                        .remove(3));

        us = arr.lista();
        System.out.println("Listagem:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        us = arr.listaPorCodigo();
        System.out.println("\nListagem por código:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        us = arr.listaPorNome();
        System.out.println("\nListagem por nome:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        us = arr.listaPorSobrenome();
        System.out.println("\nListagem por sobrenome:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        us = arr.listaPorNascimento();
        System.out.println("\nListagem por nascimento:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        us = arr.limpa();
        System.out.printf("\nArranjo limpo, arranjo: %s \n", Arrays
                        .toString(arr.lista()));
        System.out.println("\nRetorno do método:");
        System.out.println("Codigo | Nome                | Nascimento");
        for (int i = 0; i < us.length; i++) {
            System.out.printf("%6d | %19s | %s\n", us[i].getCodigo(), us[i]
                            .getNome().concat(" ").concat(us[i].getSobrenome()), us[i]
                            .getNascimento());
        }

        try {
            arr.add(new Usuario(1, "Excesso", "Demais", gc.getTime()), 2);
        } catch (Exception e) {
            System.out.printf("\nAdicionar elemento na posição 2, retorno: %s\n", e
                            .getMessage());
        }

        try {
            arr.remove(2);
        } catch (Exception e) {
            System.out.printf("\nRemovendo elemento na posição 2, retorno: %s\n", e
                            .getMessage());
        }
    }
}
