package leetcode.ciof2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @Author: YangGC
 * DateTime: 04-17
 */
public class Test {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(1L,"小明",1,10);
        Person person2 = new Person(2L,"小红",2,11);
        Person person4 = new Person(3L,"小huang",2,10);
        Person person3 = new Person(3L,"小兰",2,10);

        personList.add(person4);
        personList.add(person3);
        personList.add(person2);
        personList.add(person1);
//        personList.forEach(temp-> System.out.println(temp.toString()));
        List2Map(personList);
    }


    public static void List2Map(List<Person> list){
//        Map<Long, Person> collect = list.stream().collect(Collectors.toMap(Person::getId, Function.identity(), (key1, key2) -> key2));
        list.stream().collect(Collectors.toMap(Person::getId,Person::getName,(key1,key2)->key2));
        //适用一个key对应多个对象(用的频率较高)
        Map<Long, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getId));

        collect.forEach((key,val)->{
            System.out.println("key->"+key);
            System.out.println("val->"+val);
        });


    }
















    private static class Person {
        private Long id;
        private String name;
        private Integer age;
        private Integer level;

        public Person() {
        }

        public Person(Long id, String name, Integer age, Integer level) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.level = level;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", level=" + level +
                    '}';
        }
    }
}
