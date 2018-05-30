package mvd.com.domain.entity;

import java.util.UUID;

import mvd.com.data.entity.User;

public class UserModel {
    private UUID uuid;
    private String name;
    private String latName;

    public UserModel(User user) {
        this.uuid = user.getUuid();
        this.name = user.getName();
        this.latName = user.getLastName();
    }

    public UserModel(UUID uuid){

    }


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }
}
