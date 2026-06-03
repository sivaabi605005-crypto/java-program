class puppy extends dog
{
void weep()
{
System.out.println("weeping");
}
public static void main (String[] args)
{
puppy p = new puppy();
p.eat();
p.bark();
p.weep();
}
}