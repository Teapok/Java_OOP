import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class main {
	
	public static void main(String[] args) {
		
		First();
		Second();
		Third();
		Fourth("1, 2, 3, 4, 4, 5");
		Fifth();
		Sixth();
		
	}
	
	static void First() {
		//a)
		var DynMass = CreateHBoxList();
		//á)
		//Method 1
		for(HeavyBox item : DynMass){
			System.out.print(item.mass() + "\n");
		}
		//â)
		DynMass.getFirst().ChangeWeight(1);
		//ã)
		DynMass.remove(DynMass.getLast());
		//ä)
			Second();
		//å)
		DynMass.clear();
	}
	
	static void Second() {
		var DynMass = CreateHBoxList();
		
		//Method 1
		System.out.println("Method 1");
		for(HeavyBox item : DynMass){
			System.out.print(item.mass() + "\n");
		}
		//Method 2
		System.out.println("Method 2");
		Iterator<HeavyBox> iter = DynMass.listIterator();
		while(iter.hasNext()){
            System.out.println(iter.next().mass());
        }
		//Method 3
		System.out.println("Method 3");
		Stream<Integer> stream = Stream.of(DynMass.getFirst().mass());
		stream.parallel().forEach(s->System.out.println(s));
	}
	
	static void Third() {
		var DynMass = CreateHBoxList();
		TreeSet<HeavyBox> HevBoxTree = new TreeSet<HeavyBox>(DynMass);
		for(HeavyBox item : HevBoxTree){
			System.out.print(item.mass() + "\n");
		}
	}
	
	static void Fourth(String str) {
		Set<Integer> numbersSet = new HashSet<>();
		
		Matcher m = Pattern.compile("[0-9]+").matcher(str);
        while (m.find()) {
            numbersSet.add(Integer.valueOf(str.substring(m.start(), m.end())));
        }
        for (Integer number : numbersSet) {
            System.out.print(number + " ");
        }
	}
	
	static void Fifth() {
		var DynMass = CreateHBoxList();
		ArrayDeque<HeavyBox> Hboxes = new ArrayDeque<HeavyBox>();
		DynMass.forEach(s->Hboxes.offer(s)); // using offer
		DynMass.forEach(s->Hboxes.poll()); // using poll
	}
	
	static void Sixth() {
		var DynMass = new LinkedList<HeavyBox>();
		for(int i = 150; i<=450;i+=50)
			DynMass.add(new HeavyBox(i));
		
		sort(DynMass,300).forEach(s->System.out.println(s.mass()));
	}
	
	static LinkedList<HeavyBox> sort(LinkedList<HeavyBox> boxes, int weight) {
		LinkedList<HeavyBox> resultList = new LinkedList<>();
        Iterator<HeavyBox> iterator = boxes.listIterator();
        while (iterator.hasNext()) {
            HeavyBox currentBox = iterator.next();
            if (currentBox.mass() > weight) {
                resultList.add(currentBox);
                iterator.remove();
            }
        }
        return resultList;
    }
	
	
	static LinkedList<HeavyBox> CreateHBoxList(){
		var DynMass = new LinkedList<HeavyBox>();
		for(int i = 2; i<6;i++)
			DynMass.add(new HeavyBox(i));
		return DynMass;
	}
}