package use_case.clear_users;

// TODO Complete me

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class ClearOutputData {
    final ArrayList<String> users;

    public ClearOutputData(ArrayList<String> users) {
        this.users = users;
    }

    public ArrayList<String> getUsers() {
        return users;
    }
}
