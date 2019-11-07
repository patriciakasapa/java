package turntabl.first;

import java.util.ArrayList;

public class CorporateClient extends Client {
    private String name_of_account_manager;

    public CorporateClient(String name, int client_ID, Level service_level, String name_of_account_manager) {
        super(name, client_ID, service_level);
        this.name_of_account_manager = name_of_account_manager;
    }

    @Override
    public String getName() {
        return this.name_of_account_manager;
    }

    @Override
    public int getClient_ID() {
        return super.getClient_ID();
    }

}

