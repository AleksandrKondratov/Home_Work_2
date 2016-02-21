package Home_Work_2;

/**
 * Created by user on 21.02.16.
 */
public class Zadanie_8 {
    public void Execute(){
        Student Sasha = new Student();
        Sasha.setAge(19);
        System.out.println(Sasha.getAge());
        Sasha.setWeight(80);
        System.out.println(Sasha.getWeight());
        Sasha.setHeight(185);
        System.out.println(Sasha.getHeight());
        Sasha.setYear(1996);
        System.out.println(Sasha.getYear());
    }
}
class Student {
    private int data = 0;

    public void setAge(int age) {
        data &= 0b0000011111111111111111111111111;
        age <<= 26;
        data |= age;
    }

    public int getAge() {
        int age = data >> 26;
        return age;
    }

    public void setWeight(int weight) {
        data &= 0b1111100000001111111111111111111;
        weight <<= 19;
        data |= weight;
    }

    public int getWeight() {
        int weight = data >> 19;
        weight &= 0b0000000000000000000000001111111;
        return weight;
    }

    public void setHeight(int height) {
        data &= 0b1111111111110000000011111111111;
        height <<= 11;
        data |= height;
    }

    public int getHeight() {
        int height = data >> 11;
        height &= 0b0000000000000000000000011111111;
        return height;
    }

    public void setYear(int year) {
        data &= 0b1111111111111111111100000000000;
        data |= year;
    }

    public int getYear() {
        int year = data;
        year &= 0b0000000000000000000011111111111;
        return year;
    }
}
