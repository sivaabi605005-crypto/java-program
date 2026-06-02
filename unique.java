class unique
{
public static void main(String[] args)
{
String str = "programming";
for (int i =0;i<str.length();i++)
{
int count= 1;
for (int j=i +1;j<str.length();j++)
{
if (str.charAt(i) == str.charAt(j))
{
count ++;
}
}
Boolean alreadyprinted = false;
for(int k =0;k<j;k++)
{if (str.charAt(i) == str.charAt(k))
{
if(str.charAt(i) == str.charAt(k))
{
alreadyprinted = true;
break;
}
}
if (!alreadyprinted)
{
System.out.println(str.charAt(i)  + "  = " + count);
}
}
}
}
}