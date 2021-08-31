package herançaanimal;

public class AnimaisMain {
    public static void main(String[] args) {       
        Mamiferos mamifero = new Mamiferos();
        Aves ave = new Aves();
        Repteis reptil = new Repteis();
        
        
        //Mamiferos
        mamifero.setNomeAnimal("Elefante");
        mamifero.setRacaAnimal("Mamifero");
        mamifero.setSexoAnimal("Feminino");
        mamifero.setTipoAlimentoAnimal("Dieta de Plantas/Herbivaro");
        System.out.println("Nome Animal: " + mamifero.getNomeAnimal());
        System.out.println("Tipo de especie: " + mamifero.getRacaAnimal());
        System.out.println("Tipo De Sexo: " + mamifero.sexoAnimal);
        System.out.println("Tipo de Alimentação: " + mamifero.tipoAlimentoAnimal);
        mamifero.filhotes(mamifero.sexoAnimal);
        
        System.out.println("\n \n \n \n \n \n \n");
        
        //aves
        ave.setNomeAnimal("Pinguim");
        ave.setRacaAnimal("Aves");
        ave.setSexoAnimal("masculino");
        ave.setTipoAlimentoAnimal("Carnivoros");
        System.out.println("Nome Animal: " + ave.getNomeAnimal());
        System.out.println("Tipo de Especie: " + ave.getRacaAnimal());
        System.out.println("Tipo de Sexo: " + ave.getSexoAnimal());
        System.out.println("Tipo de Alimentação: " + ave.getTipoAlimentoAnimal());       
        ave.voar(ave.nomeAnimal);
        
        System.out.println("\n \n \n \n \n \n \n");
        
        //aves
        
        reptil.setNomeAnimal("Jacaré");
        reptil.setRacaAnimal("Aves");
        reptil.setSexoAnimal("masculino");
        reptil.setTipoAlimentoAnimal("Carnivoro");
        System.out.println("Nome Animal: " + ave.getNomeAnimal());
        System.out.println("Tipo de Especie: " + ave.getRacaAnimal());
        System.out.println("Tipo de Sexo: " + ave.getSexoAnimal());
        System.out.println("Tipo de alimentação" + ave.getTipoAlimentoAnimal());
        reptil.porOvos(reptil.getSexoAnimal());
        
        
    }
    
}
