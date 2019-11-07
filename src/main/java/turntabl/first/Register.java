package turntabl.first;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<? extends Client> clients;

    public Register(List<? extends Client> clients) {
        this.clients = clients;
    }


    public List<String> getAllContactNames() {
        return this.clients
                .stream()
                .map(Client::getName)
                .collect(Collectors.toList());
    }


    public List<String> getGoldNames(){
        List<String>goldClients = new ArrayList<>();
        for (Client name : clients) {
            if (name.service_level == Level.GOLD) {
                goldClients.add(name.name);

            }


        }


        return goldClients;
    }
}
