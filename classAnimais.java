package herançaanimal;


public class Animais {
    
    String nomeAnimal;
    String tipoAlimentoAnimal;
    String sexoAnimal;
    String racaAnimal;

    public Animais() {
    }

    public Animais(String nomeAnimal, String tipoAlimentoAnimal, String sexoAnimal, String racaAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.tipoAlimentoAnimal = tipoAlimentoAnimal;
        this.sexoAnimal = sexoAnimal;
        this.racaAnimal = racaAnimal;
    }

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
    
    
}
