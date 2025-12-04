package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class test4 {
	static List<Person> persons = new ArrayList<Person>();
	static {
		randomPerson();
	}
	public static void main(String[] args) {
		//persons.sort(Comparator.comparingInt(Person::getAge));
//		Collections.sort(persons, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
//		persons.sort(new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge()-o2.getAge();
//			}
//		});
		//persons.sort((o1,o2)->o1.getAge()-o2.getAge());
		for (Person person : persons)
		{
			person.display();
		}
	}
	static public void randomPerson() {
		Random r = new Random();
		for (int i = 0 ; i < 30 ;++i)
		{
			char str1 = (char) ('a'+ r.nextInt(24));
			char str2 = (char) ('a'+ r.nextInt(24));
			char[] str0 = {str1,str2};
			String str = String.valueOf(str0);
			persons.add(new Person(str, r.nextInt(100)+1));
		}
	}
}
