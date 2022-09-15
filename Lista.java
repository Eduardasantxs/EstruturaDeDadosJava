public class Lista {

     private int[] vetorElementos;
    private int numeroElementos;

    public Lista(int capacidade){
        this.numeroElementos = 0;
        this.vetorElementos = new int[capacidade];
    }


    public boolean listaVazia(){
        if (this.numeroElementos==0){
            return true;
        }else{
            return  false;
        }
    }

    public boolean listaCheia(){
        if (this.numeroElementos>=this.vetorElementos.length){
            return true;
        }else{
            return false;
        }
    }

    public void adicionarFinal(int elem){
            if(listaCheia()){
                System.out.println("estrutura cheia");
            }else{
                int indice = this.numeroElementos;
                this.vetorElementos[indice] =elem;
                this.numeroElementos = numeroElementos + 1;
            }
    }



    public  int  removerFinal() throws Exception {

        if (listaVazia()) {
            throw new Exception("estrutura vazia");
        } else {
            int indice = this.numeroElementos - 1;
            int elementoRemovido = this.vetorElementos[indice];
            this.numeroElementos =  indice;
            return  elementoRemovido;
        }

    }

    public void adicionarInicio(int elem){
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            for(int indice = this.numeroElementos;indice>0;indice--){
                this.vetorElementos[indice] = this.vetorElementos[indice-1];
            }
            this.vetorElementos[0] = elem;
            this.numeroElementos ++;
        }
    }

    public  int removerInicio() throws Exception {
        if(listaVazia()){
            throw new Exception("estrutura vazia");
        }else{
            int elementoRemovido = this.vetorElementos[0];
            for(int indice =1;indice<this.numeroElementos;indice++){
                this.vetorElementos[indice-1] = this.vetorElementos[indice];
            }
            this.numeroElementos --;
            return  elementoRemovido;
        }
    }

    public void  adicionarPosicao(int elem, int i)  {
        if(listaCheia()){
            System.out.println("estrutura cheia");
        }else{
            if(i<=0){
                this.adicionarInicio(elem);
            }else if(i>=numeroElementos){
                this.adicionarFinal(elem);
            }else{
                for(int indice=this.numeroElementos;indice>i;indice--){
                    this.vetorElementos[indice] = this.vetorElementos[indice-1];
                }
                this.vetorElementos[i] = elem;
                this.numeroElementos ++;
            }
        }
    }

    public  int removerPosicao(int i) throws  Exception{
        if(listaVazia()){
            throw new Exception("estrutura vazia");
        }else{
            if(i<=0){
                return this.removerInicio();
            }else if(i>=this.numeroElementos){
                return this.removerFinal();
            }else{
                int elementoRemovido = this.vetorElementos[i];
                for(int indice =i;indice<this.numeroElementos-1;indice++){
                    this.vetorElementos[indice] = this.vetorElementos[indice+1];
                }
                this.numeroElementos --;
                return  elementoRemovido;

            }
        }
    }
    //----------------------------------------------------------------------------------------------------------
    public int meioVetor() throws Exception   {

        int indice = 0;

        if(this.numeroElementos%2==1){
            indice = (this.numeroElementos-1)/2;
            return this.verPosicao(indice);
        }else{
            throw new Exception("quantidade par de elementos");
        }

    }

    public void trocarPrimComUlti() throws Exception {
        if(!listaVazia()){
            int primeiro = this.removerInicio();
            int ultimo = this.removerFinal();
            this.adicionarInicio(ultimo);
            this.adicionarFinal(primeiro);
        }else{
            throw new Exception("lista vazia");
        }

    }

    public int verPosicao(int pos) throws Exception{

        int posicaoElemento = this.removerPosicao(pos);
        this.adicionarPosicao(posicaoElemento,pos);

      if(pos>numeroElementos-1 && numeroElementos!=0){
          throw new Exception("posicao invalida");
      }else{
          if(!listaVazia()){
              return posicaoElemento;
          }else {
              throw new Exception("lista vazia");
          }
      }

    }

    public  void inverterLista() throws Exception {

        int  fim;
        int cont =0;
        for(int i = this.numeroElementos-1 ;i>=0;i--){

            fim= this.removerFinal();

            this.adicionarPosicao(fim,cont);

            cont++;
        }

    }

    public  void removerRepetidos() throws Exception {

        int elem;
        int ind;

        for(int i = 0;i<=this.numeroElementos-1;i++){

            elem = verPosicao(i);

            for(ind = i+1;ind<this.numeroElementos;ind++){

                if(elem==this.verPosicao(ind)){
                    this.removerPosicao(ind);
                    ind--;
                }

            }

        }
    }


    public  void verLista() throws Exception {
        for(int indice =0;indice<this.numeroElementos;indice++){
            System.out.println(this.verPosicao(indice));
        }
    }

}


