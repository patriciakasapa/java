package turntabl.first;

import java.util.AbstractCollection;

public class PrivateClient extends Client {

    public PrivateClient(String name, int client_ID, Level service_level) {
        super(name, client_ID, service_level);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getClient_ID() {
        return super.getClient_ID();
    }
}
