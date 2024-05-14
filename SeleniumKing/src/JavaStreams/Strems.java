package JavaStreams;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Strems {
	@Test
	public void Regular() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Viswa");
		name.add("Hari");
		name.add("King");
		name.add("Ram");
		int count = 0;
		for (int i = 0; i < name.size(); i++) {
			String na = name.get(i);
			if (na.startsWith("H")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void Streams() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Viswa");
		name.add("Hari");
		name.add("King");
		name.add("Ram");

		Long c = name.stream().filter(a -> a.startsWith("K")).count();
		System.out.println(c);

	}
	
	
	@Test
	public void StreamList() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Viswa");
		name.add("Hari");
		name.add("King");
		name.add("Ram");

		//with out aray list	
	Long d=	Stream.of("Viswa","Hari","King","Ram").filter(s->
	{
	s.startsWith("R");
	return true;
	}).count();
		System.out.println(d);
		//print names >4
	name.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	
	name.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
	
	//name.stream().forEach(System.out::println);

}
}