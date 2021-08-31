package herançaanimal;

public class Aves extends Animais{
    
    Animais animal = new Animais();

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
    
    public void voar(String nome){
        animal.setNomeAnimal(nome);
        if(animal.getNomeAnimal().equalsIgnoreCase("galinha") || animal.getNomeAnimal().equalsIgnoreCase("pinguim") || animal.getNomeAnimal().equalsIgnoreCase("avestruz") || animal.getNomeAnimal().equalsIgnoreCase("ema")){
            System.out.println("Impossivel voar");
        }else{
            System.out.println("Pode Voar");
        }
    }
}
