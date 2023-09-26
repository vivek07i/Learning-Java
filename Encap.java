public class Encap {

    private String name;

    // Getter
    public String getName() {
        return this.name;
        // this is used to refer to current object
    }

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) throws Exception {
        Encap obj1 = new Encap();
        // obj1.name = "John"
        // System.out.println("Name: "+obj1.name);
        // this will give error

        obj1.setName("John Doe");
        System.out.println(obj1.getName());
    }

}
