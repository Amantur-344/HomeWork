package com.company;


        import org.w3c.dom.ls.LSOutput;

        import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Bishkek bishkek = new Bishkek();
        bishkek.setName("Бишкек");
        bishkek.setSupervisor("Балбак Зарлыкович");
        bishkek.setPeople(1000937);
        bishkek.setSquare(87563);
        bishkek.say();
        bishkek.geograp();

        System.out.println("\n"+"\n");

        Osh osh = new Osh();
        osh.setName("Ош");
        osh.setSupervisor("Айтмамат Кадыров");
        osh.setPeople(646775);
        osh.setSquare(8977);
        osh.say();
        osh.geograp();

        System.out.println("\n"+"\n");

        KaraKol karaKol = new KaraKol();
        karaKol.setName("Каракол");
        karaKol.setSupervisor("А.Каниметов");
        karaKol.setPeople(67567);
        karaKol.setSquare(9778);
        karaKol.say();
        karaKol.geograp();

        System.out.println("\n"+"\n");

        SokulukRaion sokulukRaion = new SokulukRaion();
        sokulukRaion.setName("Сокулук ");
        sokulukRaion.setSupervisor("Асылбек Сатылвадиев");
        sokulukRaion.setPeople(9878);
        sokulukRaion.setSquare(4364);
        sokulukRaion.say();
        sokulukRaion.geograp();

        System.out.println("\n"+"\n");

        AlaiRaion alaiRaion = new AlaiRaion();
        alaiRaion.setName("Алай ");
        alaiRaion.setSupervisor("Замир Молдокулов ");
        alaiRaion.setPeople(5222);
        alaiRaion.setSquare(6225);
        alaiRaion.say();
        alaiRaion.geograp();

        System.out.println("Введите город что бы узнать кто руководитель: (Бишкек, Ош, Каракол, Сокулук, Алай)");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        if (name.equals(bishkek.getName())== true){
            bishkek.getSupervisor();
        }else if (name.equals(osh.getName())) {
            System.out.println(osh.getSupervisor());
        }else if (name.equals(karaKol.getName()) == true) {
            System.out.println(karaKol.getSupervisor());
        }else if (name.equals(sokulukRaion.getName()) == true) {
            System.out.println(sokulukRaion.getSupervisor());
        }else if (name.equals(alaiRaion.getName()) == true) {
            System.out.println(alaiRaion.getSupervisor());
        }

    }
}
