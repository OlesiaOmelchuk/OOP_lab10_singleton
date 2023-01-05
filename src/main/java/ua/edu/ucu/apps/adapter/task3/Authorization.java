package ua.edu.ucu.apps.adapter.task3;

public class Authorization {
    private Авторизація auth;

    public Authorization(){
        auth = new Авторизація();
    }

    public boolean authorize(Database db){
        return auth.авторизуватися(db.getDb());
    }
}
