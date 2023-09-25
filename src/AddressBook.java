import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> buddies;
    public AddressBook() {
        buddies  = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        //add a buddy to the array of buddies
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        //remove a buddy from the array of buddies
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }
    public static void main (String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
