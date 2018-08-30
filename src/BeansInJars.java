public class BeansInJars {
    public static void main (String [] args) {
        int numBeans;
        int numJar;
        int totalBeans;

        numBeans = 500;
        numJar = 3;

        System.out.print(numBeans + " beans in ");
        System.out.print(numJar + " jars yields ");
        totalBeans = numBeans * numJar;
        System.out.println(totalBeans + " total");
    }
}
