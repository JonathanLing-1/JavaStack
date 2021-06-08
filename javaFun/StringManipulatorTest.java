public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator trimmed = new StringManipulator();
        String trimmed1 = trimmed.trimAndConcat("        Hello              ","                world");
        System.out.println(trimmed1);
        
        StringManipulator indexOfExmpl = new StringManipulator();
        Integer indexOfReturn = indexOfExmpl.getIndexOrNull("Edgy",'y');
        System.out.println(indexOfReturn);

        StringManipulator indexOfExmpl2 = new StringManipulator();
        Integer indexOfReturn2 = indexOfExmpl2.getIndexOrNull("Helloworld","worl");
        System.out.println(indexOfReturn2);

        StringManipulator randStr = new StringManipulator();
        String randStr2 = randStr.concatSubstring("Hello",1,2,"world");
        System.out.println(randStr2);
    }
}