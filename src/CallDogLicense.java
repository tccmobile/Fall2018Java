public class CallDogLicense {
    public static void main (String [] args) {
        DogLicense dog1 = new DogLicense();

        dog1.setYear(2014);
        dog1.createLicenseNum(777);
        System.out.println("Dog license: " + dog1.getLicenseNum());

    }
}