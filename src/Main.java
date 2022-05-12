public class Main {
    public static void main(String[] args) {
        Kiwi newKiwi = new Kiwi("Lucas"); // se utiliza el get name porque al instanciarlo le damos el valor de nombre

        newKiwi.born();
        System.out.println("La salud de " + newKiwi.getName() + " es " + newKiwi.getHealth());
        newKiwi.nourish();

        Kiwi maria = new Kiwi("Maria");
        maria.born();

        newKiwi.communicate(maria,"Holi... ¿eres nuevo nueva en el barrio?");

        maria.communicate(newKiwi, "eres feo");

        System.out.println("La salud de " + newKiwi.getName() + " es " + newKiwi.getHealth());

        newKiwi.nourish();

        System.out.println("La salud de " + newKiwi.getName() + " es " + newKiwi.getHealth());

        Kiwi churumbel = (Kiwi) newKiwi.reproduction(newKiwi);

        Kiwi hermanito = (Kiwi) newKiwi.reproduction(maria);

        newKiwi.die();

    }
}
