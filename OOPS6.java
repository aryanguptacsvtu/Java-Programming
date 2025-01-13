class AccessModifier {
    private int id; // Using "Private" Access Modifier
    private String name;

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class OOPS6 {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        obj.setId(100);
        obj.setName("Aryan");

        System.out.println("ID : " + obj.getId());
        System.out.println("Name : " + obj.getName());

        // obj.id =100; [INVALID]
        // obj.name ="Aryan";
    }

}
