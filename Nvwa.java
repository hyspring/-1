package huaying;

public class Nvwa {
	public static Person makePerson(String sex)
	{
	if(sex.equalsIgnoreCase("M"))
	{
	return new Man();
	}
	if(sex.equalsIgnoreCase("W"))
	{
	return new Woman();
	}
	if(sex.equalsIgnoreCase("R"))
	{
	return new Robot();
	}
else
	{
	return null;
	}
	}
}
