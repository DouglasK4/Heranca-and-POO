package herançaanimal;

public class Mamiferos extends Animais {
    

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getTipoAlimentoAnimal() {
        return tipoAlimentoAnimal;
    }

    public void setTipoAlimentoAnimal(String tipoAlimentoAnimal) {
        this.tipoAlimentoAnimal = tipoAlimentoAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }
    
    public void filhotes(String sexo){
        if(sexo.equalsIgnoreCase("feminino")){
            System.out.println("Mamifero Feminino Pode dar crias");
        }else if(sexo.equalsIgnoreCase("masculino")){
            System.out.println("Mamifero masculino não pode dar crias");
        }else{
            System.out.println("Sexo Invalido, Tente novamente");
        }
    }
    
}
