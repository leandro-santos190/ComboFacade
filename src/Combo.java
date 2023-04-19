public class Combo {

    Burger b = new Burger();
    Sobremesa s = new Sobremesa();
    Bebida bb = new Bebida();




    public void CriarCombo(int tipo){

        if(tipo==1){
            b.setDescricao("250 gramas de Hamburger");
            b.setPreco(25);
            b.setGramas(250);
            s.setDescricao("Pudim");
            s.setPreco(15);
            s.setTamanho("Grande");
            bb.setDescricao("Suco de Laranja");
            bb.setPreco(10);
            bb.setMl(450);
        }else{
            b.setDescricao("550 gramas de Hamburger");
            b.setPreco(55);
            b.setGramas(550);
            s.setDescricao("Petit gateau");
            s.setPreco(35);
            s.setTamanho("Gigante");
            bb.setDescricao("Suco de Limao");
            bb.setPreco(20);
            bb.setMl(1000);

        }

        System.out.println("Sua escolha foi :\nBurger: "+ b.getDescricao()+"\nPreco: "+b.getPreco()+"\nGramas: "+b.getGramas() + "\n\nSobremesa:"+s.getDescricao()+"\nPreço: "+s.getPreco()+"\nTamanho: "+s.getTamanho()+"\n\nBebida: "+bb.getDescricao()+"\nPreço: "+bb.getPreco()+"\nML: "+bb.getMl());

    }





}
