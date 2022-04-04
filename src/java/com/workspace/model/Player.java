package com.workspace.model;

import com.workspace.Context;

import java.util.Objects;

/**
 * Domain entity Player
 */
public class Player {

    private final Long id;

    private final PlayerType type;

    private String name;

    private Long money;

    public Player(PlayerType type, String name, Long money) {
        this.id = Context.newPlayerId();
        this.type = type;
        this.name = name;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public PlayerType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(money, player.money) &&
               Objects.equals(id, player.id) &&
               Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, id);
    }
}
