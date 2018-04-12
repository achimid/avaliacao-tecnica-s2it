package br.com.lourran;

public class MainApp {


    public static void main(String[] args) {

        int soma = AppUtil.getInstance().somaNoArvore(mockArvore());
        System.out.println("Soma: " + soma);

    }


    // Inicializando arvore exemplo
    private static BinaryTree mockArvore(){
        BinaryTree base = new BinaryTree(1);
        BinaryTree n1 = new BinaryTree(2);
        BinaryTree n2 = new BinaryTree(3);
        BinaryTree n3 = new BinaryTree(4);
        BinaryTree n4 = new BinaryTree(5);

        base.setLeft(n1);
        base.setRight(n2);

        n1.setLeft(n3);
        n1.setRight(n4);

        return base;
    }

}
