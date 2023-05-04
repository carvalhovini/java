
public class Main {
    public static void main(String[] args) {
        StringDNA dna1 = new StringDNA("CATGATTAG");
        System.out.println("String original: " + dna1.paraString());
        System.out.println("Comprimento da string: " + dna1.tamanho());
        System.out.println("Caractere na posição 3: " + dna1.caractereEm(3));
        System.out.println("Quantidade de A's: " + dna1.quantosA());
        System.out.println("Quantidade de C's: " + dna1.quantosC());
        System.out.println("Quantidade de G's: " + dna1.quantosG());
        System.out.println("Quantidade de T's: " + dna1.quantosT());
        System.out.println("Reverso complementar: " + dna1.reversoComplementar().paraString());

        StringDNA dna2 = new StringDNA("ATTCCG");
        System.out.println("Valor de comparação: " + dna1.compara(dna2));
    }
}