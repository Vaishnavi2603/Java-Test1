package JavaTest1;

class Animal
{
	public void shout()
	{
		System.out.println("Animals Shout");	
	}
}

class dog extends Animal
{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("dog barks");
	}	
}

class horse extends Animal{

	@Override
	public void shout() 
	{
		super.shout();
		System.out.println("horse neigh");
	}
	
}
	class cat extends Animal{

		@Override
		public void shout() {
			// TODO Auto-generated method stub
			super.shout();
			
			System.out.println("cat meow");
		}
		
		
	}
	
public class AnimalShout{

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal d = new dog();
		Animal c = new cat();
		Animal h = new horse();
		c.shout();
		d.shout();
		h.shout();
	}

}
