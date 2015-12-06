package lessons;

public class Lesson1 {

    public static MinMaxContainer findMinMax(int[] array){

        MinMaxContainer container = new MinMaxContainer();

        container.min = array[0];
        container.max = array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i] < container.min) {container.min = array[i];}
            if(array[i] > container.max) {container.max = array[i];}

        }
        return container;

    }

}
