import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AddressBook1 {
    public static void main(String[] args) {

        PersonContact newContect = new PersonContact(1, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact newContect1 = new PersonContact(2, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact newContect2 = new PersonContact(3, "Alok2", "kumar", "kanpur", "lucknow", 788982171, "alokprajapati");
        PersonContact newContect3 = new PersonContact(4, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");
        PersonContact newContect4 = new PersonContact(5, "Alok5", "kumar", "lucknow", "lucknow", 788802171, "alokprajapati");
        Map<Integer, PersonContact> mapBook1 = new HashMap<>();
        mapBook1.put(newContect.srNo, newContect);
        mapBook1.put(newContect1.srNo, newContect1);
        mapBook1.put(newContect2.srNo, newContect2);
        mapBook1.put(newContect3.srNo, newContect3);
        mapBook1.put(newContect4.srNo, newContect4);
        System.out.println("AdddressBook1  " + mapBook1);

        PersonContact p1 = new PersonContact(1, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact p2 = new PersonContact(2, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact p3 = new PersonContact(3, "Alok2", "kumar", "lucknow", "lucknow", 788982171, "alokprajapati");
        PersonContact p4 = new PersonContact(4, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");
        PersonContact p5 = new PersonContact(5, "Alok5", "kumar", "lucknow", "lucknow", 788802171, "alokpr");
        PersonContact p6 = new PersonContact(6, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact p7 = new PersonContact(7, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact p8 = new PersonContact(8, "Alok2", "kumar", "lucknow", "lucknow", 788982171, "alokprajapati");
        PersonContact p9 = new PersonContact(9, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");
        PersonContact p10 = new PersonContact(10, "Alok5", "kumar", "lucknow", "lucknow", 788802171, "alokpr");
        Map<Integer, PersonContact> addresbook2 = new HashMap<>();
        addresbook2.put(p1.srNo,p1);
        addresbook2.put(p2.srNo,p2);
        addresbook2.put(p3.srNo,p3);
        addresbook2.put(p4.srNo,p4);
        addresbook2.put(p5.srNo,p5);
        addresbook2.put(p6.srNo,p6);
        addresbook2.put(p7.srNo,p7);
        addresbook2.put(p8.srNo,p8);
        addresbook2.put(p9.srNo,p9);
        addresbook2.put(p10.srNo,p10);
        System.out.println("addressBook2 "+addresbook2);
        Map<Integer,PersonContact> addressBook3=new HashMap<>();

        PersonContact person1 = new PersonContact(1, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact person2 = new PersonContact(2, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact person3 = new PersonContact(3, "Alok2", "kumar", "lucknow", "lucknow", 788982171, "alokprajapati");
        PersonContact person4 = new PersonContact(4, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");
        PersonContact person5 = new PersonContact(5, "Alok5", "kumar", "lucknow", "lucknow", 788802171, "alokpr");
        PersonContact person6 = new PersonContact(6, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact person7 = new PersonContact(7, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact person8 = new PersonContact(8, "Alok2", "kumar", "lucknow", "lucknow", 788982171, "alokprajapati");
        PersonContact person9 = new PersonContact(9, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");
        PersonContact person10 = new PersonContact(10, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact p12 = new PersonContact(12, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact p13 = new PersonContact(13, "Alok2", "kumar", "lucknow", "lucknow", 788982171, "alokprajapati");
        PersonContact p14 = new PersonContact(14, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");
        PersonContact p15 = new PersonContact(15, "Alok5", "kumar", "lucknow", "lucknow", 788802171, "alokpr");
        PersonContact p16 = new PersonContact(16, "Alok", "kumar", "lucknow", "lucknow", 788980217, "alokprajapati");
        PersonContact p17 = new PersonContact(17, "Alok1", "kumar", "lucknow", "lucknow", 788980171, "alokprajapati");
        PersonContact p18 = new PersonContact(18, "Alok2", "kumar", "lucknow", "lucknow", 788982171, "alokprajapati");
        PersonContact p19 = new PersonContact(19, "Alok4", "kumar", "lucknow", "lucknow", 788902171, "alokprajapati");

        addressBook3.put(person1.srNo,person1);
        addressBook3.put(person2.srNo,person2);
        addressBook3.put(person3.srNo,person3);
        addressBook3.put(person4.srNo,person4);
        addressBook3.put(person5.srNo,person5);
        addressBook3.put(person6.srNo,person6);
        addressBook3.put(person7.srNo,person7);
        addressBook3.put(person8.srNo,person8);
        addressBook3.put(person9.srNo,person9);
        addressBook3.put(person10.srNo,person10);
        addressBook3.put(p12.srNo,p12);
        addressBook3.put(p13.srNo,p13);
        addressBook3.put(p14.srNo,p14);
        addressBook3.put(p15.srNo,p15);
        addressBook3.put(p16.srNo,p16);
        addressBook3.put(p17.srNo,p17);
        addressBook3.put(p18.srNo,p18);
        addressBook3.put(p19.srNo,p19);
        System.out.println("Adders book3 "+addressBook3);
        List<Map<Integer,PersonContact>> list=new ArrayList<>();
list.add(mapBook1);
list.add(addresbook2);

list.add(addressBook3);
System.out.println(list);
        System.out.println(list.get(0).get(3).address);
        System.out.println(list.size());
    }
}