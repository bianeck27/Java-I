class Data{
    int dia;
    int mes;
    int ano;

    void preencheData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    String getFormatada(){
        
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
    
}
class Funcionario{
    String nome;
    int rg;
    String departamento;
    double salario;
    Data dataEntrada = new Data();

    void recebeAumento(double aumento){
        this.salario += aumento;
    }

    double calculaGanhoAnual(){
        double ganho = this.salario * 12;
        return ganho;
    }



    void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salário: "+this.salario);
        System.out.println("Data de Entrada: "+this.dataEntrada.getFormatada());
    }


}

class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario thiago = new Funcionario();

        thiago.nome = "Thiago Moreira Bianeck";
        thiago.departamento = "Desenvolvimento";
        thiago.rg = 146489125;
        thiago.salario = 1000.0;
        thiago.dataEntrada.preencheData(27, 3, 2017);
        System.out.println(thiago.salario);
        thiago.recebeAumento(150.0);
        System.out.println(thiago.salario);
        System.out.println(thiago.calculaGanhoAnual());

        thiago.mostra();
        

    }
}