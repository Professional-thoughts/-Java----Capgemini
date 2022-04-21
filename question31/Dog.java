	package question31;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class Dog {
	String name;
	int age;
	int weight;
	
	Dog(String name, int age, int weight){
	this.name=name;
	this.age=age;
	this.weight=weight;
	}
	public String getName() {
	return this.name;
	}
	public int getAge() {
	return this.age;
	}
	public int getWeight() {
	return this.weight;
	}
	public void setName(String name) {
	this.name=name;
	}
	public void setAge(int age) {
	this.age=age;
	}
	public void setWeight(int weight) {
	this.weight=weight;
	}
	@Override
	public String toString() {
	return "Dog{name='"+name+"', age="+age+", weight="+weight+"}";
	}
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<Dog> list = new ArrayList<Dog>();
	list.add(new Dog("German Shepherd ", 20, 35));
	list.add(new Dog("Labrador ", 5, 40));
	list.add(new Dog("Pitbull ", 29, 100));
	list.add(new Dog("Poodle", 10, 45));
	Implementation imp=new Implementation();
	System.out.println(imp.filterByAgeAndWeight(list));
	System.out.println(imp.separateWithDelimeter(list));
	
	
	
	}
	
	}
	
	class Implementation{
	public List<Dog> filterByAgeAndWeight(List<Dog> listDog){
	int i=0;
	List<Dog> list =new ArrayList<Dog>();
	for(Dog dog : listDog) {
	if(listDog.get(i).getAge()>10 && listDog.get(i).getWeight()>25) {
	list.add(dog);
	}
	i++;
	}
	return list;
	}
	public String separateWithDelimeter(List<Dog> listDog) {
	StringBuilder str=new StringBuilder();
	int n=listDog.size();
	str.append(listDog.get(0));
	for(int i=1;i<n;i++) {
	str.append("$~$~");
	str.append(listDog.get(i));
	}
	return str.toString();
	
	}
	}
