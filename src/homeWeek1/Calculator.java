package homeWeek1;

//- сложение двух чисел
//        - вычитание двух чисел
//        - умножение двух чисел
//        - деление двух чисел

public class Calculator {

    public int execute(String operation) {

        int result = 0;
        operation.trim();

        int indexOp = operation.indexOf("*");
        int indexDiv = operation.indexOf("/");
        if (indexOp == -1 && indexDiv == -1) {

            result += sumOrDiff(operation);

        }

        return result;

    }

    private static int sumOrDiff(String operation) {

        operation.trim();
        operation = operation.replaceAll("-", "+-");
        if (operation.charAt(0) == '+') {
            operation = operation.substring(1);
        }

        String[] adds = operation.split("\\+");
        int result = 0;
        for (int i = 0; i < adds.length; i++) {

            result += Integer.parseInt(adds[i].trim());

        }

        return result;
//        int result = sum(adds[0]);
//        for (int i = 1; i < adds.length; i++) {
//
//            result -= sum(adds[i]);
//
//        }
//
//        return result;

    }

//    private static int sum(String operation) {
//
//        operation.trim();
//
//        String[] adds = operation.split("\\+");
//        int result = 0;
//        for (int i = 0; i < adds.length; i++) {
//
//            result += Integer.parseInt(adds[i].trim());
//
//        }
//
//        return result;
//    }
}
//    int indexSum = operation.indexOf("+");
//    int indexDiff = operation.indexOf("-");
//while (indexSum >= 0 || indexDiff >= 0){
//
//        if (indexDiff==-1) {
//
//        String operand = operation.substring(0, indexSum).trim();
//        result += Integer.parseInt(operand) + sumOrDiff(operation.substring(indexSum + 1));
//
//        }
//        if (indexSum < indexDiff) {
//
//        String operand = operation.substring(0, indexSum).trim();
//        result += Integer.parseInt(operand) + sumOrDiff(operation.substring(indexSum + 1));
//        }
//        }
