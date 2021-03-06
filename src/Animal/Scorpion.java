package Animal;

import java.util.ArrayList;
import java.util.Random;

public class Scorpion implements Animal{

	public int unluckyFellow;
	private String name;
	private int position = 0;

	public Scorpion (String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	private boolean isNear(int pos)
	{
		if (pos > position-1 && pos < position+1)
		{
			return true;
		}
		return false;
	}

	private void findVictim()
	{
		ArrayList <Integer> stingables = new ArrayList<Integer>();
		for (int i = 0; i < Main.animals.size(); i++)
		{
			if (isNear(Main.animals.get(i).getPosition()) && Main.animals.get(i) != this)
			{
				System.out.format("Suspects: %d\n", i);
				stingables.add(i);
			}
		}

		Random rand = new Random();
		
		this.unluckyFellow = -1;
		
		if (stingables.size() > 0)
		{
			int choice = rand.nextInt(stingables.size());
			int unluckyFellow = stingables.get(choice);
			this.unluckyFellow = unluckyFellow;
		}
	}

	public void advance()
	{
		findVictim();
		position++;
	}

	public int getPosition()
	{
		return position;
	}

}
