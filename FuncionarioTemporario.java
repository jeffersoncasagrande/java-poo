
package exemplooo.etapa2;

public class FuncionarioTemporario {
    
    public int Codigo;
    public double salarioBase;
    public int anosContratacao;

    public FuncionarioConcursado(int codigo, double salarioBase, int anosContratacao) {
        this.codigo = codigo;
        this.salarioBase = salarioBase;
        this.anosContratacao = anosContratacao;
    }
    
    public void imprimeDados(){
        
        System.out.println("===FUNCIONARIO TEMPORARIO===");
        System.out.println("CODIGO: " + this.codigo);
        System.out.println("SALARIOBASE: " + this.salarioBase);
        System.out.println("ANOSCONTRATACAO " + this.anos);
        System.out.println("GRATIFICACAO: " + this.gratificacao());
        
    }
    
    public double gratificacao(){
        return this.anos*15;
    }
    
}
