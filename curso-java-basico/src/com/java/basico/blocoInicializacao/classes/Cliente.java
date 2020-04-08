package com.java.basico.blocoInicializacao.classes;

public class Cliente {
    // Classe feita para entender sobre blocos de inicialização

    /*
     A ideia inicial é imaginar a quantidade de vezes que um cliente pode parcelar determinado produto, ou seja,
     trabalhando com uma ideia de valor fixo
     */

    private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private int[] parcelas2;

    /*
    Em caso de se inicializar vetores com posições grandes fica um trabalho manual árduo, então uma solução é utilizar
    bloco de inicialização que vem antes do construtor ser executado, já que inicializar os valores no construtor mas
    não fica um código bonito porque deve-se manter o construtor limpo.
     */
    {
        //Bloco de inicialização, recomenda-se criar sempre antes do construtor de acordo com as boas práticas mas em
        //qualquer lugar do código o bloco será executado antes do construtor
        System.out.println("Dentro do bloco de inicialização");
        parcelas2 = new int[100];
        // inicializa o vetor parcelas2
        for(int i = 0; i < 100; i++){
            parcelas2[i] = i + 1;
        }
    }

    public int[] getParcelas2() {
        return parcelas2;
    }

    public void setParcelas2(int[] parcelas2) {
        this.parcelas2 = parcelas2;
    }

    public Cliente() {
        System.out.println("Dentro do construtor");
        /*
        Demonstra que antes de executar o construtor já possui os dados inicializados na memória.
        1 - Alocado espaço na memória para objeto que será criado
        2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores inicializados explícitos
        3 - Bloco de inicialização é executado
        4 - O construtor é executado
         */
        for (int parcela : this.parcelas){
            System.out.print(parcela + " ");
        }
        System.out.println("\n");
        for(int parcela : this.parcelas2){
            System.out.print(parcela + " ");
        }
    }
    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
