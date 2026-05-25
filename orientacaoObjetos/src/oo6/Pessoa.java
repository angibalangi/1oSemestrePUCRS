package oo6;
public class Pessoa
{
    private String nome, endereco, cidade;
    private int dia,mes,ano,cpf,rg;
    
    public Pessoa(String nome1,String endereco1,String cidade1,int dia1,int mes1, int ano1, int cpf1, int rg1)
    {
        setNome(nome1);
        setEndereco(endereco1);
        setCidade(cidade1);
        setDia(dia1);
        setmes(mes1);
        setAno(ano1);
        setCpf(cpf1);
        setRg(rg1);
                        
    }
        public void setNome(String nome1){ nome=nome1;}
        public void setEndereco(String endereco1){endereco=endereco1;}
        public void setCidade(String cidade1){cidade=cidade1;}
        public void setDia(int dia1){dia=dia1;}
        public void setmes(int mes1){mes=mes1;}
        public void setAno(int ano1){ano=ano1;}
        public void setCpf(int cpf1) {cpf=cpf1;}
        public void setRg(int rg1){rg=rg1;}
        
        
        public String getNome(){ return nome;}
        public String getEndereco(){return endereco;}
        public String getCidade(){return cidade;}
        public int getDia(){return dia;}
        public int getmes(){return mes;}
        public int getAno(){return ano;}
        public int getCpf() {return cpf;}
        public int getRg(){return rg;}
        
        
        public String toString () { 
        String aux1,aux2;
        
            return "\n Nome: "+ nome+ "\n Endereço: "+ endereco+ "\n RG: "+rg+ "\n CPF: "+ cpf+ "\n Data de nascimento: "+dia+"/"+mes+"/"+ano +
                   "\n Cidade onde nasceu: "+ cidade;
        }
        }

