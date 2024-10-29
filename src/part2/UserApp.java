package part2;

import part2.UserView;
import part2.UserViewModel;

public class UserApp {
    public static void main(String[] args) {
        UserViewModel viewModel = new UserViewModel();
        UserView view = new UserView(viewModel);
        view.displayMenu();
    }
}