import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean onNokia = true;

        while (onNokia) {
            System.out.println("""
                    --- NOKIA MENU MAP ---
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10. Reminder
                    11. Clock
                    12. Profiles
                    13. SIM services
                    0. Power Off
                    """);

            System.out.print("Select an option: ");
            int phoneBook = input.nextInt();

            switch (phoneBook) {
                case 1:
                    System.out.println("""
                            \nPhone book
                            1. Search
                            2. Service No
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b'card
                            8. Options
                            9. Speed dials
                            10. Voice tags""");
                    int options = input.nextInt();
                    if (options == 8) {
                        System.out.println("Options:\n1. Type of view\n2. Memory status");
                    }
                    break;

                case 2:
                    System.out.println("""
                            \nMessages
                            1. Write messages
                            2. Inbox
                            3. Outbox
                            4. Picture messages
                            5. Templates
                            6. Smileys
                            7. Message settings
                            8. Info service
                            9. Voice service
                            10. Service command editor""");
                    int messageSetting = input.nextInt();
                    if (messageSetting == 7) {
                        System.out.println("Message settings:\n1. Set 1\n2. Common");
                        int smessageChoice = input.nextInt();
                        if (smessageChoice == 1) {
                            System.out.println("Set 1:\n1. Message center number\n2. Message sent as\n3. Message validity");
                        } else if (smessageChoice == 2) {
                            System.out.println("Common:\n1. Delivery reports\n2. Reply via same center\n3. Character support");
                        }
                    }
                    break;

                case 4:
                    System.out.println("""
                            \nCall Register
                            1. Missed calls
                            2. Received calls
                            3. Dialed numbers
                            4. Erase recent call list
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit""");
                    int callDuration = input.nextInt();
                    if (callDuration == 5) {
                        System.out.println("Show call duration:\n1. Last call\n2. All calls\n3. Received\n4. Dialled\n5. Clear timers");
                    } else if (callDuration == 6) {
                        System.out.println("Show call costs:\n1. Last cost\n2. All cost\n3. Clear counters");
                    } else if (callDuration == 7) {
                        System.out.println("Call cost settings:\n1. Call cost limit\n2. Show costs in");
                    }
                    break;

                case 5:
                    System.out.println("""
                            \nTones
                            1. Ringing tone
                            2. Ringing volume
                            3. Incoming call alert
                            4. Composer
                            5. Message alert tone
                            6. Keypad tones
                            7. Warning and game tones
                            8. Vibrating alert
                            9. Screen saver""");
                    break;

                case 6:
                    System.out.println("""
                            \nSettings
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings""");
                    int callSettings = input.nextInt();
                    if (callSettings == 1) {
                        System.out.println("Call settings:\n1. Redial\n2. Speed dial\n3. Call waiting\n4. Own number\n5. Line use\n6. Auto answer");
                    } else if (callSettings == 2) {
                        System.out.println("Phone settings:\n1. Language\n2. Cell info\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM actions");
                    } else if (callSettings == 3) {
                        System.out.println("Security settings:\n1. PIN request\n2. Call barring\n3. Fixed dialing\n4. Closed user group\n5. Phone security\n6. Change access codes");
                    } else if (callSettings == 4) {
                        System.out.println("Restoring factory settings...");
                    }
                    break;

                case 11:
                    System.out.println("""
                            \nClock
                            1. Alarm clock
                            2. Clock settings
                            3. Date settings
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update""");
                    break;

                case 0:
                    System.out.println("Shutting down...");
                    onNokia = false;
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }
            System.out.println("\n--- End of NOKIA ---\n");
        }
    }
}
