import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddy) {
        //add a buddy to the array of buddies
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        //remove a buddy from the array of buddies
        buddies.remove(buddy);
    }
    public static void main (String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
