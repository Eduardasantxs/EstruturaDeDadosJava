public class ListaEncadeada {

     Nó inicioLista;

    public  ListaEncadeada(){
        inicioLista = null;
    }

    public boolean ListaVazia(){
        if(this.inicioLista==null){
            return  true;
        }else {
            return false;
        }
    }

    public  void  AdicionarInicio(int e){
        Nó novo = new Nó(e);
        if(!ListaVazia()){
            novo.proximo_no = inicioLista;
        }
        inicioLista = novo;
    }

    public  void  AdicionarFinal(int e){
        Nó novo = new Nó(e);
        if(ListaVazia()){
            inicioLista = novo;
        }else{
            Nó auxiliar = inicioLista;
            while (auxiliar.proximo_no!=null){
                auxiliar = auxiliar.proximo_no;
            }
            auxiliar.proximo_no = novo;
        }
    }

    public Nó RemoverInicio(){
        Nó removido = null;
        if(ListaVazia()){
            System.out.println("Estrutura vazia");
        }else{
            removido = inicioLista;
            inicioLista = inicioLista.proximo_no;
        }
        return removido;
    }

    public  Nó RemoverFinal(){
        Nó removido = null;
        Nó auxiliar;
        if(ListaVazia()){
            System.out.println("estrutura vazia");
        }else{
            removido = auxiliar = inicioLista;
            while (removido.proximo_no!=null){
                auxiliar = removido;
                removido = removido.proximo_no;
            }
            auxiliar.proximo_no = null;
        }
        return removido;
    }

    public void AdicionarPosicao(int e,int i){
        if(ListaVazia() || i<=0){
            AdicionarInicio(e);
        }else{
            Nó novo = new Nó(e);
            Nó auxiliar = inicioLista;
            int indice = 0;
            while(indice<i && auxiliar!=null){
                auxiliar = auxiliar.proximo_no;
                indice = indice + 1;
            }
            if(auxiliar==null){
                AdicionarFinal(e);
            }else{
                novo.proximo_no = auxiliar.proximo_no;
                auxiliar.proximo_no = novo;
            }
        }
    }


    public Nó removerPosicao(int i){
        Nó removido = null;
        Nó auxiliar;
        int indice =0;
        if(ListaVazia() || i<=0){
            removido = RemoverInicio();
        }else{
            removido = auxiliar = inicioLista;

            while (indice<i && removido!=null){
                auxiliar = removido;
                removido = removido.proximo_no;
                indice++;
            }
            if(removido==null){
                removido = RemoverFinal();
            }else{
                auxiliar.proximo_no = removido.proximo_no;
            }
        }
        return removido;
    }



    //----------------------------------------------------------
    public  Nó ultimoElemento(){

        Nó ult =this.RemoverFinal();
        int x = ult.elemento_armazenado;
        this.AdicionarFinal(x);

        return   ult;
    }

    public  Nó penultimoElemento(){

        Nó ult =this.RemoverFinal();
        Nó penu =this.RemoverFinal();
        int valorUlt = ult.elemento_armazenado;
        int valorPenu = penu.elemento_armazenado;
        this.AdicionarFinal(valorPenu);
        this.AdicionarFinal(valorUlt);

        return penu;
    }

    public Nó retornarPosicao(int pos){

       Nó removido = this.removerPosicao(pos);
       int posicaoElemento = removido.elemento_armazenado;
       this.AdicionarPosicao(posicaoElemento,pos);
       return removido;
    }

    public  void  inverterLista(){

        Nó noAtual;
        int cont = 0;
        int contInver = 0;
        noAtual = inicioLista;

        while(noAtual != null){
            cont++;
            noAtual = noAtual.proximo_no;

        }

        for(int i = cont;i>0;i--){

            Nó ultimo = removerPosicao(i);
            int elem = ultimo.elemento_armazenado;
            this.AdicionarPosicao(elem,contInver);
            contInver++;
        }

    }

}
