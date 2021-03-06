package Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList <Animal> animals = new ArrayList<Animal>();

	public static void main (String args[])
	{
		animals.add(new Dog());
		animals.add(new Cat("Sam"));
		animals.add(new Cat("Ajax"));
		animals.add(new Bird("Alphonsus"));
		animals.add(new Bird("Clive"));
		animals.add(new Turtle("Herm"));
		animals.add(new Hare("Harry"));
		animals.add(new Horse("Horsey"));
		animals.add(new Scorpion("Scorp"));

		boolean running = true;

		while (running)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("--------------------------------------------------------------");
			for (Animal a : animals)
			{
				for (int j = 0; j < 40; j++)
				{
					if (a.getPosition() == j)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("|");
				System.out.print(a.getName() + "\n");
			}
			System.out.println("--------------------------------------------------------------");

			int winner = checkWinner(animals);
			if (winner != -1)
			{
				System.out.println(animals.get(winner).getName() + " wins!");
				running = false;
			}

			scan.nextLine();
			advanceAll(animals);
		}
	}

	public static void advanceAll(ArrayList<Animal> animals)
	{
		ArrayList <Scorpion> scorps = new ArrayList<Scorpion>();
		for (Animal a : animals)
		{
			a.advance();
			if (a.getClass() == Scorpion.class)
			{
				scorps.add((Scorpion)a);
			}
		}
		for (Scorpion s : scorps)
		{
			if (s.unluckyFellow != -1)
			{
				System.out.println(animals.get(s.unluckyFellow).getName() + " has been stung!");
				animals.remove(s.unluckyFellow);
			}
		}
	}

	public static int checkWinner(ArrayList<Animal> animals)
	{
		int winner = -1;
		for (int i = 0; i < animals.size(); i++)
		{
			if (animals.get(i).getPosition() >= 40)
			{
				winner = i;
			}
		}

		return winner;
	}

	public static void removeAnimal(ArrayList <Animal> animals, int i)
	{
		animals.remove(i);
	}

}
