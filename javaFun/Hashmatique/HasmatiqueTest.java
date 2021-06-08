public class HasmatiqueTest{
    public static void main(String[] args){

        Hasmatique test = new Hasmatique();
        test.trackListMake();
        test.trackListIterate();
        System.out.println(test.trackListGetOne("Song1"));
        // System.out.println(test.trackListIterate());
    }
}