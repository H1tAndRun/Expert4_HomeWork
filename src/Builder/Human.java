package Builder;
//Экспертный уровень:
//Задача №1
// Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
// Для этого шаблона характерно:
// 1. приватный конструктор,
// 2. вложенный статический класс (HumanBuilder)
// 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
// Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
// 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
// которые вызывают сеттеры у экземпляра класса Human.
// 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
// Ожидаемый результат
// Human human = Human.builder().name("Петр").age(20).weight(80).build();
// human.info()
// Петр - возраст 20, вес 80

public class Human {
    private  int age;
    private  String name;
    private  int weight;

    public void ihfo(){
        System.out.println(name+ " - "+ "возраст "+age +", вес "+weight);
    }
    public static HumanBuilder builder(){
        return new HumanBuilder();
    }
    private Human() {

    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    static  class HumanBuilder {
       private Human human=new Human();


        public HumanBuilder age(int age) {
            human.setAge(age);
            return this;
        }

        public HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }

        public HumanBuilder weight(int weight) {
            human.setWeight(weight);
            return this;
        }
        public Human build(){
            return human;
        }
    }



}
