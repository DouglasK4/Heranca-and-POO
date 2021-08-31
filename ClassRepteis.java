package herançaanimal;

public class Repteis extends Animais {
    
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
    
    public void porOvos(String sexo){
        if(sexo.equalsIgnoreCase("feminino")){
            System.out.println("Réptil feminino que poem ovos");
        }else if(sexo.equalsIgnoreCase("masculino")){
            System.out.println("Réptil Masculino que nao poem ovos");
        }else{
            System.out.println("algo errado, tente novamente");
        }
    }
    
}
