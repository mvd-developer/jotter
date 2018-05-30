package mvd.com.domain;

import mvd.com.data.entity.User;
import mvd.com.domain.entity.UserModel;

public class GetUserUseCase {

    public UserModel getUserFromDB(int userName){
        User user = new User();
        user.setName("Hello, world!");
        return new UserModel(user);
    }
}
