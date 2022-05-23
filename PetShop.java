public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Bolinha";
        cachorro.idade = 10;
        cachorro.raca = "Abc";
        cachorro.sexo = "Macho";

        System.out.println("Nome:" + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);
    }
}
