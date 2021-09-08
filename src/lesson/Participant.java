package lesson;

public class Participant {




    public static void main(String[] args) {
        Team participant = new Team("Кулешов", "Илья", "Игоревич", 28, true);
        System.out.println(participant.getFullInfo());

        System.out.println();

        Team[] stadium = {
                participant,
                new Team("Ходунков", "Иван", "Васиьевич", 29, false),
                new Team("Cоколова", "Елена", "Юрьевна", 26, false),
                new Team("Кудрявцева", "Евгения", "Олеговна", 30, true),
        };

        getAllParticipantsInTeam(stadium);
        System.out.println();
        participantsGoTheDistance(stadium);
        System.out.println();




    }


    private static void getAllParticipantsInTeam(Team[] stadium) {
        System.out.println("All participants:");
        for (int i = 0; i < stadium.length; i++)
            System.out.println(stadium[i].getFullInfo());
    }


    private static void participantsGoTheDistance(Team[] stadium) {
        for (int i = 0; i < stadium.length; i++)
        if (stadium[i].getGoTheDistance()==true) {
            System.out.println(stadium[i].getFullInfo());

        }

    }



}
