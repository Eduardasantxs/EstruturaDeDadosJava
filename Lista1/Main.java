public class Main {

    public static void main(String[] args) throws Exception {

        /*
        Lista t = new Lista(5);
        System.out.println(t.listaCheia());
        System.out.println(t.listaVazia());
        t.adicionarInicio(1);
        t.adicionarInicio(2);
        t.adicionarInicio(3);
        System.out.println(t.numeroElementos);
        System.out.println(t.listaCheia());
        System.out.println(t.listaVazia());
        t.adicionarFinal(4);
        System.out.println(t.numeroElementos);
        System.out.println(t.listaCheia());
        System.out.println(t.listaVazia());
        t.removerFinal();
        System.out.println(t.numeroElementos);
        t.removerInicio();
        System.out.println(t.numeroElementos);
        t.adicionarPosicao(10,3);
        System.out.println(t.numeroElementos);
        t.removerPosicao(0);
        System.out.println(t.numeroElementos);
        t.adicionarInicio(0);
        t.adicionarInicio(0);
        t.adicionarInicio(0);
        System.out.println(t.numeroElementos);
        System.out.println(t.listaCheia());
        t.removerInicio();
        t.removerInicio();
        t.removerInicio();
        t.removerInicio();
        t.removerInicio();
        System.out.println(t.numeroElementos);
        System.out.println(t.listaVazia());
         */

        Lista l = new Lista(10);
        l.adicionarInicio(1);
        l.adicionarInicio(8);
        l.adicionarInicio(8);
        l.adicionarInicio(8);
        l.adicionarInicio(4);
        l.adicionarInicio(3);
        l.adicionarInicio(3);
        l.adicionarInicio(1);
        l.adicionarInicio(3);
        l.adicionarInicio(1);

        l.removerRepetidos();
        l.verLista();

    }

}
