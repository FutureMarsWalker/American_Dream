/*
Description: This is a simulation that goes through how it would feel to be a African American or a white family buying
             a house in the 1960's.
Author: Tushar Wani
Purpose: English project
Date finished: March 2, 2020
*/

import java.util.Scanner;

public class game {

    static String familyChosen;
    static int userChoice;
    static Scanner usrInput = new Scanner(System.in);

    public static void main(String[] args){



        makeSpace();

        System.out.println("\nWelcome! This project is made using the American Dream Prompt.\n"
                            + "Many people have the dream of living in their dream house.\n"
                            + "Therefore, this project is going to stimulate what buying a house in would look like"
                            + " in the 1960's in Chicago.\n"
                            + "Throughout the story you will have to make choices, like the following:");
        System.out.print("\nAre you ready? Type in yes or no and press enter: ");
        String usrChoice = usrInput.nextLine();
        while(true){
            if(usrChoice.toLowerCase().equals("yes")){
                break;
            }
            else if(usrChoice.toLowerCase().equals("no")){
                System.out.print("Are you ready now? Type in yes or no and press enter: ");
                usrChoice = usrInput.nextLine();
            }
            else{
                System.out.print("Please type in yes or no and then press enter: ");
                usrChoice = usrInput.nextLine();
            }
        }

        makeSpace();

        chooseFamily();

        makeSpace();

        while(true) {

            if (familyChosen.equals("black")) {

                System.out.println("\nIt is 1965 and you are the head of an African American family looking to move" +
                        "\ninto the suburbs of Chicago. You are 25 years old. You went to school through junior high, but" +
                        "\nyour family needed extra income to be sustainable so you left school to go to work. You now work in the manufacturing industry. " +
                        "\nYou are not a veteran of World War II or the Korean War. Your wife is 27 years old and works part time as a " +
                        "\nhousekeeper. Your family income is $3,900 a year. She is pregnant with your second child, and you'd like to find a three-bedroom home " +
                        "\nso each kid can have their own room.");
                System.out.print("Enter 1 to move forward: ");
                while (true) {
                    int moveForward = usrInput.nextInt();
                    if (moveForward == 1) {
                        break;
                    }
                    else {
                        System.out.print("Enter 1 to move forward: ");
                    }
                }

                makeSpace();

                System.out.println("\nOn a Monday evening after work you make your way up to Deerfield.");
                sleep(1500);
                System.out.println("Deerfield is twenty three miles northwest of Chicago. " +
                        "Most of its residents are college graduates." +
                        " 99% of its residents are white.");
                System.out.println("What do you want to do? 1. Go explore housing options in Deerfield or " +
                        "\n2. Go to another neighborhood because you know you are not welcome here?");
                System.out.print("Enter a number here: ");
                userChoice = usrInput.nextInt();
                while (true) {
                    if (userChoice == 1) {
                        System.out.println("You went to the office to talk about house leases but no agent met up with you." +
                                "\nThey told you everyone is busy and they will call you up shortly but no one did." +
                                "\nYou had to go back home empty handed.");
                        break;
                    }
                    else if (userChoice == 2) {
                        System.out.println("You made the right decision and saved yourself a lot of humiliation.");
                        break;
                    }
                    else {
                        System.out.print("Please chose 1 or 2: ");
                        userChoice = usrInput.nextInt();
                    }
                }

                makeSpace();

                System.out.println("\nThe next day, you go to Park Forest. It is located thirty miles south of Chicago." +
                        "\nThis is a fairly new suburb. Most of the people that live here, who are in their early twenties and are well educated, moved here in the past two years.");

                System.out.print("Enter 1 to move forward: ");
                userChoice = usrInput.nextInt();
                while (true) {
                    if (userChoice == 1) {
                        break;
                    }
                    else {
                        System.out.print("Please enter 1 to move forward: ");
                        userChoice = usrInput.nextInt();
                    }
                }
                System.out.println("You are about to step into the office that you hear two white man taking about an incident: " +
                        "\nHere is the gist of what you understood - The first Negro family moved into Park Forest only last year." +
                        "\nAlthough no violence occurred as a result, many Negro families who attempt to buy a home in the suburbs " +
                        "\nexperience racially-motivated violence that prevents them from moving in.");
                sleep(4500);
                System.out.println("... you are speechless ...");
                sleep(1000);
                System.out.println("\nNow you are thinking that you are obviously not going to bring your family into a dangerous place like this." +
                        "\nYou are sad that even though the people living in this neighborhood are more literate than you " +
                        "\nthey can't let this race discrimination be a thing of the past.");
                makeSpace();
                sleep(5000);
                System.out.println("Now its been about a week");
                sleep(1000);
                System.out.println("You still haven't lost your hope. You are hoping for one place that might take you guys in." +
                        "\nYou are so desperate that you are just asking for the agencies to talk to you. Give you any offer, but at the least give you one!");
                sleep(3000);
                System.out.println("Your last hope is in Markham. Located twenty miles south of Chicago." +
                        "\nA subdivision called Park Terrace provides homes for African Americans. At least that is what you have hear." +
                        "\nAfrican Americans make up to 21.4% of the population there.");
                System.out.println("After knowing this, how are you feeling? 1. Hopeful or 2. I'll be ignored here too.");
                System.out.print("Enter your number here: ");
                userChoice = usrInput.nextInt();
                while (true) {
                    if (userChoice == 1) {
                        System.out.println("(Hope was one thing African Americans had an ample of in those times. Sometimes," +
                                "\nthat is the only thing they ever had.)");
                        break;
                    }
                    else if (userChoice == 2) {
                        System.out.println("(You are right in feeling hopeless. People didn't really care who you were," +
                                "but more so what you were.)");
                        break;
                    }
                    else {
                        System.out.print("Please write something between 1 and 2: ");
                        userChoice = usrInput.nextInt();
                    }
                }
                sleep(1000);
                System.out.println("You got an agent to talk to this time!");
                sleep(1000);
                System.out.println("But he had some bad news for you...");
                sleep(1000);
                System.out.println("Recently as many African American families are moving into the complex, are encouraging more and more fights between the whites.");
                makeSpace();
                sleep(2000);
                System.out.println("\nAfrican Americans at that time, did not have much of a quality of life." +
                        "\nMost of them were struggling to survive and trying to give their children a better future.");
                System.out.println("They weren't always successful. The housing bias excluded a lot of races from their complexes including as you saw African Americans.");
                sleep(2000);
                System.out.println("Now, if you want to play as a white family you can restart this program and choose that option!");
                break;
            }
            else if (familyChosen.equals("white")) {

                System.out.println("\nIt is 1965 and you are the head of a white family looking to move into the suburbs" +
                        "\nof Chicago. You are 29 years old and went to school through eleventh grade. You work in the" +
                        "\nmanufacturing industry. You are a veteran of the Korean war. Your wife works part-time" +
                        "\nsecretary. You would like to find a home with three bedroom. So, that each of your children" +
                        "\n can have their own room and you and your wife can have one. Your total family income is" +
                        "\n$6,200 a year.");
                System.out.print("Enter 1 to move forward: ");
                int moveForward = usrInput.nextInt();
                while (true) {
                    if (moveForward == 1) {
                        break;
                    }
                    else {
                        System.out.print("Enter 1 to move forward: ");
                        moveForward = usrInput.nextInt();
                    }
                }

                makeSpace();

                System.out.println("\nOn a Monday evening after work you make your way up to Deerfield.");
                sleep(1500);
                System.out.println("Deerfield is twenty three miles northwest of Chicago. " +
                        "Most of its residents are college graduates." +
                        " 99% of its residents are white.");
                System.out.println("But first you need to know about financing a home before visiting Deerfield." +
                        "\nYou need mortgage credit to buy a house, but there are several financial standards you must" +
                        "\nmeet in order to qualify for that credit. You must make sufficient income to meet the down " +
                        "\npayment and monthly payment requirements. The property you are purchasing must be of good " +
                        "\nquality and location.");
                sleep(5000);
                System.out.println("The Federal Housing Administration and Veterans Administration offer longer terms, " +
                        "\nlower down payments, and lower interest rates on mortgages. FHA and VA loans have made homewnership " +
                        "\npossible for many moderate-income families who would otherwise be unable to afford them.");
                System.out.println("Despite these programs, lenders still hold the power to decide who will receive credit.");
                System.out.println("What would you like to do?" +
                        "\n1. Look at Deerfield and see if your family has been approved for a mortgage" +
                        "\n2. Look at houses in another area" +
                        "\n3. Continue to live where you are living right now");
                System.out.print("Enter a number here: ");
                userChoice = usrInput.nextInt();
                while(true){
                    if(userChoice == 1){
                        continueWithDeerfield();
                        break;
                    }
                    else if(userChoice == 2){
                        anotherAreaChoice();
                        break;
                    }
                    else if(userChoice == 3){
                        System.out.println("A home in the suburbs is the hallmark of the American Dream. Homeownership " +
                                "\nbecame a reality for many people after World War II. The demand for housing increased" +
                                "\nrapidly as veterans returned from the war and started families. The federal government " +
                                "\nsubsidized the private building industry's efforts to supply the enormous demand.");
                        sleep(3500);
                        System.out.println("\nIn order to build many houses in a short period of time, builders applied " +
                                "\nthe techniques of mass production to the construction of houses. " +
                                "\nThe houses were small, identical to one another, and often poorly constructed, but " +
                                "\nmost importantly they were affordable. They sold quickly and many Americans realized " +
                                "\nthe dream of homeownership for the first time.");
                        sleep(4500);
                        System.out.println("\nBy 1960, many of these families had improved their financial status and traded " +
                                "\nup their first home for a bigger home in a better community. Families sought more individualized" +
                                "\nhousing. Once again, builders responded to the demand.");
                        sleep(3500);
                        System.out.println("\nOnly the wealthiest consumers could have a one-of-a-kind home, however." +
                                "\nThe average family had to choose among the options it could afford. In addition to income, " +
                                "\nrace determined the choices that a family could make. In general, African Americans had to" +
                                "\ncompromise more than whites when choosing a home. In 1960 Chicago, African Americans " +
                                "\nwere basically excluded from buying a home in the suburbs.");
                        sleep(5000);
                        makeSpace();
                        break;
                    }
                    else{
                        System.out.print("Please enter a number 1, 2, or 3: ");
                        userChoice = usrInput.nextInt();
                    }
                }
            }
            else {
                chooseFamily();
            }
            break;
        }
    }

    private static void continueWithDeerfield(){

        System.out.println("Deerfield is 99.9% white. A few Negroes live throughout the village, but they are not " +
                        "\nconcentrated in one particular area. Morris Milgram is financing a subdivision of Deerfield " +
                        "\ncalled Floral Park. 10 or 12 homes will be sold to Negroes at $30,000 to $40,000." +
                        "\nMany residents are opposing this idea.");
        System.out.print("Enter 1 to continue: ");
        userChoice = usrInput.nextInt();
        while(true){
            if(userChoice == 1){
                break;
            }
            else{
                System.out.print("Please enter 1 to continue: ");
                userChoice = usrInput.nextInt();
            }
        }
        System.out.println("(These are actual quotes) A white woman from Deerfield says, \"Negroes ought to have an equal" +
                "chance, but I don't \nwant them next door to me.\"");
        System.out.print("You listening to this can 1. Ask this woman to explain herself or 2. Ask other residents: ");
        userChoice = usrInput.nextInt();
        while(true){

            if(userChoice == 1){
                System.out.println("The woman grew up going to school with Negroes but had \"not thought much about it,\" " +
                        "\nuntil she was confronted with the prospect of an integrated development in her community. " +
                        "\nCurrently, the nearest Negro settlement is 8 miles away from Deerfield.");
                sleep(3000);
                System.out.println("She agrees with Harold Lewis, chairman of the anti-integration committee formed by " +
                        "\nsome of the residents, that the builders are \"trying to force integration down the throats of " +
                        "\nthe people of Deerfield.\"");
                sleep(3000);
                System.out.println("She fears that an influx of Negroes will drive down property values, making it " +
                        "\ndifficult to sell their homes for a good price.");
                sleep(2500);
                break;
            }
            else if(userChoice == 2){
                break;
            }
            else{
                System.out.print("Please enter a number 1 or 2: ");
                userChoice = usrInput.nextInt();
            }

        }
        System.out.println("Now, do you want to ask the other residents about their opinion? (yes or no): ");
        //String yn = usrInput.nextLine();
        while (true){
            String yn = usrInput.nextLine();
            if(yn.toLowerCase().equals("yes")){
                break;
            }
            else{
                System.out.println("The other residents want to really share their opinions please say yes...: ");

            }
        }
        System.out.println("A good looking couple said, \"We're all mortgaged up to here. And although we've got most of our money tied up in our homes, " +
                "\nwe don't expect to live in them really very long. Some of the junior execs expect to become seniors " +
                "\nand move a few miles east to the real North Shore, and a lot of us will be transferred all over the " +
                "\nUnited States. When this happens, we want to be sure our homes have resale value.\"");
        System.out.print("When you look around you see 1. other residents with the same problem and 2. other residents" +
                "\nthat oppose the development for some other reasons. Whom do you want to hear to?: ");
        userChoice = usrInput.nextInt();
        while(true){

            if(userChoice == 1){
                System.out.println("Morris Courington, a merchandiser says, \"Some shyster came around and offered us about " +
                        "\nhalf what our house is worth. We called the real estate company, and they wouldn't even accept our listing.\"");
                System.out.print("When you look around you see other residents with the same problem enter 1 to hear to them: ");
                userChoice = usrInput.nextInt();
                while(true)
                if(userChoice == 1){
                    System.out.println("A businessman says, \"Now I'm not denying any of the Negroes' rights, but I am " +
                            "\nsaying people can talk about brotherhood all they want till it moves next door. I've put " +
                            "\neverything I have into my home here and I don't want to lose it to a bunch of do-gooders.\"");
                    System.out.print("When you look around you see other residents with the same problem enter 1 to hear to them: ");
                    userChoice = usrInput.nextInt();
                    while(true){
                        if(userChoice == 1){
                            System.out.println("A North Shore householder says, \"We just can't afford to be democratic.\"");
                            break;
                        }
                        else{
                            System.out.print("Please enter 1: ");
                            userChoice = usrInput.nextInt();
                        }
                    }
                    break;
                }
                else{
                    System.out.print("Please enter 1: ");
                    userChoice = usrInput.nextInt();
                }
                break;
            }
            else if(userChoice == 2){

                System.out.println("A young housewife says, \"One of my neighbors told me, when I spoke out against the bond " +
                        "\nissue, that she might not mind living next door to a nigger, but she wouldn't want to live next " +
                        "\ndoor to any nigger lover.\"");
                System.out.print("Listen to other people that think like this housewife enter 1 to continue: ");
                userChoice = usrInput.nextInt();
                while(true){
                    if(userChoice == 1){
                        System.out.println("An anonymous townsperson, writing to a minister who supports the integrated " +
                                "\ndevelopment says, \"Nigger Lover, why the hell don't you just move out of Deerfield? " +
                                "\nGo ahead and live with those black apes and let your children marry one of them and " +
                                "\npresent you with a nice dark brown grandson or daughter.\"");
                        break;
                    }
                    else{
                        System.out.print("Please enter 1 to continue");
                        userChoice = usrInput.nextInt();
                    }
                }
                break;
            }
            else{
                System.out.print("Please enter a 1 or 2: ");
                userChoice = usrInput.nextInt();
            }
        }
        System.out.println("Some people also support the development! You listen to them, enter 1: ");
        userChoice = usrInput.nextInt();
        while(true){
            if(userChoice == 1){
                System.out.println("A member of a church congregation says, \"No one present seemed to understand that " +
                        "\nNegroes who can pay $30,000 to $40,000 for a home aren't starting ghettoes.\"");
                break;
            }
            else{
                System.out.print("Please enter 1: ");
                userChoice = usrInput.nextInt();
            }
        }
        makeSpace();
        System.out.println("\nAfter listening to all these people you go back to the office to see if your mortgage passed or not.");
        System.out.println("It did not pass.");
        System.out.println("The reason they game was, that you would not be able to make a large enough down payment" +
                "\nand that you would not also be able to make the monthly payments. They did not count your wife's income " +
                "\nbecause they assumed that she would stop working if she has more children.");
        System.out.print("You are happy it did not pass because you did not want to move here anyway. Enter 1 to continue: ");
        userChoice = usrInput.nextInt();
        while(true){
            if(userChoice == 1){
                break;
            }
            else{
                System.out.print("Please press 1 to continue: ");
                userChoice = usrInput.nextInt();
            }
        }
        anotherAreaChoice();
    }

    private static void anotherAreaChoice(){

        System.out.println("You are looking into Park Forest." +
                "\nsituated thirty miles south of Chicago. People who live there are very well educated." +
                "\nAlmost half of the residents moved into their home within the last two years.");
        System.out.println("You have a better change here to qualify for a mortgage because the houses are less expensive.");
        System.out.print("There are many pros for living in Park Forest:" +
                "\n 1. Know more about the schools" +
                "\n 2. Know more about the churches" +
                "\n 3. Know more about the transportation" +
                "\n 4. Know more about the shopping center" +
                "\nEnter a number: ");
        userChoice = usrInput.nextInt();
        while(true){
            if(userChoice == 1){
                System.out.println("Time magazine calls Park Forest's schools ultramodern. The teachers are highly educated");
                break;
            }
            else if(userChoice == 2){
                System.out.println("Park Forest has chruches for serveral different religions");
                break;
            }
            else if(userChoice == 3){
                System.out.println("Public transportation is available and helps to avoid traffic jams.");
                break;
            }
            else if(userChoice == 4){
                System.out.println("The Plaza is centrally located. It includes sixty stores and a theater.");
                break;
            }
            else{
                System.out.print("Please choose between 1, 2, 3, or 4: ");
                userChoice = usrInput.nextInt();
            }
        }
        System.out.println("You were approved for a mortgage on home in Eastgate, the least expensive area of Park Forest.");
        System.out.print("Would you like to 1. move here or 2. continue to live where you live now: ");
        userChoice = usrInput.nextInt();
        while(true){
            if(userChoice == 1){
                System.out.println("Congratulations! You are now the owner of a home in the Eastgate subdivision of Park Forest.");
                break;
            }
            else if(userChoice == 2){
                System.out.println("A home in the suburbs is the hallmark of the American Dream. Homeownership " +
                        "\nbecame a reality for many people after World War II. The demand for housing increased" +
                        "\nrapidly as veterans returned from the war and started families. The federal government " +
                        "\nsubsidized the private building industry's efforts to supply the enormous demand.");
                sleep(3500);
                System.out.println("\nIn order to build many houses in a short period of time, builders applied " +
                        "\nthe techniques of mass production to the construction of houses. " +
                        "\nThe houses were small, identical to one another, and often poorly constructed, but " +
                        "\nmost importantly they were affordable. They sold quickly and many Americans realized " +
                        "\nthe dream of homeownership for the first time.");
                sleep(4500);
                System.out.println("\nBy 1960, many of these families had improved their financial status and traded " +
                        "\nup their first home for a bigger home in a better community. Families sought more individualized" +
                        "\nhousing. Once again, builders responded to the demand.");
                sleep(3500);
                System.out.println("\nOnly the wealthiest consumers could have a one-of-a-kind home, however." +
                        "\nThe average family had to choose among the options it could afford. In addition to income, " +
                        "\nrace determined the choices that a family could make. In general, African Americans had to" +
                        "\ncompromise more than whites when choosing a home. In 1960 Chicago, African Americans " +
                        "\nwere basically excluded from buying a home in the suburbs.");
                sleep(5000);
                makeSpace();
                break;
            }
            else{
                System.out.print("Please choose 1 or 2: ");
                userChoice = usrInput.nextInt();
            }
        }
    }

    private static void sleep(int time){

        try{
            Thread.sleep(time);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void chooseFamily(){

        Scanner usrInput = new Scanner(System.in);
        System.out.print("\nChoose between 1. Be the man of a white family or\n" +
                "2. Be the man of an African American family (Type in the number 1 or 2 and then press enter): ");
        int family = usrInput.nextInt();

        while(true){
            if (family == 1) {
                familyChosen = "white";
                break;
            }
            else if (family == 2) {
                familyChosen = "black";
                break;
            }
            else {
                System.out.print("Please type in 1 or 2: ");
                family = usrInput.nextInt();
            }
        }
        //System.out.println("Debug: " + familyChosen);
    }

    private static void makeSpace(){

        for(int i = 0; i < 51; i++){
            System.out.print("=");
        }

    }

}
