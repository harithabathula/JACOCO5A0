package DEVPSLAB.MH1A05A0;
public class App 
{
    public static void main( String[] args )
    {
       
    }
    public String getMessage(String name) {

        StringBuilder result = new StringBuilder();

        if (name == null || name.trim().length() == 0) {

            result.append("Please provide a name!");

        } else {

            result.append("Hello " + name);

        }
        return result.toString();
    }
}
