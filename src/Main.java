public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog+4;
        System.out.println(dog);
        cat = cat+4;
        System.out.println(cat);
        paper = paper+4;
        System.out.println(paper);
        dog = dog-3;
        System.out.println(dog);
        cat = cat-1.6;
        System.out.println(cat);
        paper =paper-7639;
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var weightBoxer1=78.2;
        System.out.println(weightBoxer1);
        var weightBoxer2=82.7;
        System.out.println(weightBoxer2);
        var totalWeight=weightBoxer1+weightBoxer2;
        System.out.println("Общий вес двух бойцов "+ totalWeight +" кг.");
        var weightDifference= weightBoxer2-weightBoxer1;
        System.out.println("Разница в весе бойцов составляет " + weightDifference +" кг.");
        var weightDifference2=(weightBoxer2-weightBoxer1)%totalWeight;
        System.out.println("Разница в весе бойцов " + weightDifference2 +" кг");


        var totalHours=640;
        System.out.println(totalHours);
        var workTime1Stuff=8;
        System.out.println(workTime1Stuff);
        var totalStuff=totalHours/workTime1Stuff;
        System.out.println("Всего работников в компании - " + totalStuff + " человек");
        var totalStuff2=totalStuff+94;
        System.out.println(totalStuff2);
        var newWorkTime1Stuff=totalHours/totalStuff2;
        System.out.println("Если в компании работает " + totalStuff2 + " человека, то всего по " + newWorkTime1Stuff + " часа работы может быть поделено между сотрудниками");




    }


}