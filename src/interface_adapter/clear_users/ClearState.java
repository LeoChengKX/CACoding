package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> users;

    public ClearState(ClearState copy) {
        users = copy.users;
    }
    public ClearState () {}

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

}
