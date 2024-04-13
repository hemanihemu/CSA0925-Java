import java.util.*;

class Indexs
{
    public static void main(String[] args) 
{
String str="I am a programmer";
     char ch = 'p';
    int index = -1;
    int n = str.length();
    for (int i = 0; i < n; i++)
   {
   if (str.charAt(i) == ch) 
  {
   index = i;
   break;
   }
   }
   if (index != -1) 
  {
   System.out.println("The character '" + ch + "' found at index " + index);
   }
  else 
  {
  System.out.println("The character '" + ch + "' is not found in the string.");
 }
 }
}