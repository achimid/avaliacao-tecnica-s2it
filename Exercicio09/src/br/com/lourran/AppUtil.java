package br.com.lourran;

public class AppUtil {
    private static AppUtil ourInstance = new AppUtil();

    public static AppUtil getInstance() {
        return ourInstance;
    }

    private AppUtil() {
    }

    public int somaNoArvore(BinaryTree noArvore){
        return somaNoArvoreRecursivo(noArvore, 0);
    }

    private int somaNoArvoreRecursivo(BinaryTree noArvore, int soma){
        soma += noArvore.getValor();

        if(noArvore.getLeft() != null)
            soma = somaNoArvoreRecursivo(noArvore.getLeft(), soma);
        if(noArvore.getRight() != null)
            soma = somaNoArvoreRecursivo(noArvore.getRight(), soma);

        return soma;
    }
}
