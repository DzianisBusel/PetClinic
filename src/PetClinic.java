import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PetClinic {

    private String name;
    private HashMap<Client, HashSet<Pet>> clients = new HashMap<>();

    public PetClinic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClient(Client client) {
        if (clients.containsKey(client)) {
            System.out.println(client + " - такой клиент уже есть в базе");
        } else {
            clients.put(client, new HashSet<>());
        }
    }

    public void addPetToClient(Client client, Pet pet) {
        if (!clients.containsKey(client)) {
            addClient(client);
        }
        if (clients.get(client).contains(pet)) {
            System.out.println("Животное - " + pet + ", уже есть в базе клиента - " + client);
        } else {
            clients.get(client).add(pet);
        }
    }

    public void getAllClients() {
//        for (Map.Entry<Client, HashSet<Pet>> info : clients.entrySet()) {
//            System.out.println(info);
//        }
//    }

        StringBuilder result = new StringBuilder();
        for (Client client : clients.keySet()) {
            result.append(client).append(" (");
           if(clients.get(client).size() != 0) {
                for (Pet pet : clients.get(client)) {
                    result.append(pet).append(", ");
                }
                result.delete(result.length() - 2, result.length());
                result.append(")\n");
            }
            else {
               result.delete(result.length() - 1, result.length());
                result.append(" - животных не имеет!\n");
            }
        }
        System.out.println(result);
    }
}
