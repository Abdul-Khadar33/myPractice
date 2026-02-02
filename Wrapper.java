// It has multiple methods by converting type of objects, strings and integers....
public class Wrapper 
{
    public static void main(String args[])
    {
        int num = 10;
        Integer num1 = num; //(" Actually we are creating object there... But it is auto boxing method")
        System.out.println(num1);

        int num2 = num1;//(" Even not calling through object, value pass through auto unboxing method") )
        System.out.println(num2);

        String str = "12"; //( 12 is string now...With string, we can perform arithmetic operation... so we may convert into parseint)
        int result = Integer.parseInt(str);
        System.out.println(result * 10);
    }
}
