package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary clearOutputBoundary)
    {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute(ClearInputData clearInputData) {
        ArrayList<String> users = userDataAccessObject.getUserNames();
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
