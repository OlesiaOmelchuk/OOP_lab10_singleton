package ua.edu.ucu.apps.adapter.task3;

import lombok.Getter;

public class Database {
    @Getter
    private БазаДаних db;

    public Database(){
        this.db = new БазаДаних();
    }

    public String getUserData(){
        return db.отриматиДаніКористувача();
    }

    public String  getStaticData(){
        return db.отриматиСтатистичніДані();
    }
}
