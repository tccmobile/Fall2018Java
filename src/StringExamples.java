public class StringExamples {
    public static void main(String arg[]){

        String firstName = "William";
        String lastName = "Smith";


        if (firstName.equals("will")){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        if (firstName.equalsIgnoreCase("will")){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        System.out.println("The first letter of the name is: "+firstName.charAt(0));
        System.out.println("The last letter of the name is: "+firstName.charAt(firstName.length()-1));

        //System.out.println("My full name is: "+firstName+" "+lastName);
        System.out.println("My full name is: "+firstName.concat(" ").concat(lastName));

        String fullName = firstName +" "+lastName;
        System.out.println("fullName = " + fullName);

        System.out.println("The location of l is: "+fullName.indexOf('l'));
        System.out.println("The location of l is: "+fullName.indexOf('l',fullName.indexOf('l')+1));

        int offset = 0;

        char charToFind = 'i';

        while ((fullName.indexOf(charToFind)!=-1)){
            offset = fullName.indexOf(charToFind,offset);
            if (offset!=-1){
                System.out.println("The location of "+charToFind+" is: "+ offset);
            } else {
                break;
            }
            offset++;


        }

        System.out.println("The substring from 0 - 3: "+fullName.substring(0,4));

        System.out.println("The substring from 4 - 6: "+fullName.substring(4,7));

        fullName= fullName.replace(" "," Alexander ");

        System.out.println("fullName = " + fullName);

       // System.out.println(fullName.toUpperCase());

        fullName = fullName.toLowerCase();

        System.out.println("fullName = " + fullName);

        char firstLetter = fullName.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);

        System.out.println("firstLetter = " + firstLetter);

        //fullName.charAt(0)= firstLetter;

        //fullName[0] = firstLetter;

        String solution = firstLetter+fullName.substring(1,fullName.length());

        System.out.println("solution = " + solution);

    }
}
