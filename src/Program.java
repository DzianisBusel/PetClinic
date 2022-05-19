public class Program {
    public static void main(String[] args) {
        Pet cat = new Pet("Барсик", 12,"man");
        Pet dog = new Pet("Шарик", 10,"man");
        Pet parrot = new Pet("Кеша", 5, "man");

        Client client = new Client("Геннадий", "Молодец");
        Client client2 = new Client("Григорий", "Неоч");
        Client client3 = new Client("Саша", "Туз");

        PetClinic clinic = new PetClinic("Вет. клиника");

        clinic.addPetToClient(client,cat);
        clinic.addPetToClient(client,dog);
        clinic.addPetToClient(client,dog);
        clinic.addPetToClient(client,parrot);

        clinic.addClient(client2);
        clinic.addClient(client2);
        clinic.addClient(client3);

        clinic.addPetToClient(client2,dog);
        clinic.addPetToClient(client2,cat);
        clinic.addPetToClient(client2,parrot);

        clinic.getAllClients();

    }
}
