package dz_2.tasks;

public interface Pets extends Animal {
    String name();
    String breed();
    String vaccinations();
    String coatColor();
    String dateOfBD();

    Object showAffection();
}
