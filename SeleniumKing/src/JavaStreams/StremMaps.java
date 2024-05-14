package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StremMaps {

	//@Test
//	public void maps() {
//		// print the names which have last letter of "a" with upper case
//		Stream.of("Viswa", "Hari", "King", "Ram").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
//				.forEach(s -> System.out.println(s));
//
//		// print the names which have first letter as "a" with upper case and shorted
//		// create arey list
//		List<String> names = Arrays.asList("Viswa", "Hari", "King", "Ram");
//		names.stream().filter(s -> s.contains("a")).sorted().map(s -> s.toUpperCase())
//				.forEach(s -> System.out.println(s));
//
//		// merge to array list
//		List<String> names1 = Arrays.asList("Viswa", "Hari", "King", "Ram");
//		List<String> names2 = Arrays.asList("ramesh", "kittu", "naveen", "sham");
//		names1.stream().filter(s -> s.matches("i")).forEach(s -> System.out.println(s));
//		Stream<String> namesStrem = Stream.concat(names1.stream(), names2.stream());
//		// namesStrem.sorted().forEach(s->System.out.println(s));
//		boolean b = namesStrem.anyMatch(s -> s.equalsIgnoreCase("kittu"));
//		System.out.println(b);
//		Assert.assertTrue(b);
//
//	}
	@Test
	public void streamCollect() {
		//
//		List<String> li	=Stream.of("Viswa", "Hari", "King", "Ram").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
//		.collect(Collectors.toList());
//		System.out.println(li.get(0));
//		
		
		List<Integer> in = Arrays.asList(2,8,9,6,3,5,2,8,2,8);
		
		
		//in.stream().distinct().forEach(s->System.out.println(s));
		List<Integer>   li= in.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
