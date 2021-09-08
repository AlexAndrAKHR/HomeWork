package lesson;

public class Team {


    private String surname;
    private String name;
    private String patronymic;
    private int age;
    boolean goTheDistance;


    public Team(String name) {
        this.name = name;
    }

    public Team(String surname, String name, String patronymic, int age, boolean goTheDistance) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.goTheDistance = goTheDistance;
    }

    String getSurname() {
        return surname;
    }

    String getName() {
        return name;
    }

    String getPatronymic() {
        return patronymic;
    }

    int getAge() {
        return age;
    }

    boolean getGoTheDistance() {
        return goTheDistance;
    }






    @Override
    public String toString() {
        return "Team: " + name;
    }


    String getFullInfo() {
        return this.surname + " " +
                this.name + " " +
                this.patronymic + " " +
                this.age + " Прошёл дистанцию: " + goTheDistance;



    }


    public static void main(String[] args) {
        Team team = new Team( "Team: Rockets");
        System.out.println(team.name);


    }


}









