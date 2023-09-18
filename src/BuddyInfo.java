public class BuddyInfo {

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String name;
    public String address;
    public String phoneNumber;

    public static void main (String[] args) {
        //BuddyInfo da_name = new BuddyInfo("Homer");
        //System.out.println("Hello " + da_name.getName() + "!");
    }
}
