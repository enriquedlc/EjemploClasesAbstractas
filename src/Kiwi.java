import com.sun.security.jgss.GSSUtil;

public class Kiwi extends LivingBeing {

    public Kiwi(String name) {
        System.out.println("Kiwi " + name + " in process");
        setName(name);
    }

    @Override
    public void born() {
        System.out.println(getName() + " --> Breaking my egg");
        System.out.println(getName() + " --> Oppening my eyes");
        setHealth(100);
    }

    @Override
    public void nourish() {
        if (getHealth() == 100) {
            System.out.println(getName() + " -> Mira con desprecio a los bichos y pasa de largo"); // para cuando la saluda está completa (100)
        } else {
            System.out.println(getName() + " mmmmmmm qué oruga mas sabrosa");
            System.out.println(" ñam ñam ");
            setHealth(getHealth() + 1); // estamos actualizando el valor de health usando el set para sumarle el health en ese instante (getHealth)
        }
    }

    @Override
    public String communicate(LivingBeing interlucutor, String message) {
        if (interlucutor instanceof Kiwi) { // instance of que el objeto sea kiwi, si el interlocutor es kiwi, hablamos con el, eso es lo que hace el operador
            System.out.println(getName() + " says: --> " + message);
            System.out.println(interlucutor.getName() + "  says: --> ajá ");
        } else {
            System.out.println(getName() + " says: --> $@&~($%%&* ");
            System.out.println(interlucutor.getName() + " Piensa... estos kiwis... ");
        }

        setHealth(getHealth() - 10);
        return null;
    }

    @Override
    public LivingBeing reproduction(LivingBeing partner) {
        if (partner.equals(this)) {
            System.out.println("La cociencia de " +  getName() + " le dice: si no 34 esto es muy raro " );
            return null;
        }
        if (partner instanceof LivingBeing) {
            System.out.println("Se apagan las luces ....");
        return new Kiwi("Bebe");
    } else{
        System.out.println("Acabo de salir de un relacion");
        System.out.println("ok");
        return null;
    }
}

    @Override
    public void die() {
        setHealth(0);
        System.out.println("En el suelo " + getName() + " que vivio una vida plena");
    }
}
