package java.model;

import java.io.Serializable;

import static java.model.PlayerType.Bank;

public class Player implements Serializable {
    private final String name;
    private Long money;
    private final Integer id;
    private final PlayerType type;

    public Player(String name, Long money, Integer id, PlayerType type) {
        this.name = name;
        this.money = money;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Long getMoney() {
        if (this.type == Bank) {
            return Long.MAX_VALUE;
        } else {
            return money;
        }
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public PlayerType getType() {
        return type;
    }
}
