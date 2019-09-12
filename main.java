package ex_1;
public class Ex_1 {

    public static void main(String[] args) {
       Pessoa[] p =new Pessoa[2];
       Livro[] l = new Livro[2];
       
       p[0]=new Pessoa("Gabriel", 24, "M");
       p[1] = new Pessoa("nathalia", 22, "F");
       
       l[0]=new Livro("maus", "arth", 300, p[0]);
       
        System.out.println(l[0].detalhe());
    }
    
}
